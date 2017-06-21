<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
    <%@include file="navbar.jsp" %>
    <div class="container-fluid">
        <div class="row title">
            <div class="col-md-12">
                <h1>${poll.getName()}</h1>
            </div>
            <div class="col-md-12">
                <h2 class="text-muted">${poll.getDescription()}</h2>
            </div>
            <div class="col-md-12">
                <c:if test="${poll.getNbResults() > 1}">
                    <h3>${poll.getNbResults()} votes</h3>
                </c:if>
                <c:if test="${poll.getNbResults() < 2}">
                    <h3>${poll.getNbResults()} vote</h3>
                </c:if>
            </div>
        </div>
        <div class="row">
            <c:forEach var="response" items="${poll.getResponses()}" >
                <div class="col-md-6 col-md-offset-3">
                    <c:if test='${response.hasAnswered(pseudo, age) == true}'>
                        <c:set value="panel-selected" var="selected"></c:set>
                    </c:if>
                    <c:if test='${response.hasAnswered(pseudo, age) == false}'>
                        <c:remove var="selected"></c:remove>
                    </c:if>
                    <div class="panel panel-default ${selected}">
                        <div class="panel-body">
                            <span>
                                ${response.getValue()}
                            </span>
                            <c:if test='${poll.hasAnswered(pseudo, age) == false}'>
                                <form action="/poll/${poll.getId()}" method="POST">
                                    <input type="number" name="resultId" value="${response.getId()}" class="hidden"/>
                                    <input type="submit" class="btn btn-primary pull-right" value="Voter"/>
                                </form>
                            </c:if>
                            <c:if test='${poll.hasAnswered(pseudo, age) == true}'>
                                <span class="pull-right">
                                    <c:if test="${response.getResults().size() > 1}">
                                        <strong>${response.getResults().size()} votes</strong>
                                    </c:if>
                                    <c:if test="${response.getResults().size() < 2}">
                                        <strong>${response.getResults().size()} vote</strong>
                                    </c:if>
                                </span>
                                <div class="progress" style="position:relative;top:15px;">
                                    <div class="progress-bar progress-bar-info progress-bar-striped active" role="progressbar"
                                         aria-valuenow="${Math.round((response.getResults().size() / poll.getNbResults()) * 100)}" aria-valuemin="0" aria-valuemax="100" style="width:${Math.round((response.getResults().size() / poll.getNbResults()) * 100)}%">
                                        <c:if test="${Math.round((response.getResults().size() / poll.getNbResults()) * 100) > 0}">
                                            ${Math.round((response.getResults().size() / poll.getNbResults()) * 100)} %
                                        </c:if>
                                    </div>
                                </div>
                            </c:if>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <a href="/polls" class="btn btn-danger btn-back">
            <i class="glyphicon glyphicon-chevron-left"></i> Retour
        </a>
    </div>
</body>
<script src="../assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="../assets/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript">
    $("button").click(function(event) {
        $("button").hide();
        event.target.parentNode.parentNode.classList.add("panel-selected")
    })
</script>
</html>
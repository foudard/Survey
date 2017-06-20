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
                <h2>${poll.getNbResults()} vote(s)</h2>
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
                                    <strong>${response.getResults().size()} vote(s)</strong>
                                </span>
                                <div class="progress" style="position:relative;top:15px;">
                                    <div class="progress-bar progress-bar-info progress-bar-striped active" role="progressbar"
                                         aria-valuenow="${Math.round((response.getResults().size() / poll.getNbResults()) * 100)}" aria-valuemin="0" aria-valuemax="100" style="width:${Math.round((response.getResults().size() / poll.getNbResults()) * 100)}%">
                                            ${Math.round((response.getResults().size() / poll.getNbResults()) * 100)} %
                                    </div>
                                </div>
                            </c:if>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
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
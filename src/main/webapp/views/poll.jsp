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
                <h2>1174 votes</h2>
            </div>
        </div>
        <div class="row">
            <c:forEach var="response" items="${poll.getResponses()}" >
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <span>
                                ${response.getValue()}
                            </span>
                            <span>
                                <strong>(458 votes)</strong>
                            </span>
                            <form action="/poll/${poll.getId()}" method="POST">
                                <input type="number" name="resultId" value="${response.getId()}" class="hidden"/>
                                <input type="submit" class="btn btn-primary pull-right" value="Voter"/>
                            </form>
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
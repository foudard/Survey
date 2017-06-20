<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
    <%@include file="navbar.jsp" %>
    <div class="container-fluid">
        <div class="row">
            <c:forEach var="poll" items="${polls}" >
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-default">
                        <div class="panel-body">
                        <span>
                            ${poll.getName()}
                        </span>
                            <span>
                            <strong> - ${poll.getNbResults()} vote(s)</strong>
                        </span>
                            <a href="/poll/${poll.getId()}"><input type="submit" class="btn btn-primary pull-right" value="Participer" /></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
<%@include file="footer.jsp" %>
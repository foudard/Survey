<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
<%@include file="navbar.jsp" %>
<div class="container-fluid">
    <div class="row">
        <h2 class="title text-muted text-center">G&eacute;rer les sondages</h2>
        <c:forEach var="poll" items="${polls}" >
            <c:if test="${poll.getClosed() == false}">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <span>
                                    ${poll.getName()}
                            </span>
                            <span>
                                <c:if test="${poll.getNbResults() > 1}">
                                    <strong> - ${poll.getNbResults()} votes</strong>
                                </c:if>
                                <c:if test="${poll.getNbResults() < 2}">
                                    <strong> - ${poll.getNbResults()} vote</strong>
                                </c:if>
                            </span>
                            <a href="/poll/delete/${poll.getId()}" class="btn btn-danger pull-right">Clôturer</a>
                            </form>
                        </div>
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </div>
</div>
</body>
<%@include file="footer.jsp" %>
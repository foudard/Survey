<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
    <%@include file="navbar.jsp" %>
    <div class="container-fluid">
        <div class="row">
            <h2 class="title text-muted text-center">Liste des sondages</h2>
            <c:forEach var="poll" items="${polls}" >
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
                            <c:if test='${poll.hasAnswered(pseudo, age) == false}'>
                                <a href="/poll/${poll.getId()}"><input type="submit" class="btn btn-primary pull-right show-poll" value="Participer" /></a>
                            </c:if>
                            <c:if test='${poll.hasAnswered(pseudo, age) == true}'>
                                <a href="/poll/${poll.getId()}"><input type="submit" class="btn btn-info pull-right show-poll" value="Voir les résultats" /></a>
                            </c:if>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <a href="/" class="btn btn-danger btn-back">
            <i class="glyphicon glyphicon-chevron-left"></i> Retour
        </a>
    </div>
</body>
<%@include file="footer.jsp" %>
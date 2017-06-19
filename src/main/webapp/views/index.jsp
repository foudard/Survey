<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
    <header>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">Survey</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <c:if test="${userLogged == 'anonymousUser'}">
                            <li><a href="/login">Connexion</a></li>
                        </c:if>
                        <c:if test="${userLogged != 'anonymousUser'}">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user-circle"></i> ${userLogged.getLogin()} <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <c:if test="${userLogged.getRole().getName() == 'admin'}">
                                        <li><a href="/user/add">Ajouter un rédacteur</a></li>
                                        <li><a href="/poll/add">Créer un sondage</a></li>
                                    </c:if>
                                    <c:if test="${userLogged.getRole().getName() == 'writer'}">
                                        <li><a href="/user/add">Créer un nouveau sondage</a></li>
                                    </c:if>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="/logout">Deconnexion</a></li>
                                </ul>
                            </li>
                        </c:if>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
    </header>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form action="/polls" method="POST">
                    <div class="form-group">
                        <label for="pseudo">Pseudo</label>
                        <input class="form-control" id="pseudo" name="pseudo" type="text" placeholder="Pseudo" required/>
                    </div>
                    <div class="form-group">
                        <label for="age">Age</label>
                        <input class="form-control" id="age" name="age" type="number" placeholder="Age" required/>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary getIn" value="Participer"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
<%@include file="footer.jsp" %>
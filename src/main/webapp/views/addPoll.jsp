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
            <form action="/poll/add" method="POST">
                <div class="form-group">
                    <label for="name">Nom du sondage</label>
                    <input class="form-control" id="name" name="name" type="text" placeholder="Nom du sondage" required/>
                </div>
                <div class="form-group">
                    <label for="description">Description</label>
                    <textarea class="form-control" id="description" name="description" type="text" placeholder="Description" required></textarea>
                </div>
                <div class="form-group">
                    <label for="begin-date">Date début</label>
                    <input class="form-control" id="begin-date" name="begin_date" type="date" required />
                </div>
                <div class="form-group">
                    <label for="end-date">Date de fin</label>
                    <input class="form-control" id="end-date" name="end_date" type="date" required />
                </div>
                <div class="form-group">
                    <label>Nombre de réponse</label><br>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="1">1</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="2">2</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="3">3</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="4">4</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="5">5</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="6">6</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="7">7</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="8">8</label>
                    <label class="radio-inline"><input type="radio" name="nb_res" value="9">9</label>
                </div>
                <div class="form-group">
                    <input class="form-control response" name="res_1" type="text" placeholder="Réponse 1" required/>
                    <input class="form-control response" name="res_2" type="text" placeholder="Réponse 2"/>
                    <input class="form-control response" name="res_3" type="text" placeholder="Réponse 3"/>
                    <input class="form-control response" name="res_4" type="text" placeholder="Réponse 4"/>
                    <input class="form-control response" name="res_5" type="text" placeholder="Réponse 5"/>
                    <input class="form-control response" name="res_6" type="text" placeholder="Réponse 6"/>
                    <input class="form-control response" name="res_7" type="text" placeholder="Réponse 7"/>
                    <input class="form-control response" name="res_8" type="text" placeholder="Réponse 8"/>
                    <input class="form-control response" name="res_9" type="text" placeholder="Réponse 9"/>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary getIn" value="Créer"/>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script src="../assets/js/poll.js"></script>
<%@include file="footer.jsp" %>
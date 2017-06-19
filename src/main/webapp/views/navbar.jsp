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
                                    <li><a href="/user/add">Ajouter un r&eacute;dacteur</a></li>
                                </c:if>
                                <c:if test="${userLogged.getRole().getName() == 'writer'}">
                                    <li><a href="/user/add">Cr&eacute;er un nouveau sondage</a></li>
                                </c:if>
                                <li role="separator" class="divider"></li>
                                <li><a href="/logout">D&eacute;connexion</a></li>
                            </ul>
                        </li>
                    </c:if>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</header>
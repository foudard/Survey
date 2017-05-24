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
                        <li><a href="/login">Connexion</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
    </header>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="alert alert-info">
                    <strong>Information !</strong> Seuls les administrateurs et rédacteurs du site peuvent s'y connecter.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form method="POST" action="/login.do">
                    <div class="form-group">
                        <label for="login">Login</label>
                        <input class="form-control" id="login" name="login" type="text" placeholder="Login" require/>
                    </div>
                    <div class="form-group">
                        <label for="password">Mot de passe</label>
                        <input class="form-control" id="password" name="password" type="password" placeholder="Mot de passe" required/>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary getIn" value="Se connecter"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
<%@include file="footer.jsp" %>
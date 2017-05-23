<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey</title>
    <link rel="stylesheet" href="../../assets/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="../../assets/css/app.css" type="text/css">
</head>
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
                    <a class="navbar-brand" href="index.jsp">Survey</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="login.jsp">Connexion</a></li>
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
                <form>
                    <div class="form-group">
                        <label for="login">Login</label>
                        <input class="form-control" id="login" type="text" placeholder="Login" require/>
                    </div>
                    <div class="form-group">
                        <label for="password">Mot de passe</label>
                        <input class="form-control" id="password" type="password" placeholder="Mot de passe" required/>
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary getIn">Se connecter</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
<script src="../../assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="../../assets/js/bootstrap.min.js" type="text/javascript"></script>
</html>
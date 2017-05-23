<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey</title>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="../assets/css/app.css" type="text/css">
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
                <a class="navbar-brand" href="/">Survey</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/polls">Liste des sondages</a></li>
                    <li><a href="/login">Connexion</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</header>

<div class="container-fluid">
    <div class="row">
        <form action="/poll" method="POST">
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <span>
                            Quel est votre genre cinématographique préféré ?
                        </span>
                        <span>
                            <strong>1154 votes</strong>
                        </span>
                        <input type="submit" class="btn btn-primary pull-right" value="Participer" />
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <span>
                            Sport ou Jeux vidéos ?
                        </span>
                        <span>
                            <strong>753 votes</strong>
                        </span>
                        <input type="submit" class="btn btn-primary pull-right" value="Participer" />
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <span>
                            Fait-il beau aujourd'hui ?
                        </span>
                        <span>
                            <strong>26 votes</strong>
                        </span>
                        <input type="submit" class="btn btn-primary pull-right" value="Participer" />
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script src="../assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="../assets/js/bootstrap.min.js" type="text/javascript"></script>
</html>
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
    <div class="row title">
        <div class="col-md-12">
            <h1>Quel est votre genre cinématographique préféré ?</h1>
        </div>
        <div class="col-md-12">
            <h2>1174 votes</h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    <span>
                        Action / Aventure
                    </span>
                    <span>
                        <strong>(458 votes)</strong>
                    </span>
                    <button class="btn btn-primary pull-right">Voter</button>
                </div>
            </div>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    <span>
                        Science Fiction
                    </span>
                    <span>
                        <strong>(392 votes)</strong>
                    </span>
                    <button class="btn btn-primary pull-right">Voter</button>
                </div>
            </div>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    <span>
                        Comédie
                    </span>
                    <span>
                        <strong>(317 votes)</strong>
                    </span>
                    <button class="btn btn-primary pull-right">Voter</button>
                </div>
            </div>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    <span>
                        Policier
                    </span>
                    <span>
                        <strong>(206 votes)</strong>
                    </span>
                    <button class="btn btn-primary pull-right">Voter</button>
                </div>
            </div>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    <span>
                        Horreur
                    </span>
                    <span>
                        <strong>(153 votes)</strong>
                    </span>
                    <button class="btn btn-primary pull-right">Voter</button>
                </div>
            </div>
        </div>
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
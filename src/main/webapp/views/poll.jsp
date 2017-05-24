<%@include file="header.jsp" %>

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
<%@include file="header.jsp" %>
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
<%@include file="footer.jsp" %>
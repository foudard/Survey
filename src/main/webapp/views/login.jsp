<%@include file="header.jsp" %>
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
<%@include file="footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
    <%@include file="navbar.jsp" %>
    <div class="container-fluid container-center">
        <div class="tpl-center">
            <h2 class="title text-muted text-center">Connectez-vous !</h2>
            <div class="col-md-6">
                <div class="alert alert-info">
                    <strong>Information !</strong> Seuls les administrateurs et rédacteurs du site peuvent s'y connecter.
                </div>
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
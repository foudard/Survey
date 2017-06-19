<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
<%@include file="navbar.jsp" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form method="POST" action="/user/add">
                <div class="form-group">
                    <label for="login">Login</label>
                    <input class="form-control" id="login" name="login" type="text" placeholder="Login" require/>
                </div>
                <div class="form-group">
                    <label for="password">Mot de passe</label>
                    <input class="form-control" id="password" name="password" type="password" placeholder="Mot de passe" required/>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary getIn" value="Ajouter"/>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<%@include file="footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<body>
    <%@include file="navbar.jsp" %>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form action="/polls" method="POST">
                    <div class="form-group">
                        <label for="pseudo">Pseudo</label>
                        <input class="form-control" id="pseudo" name="pseudo" type="text" placeholder="Pseudo" required/>
                    </div>
                    <div class="form-group">
                        <label for="age">Age</label>
                        <input class="form-control" id="age" name="age" type="number" placeholder="Age" required/>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary getIn" value="Participer"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
<%@include file="footer.jsp" %>
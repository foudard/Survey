<%@include file="header.jsp" %>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <form action="/polls" method="POST">
                    <div class="form-group">
                        <label for="pseudo">Pseudo</label>
                        <input class="form-control" id="pseudo" name="pseudo" type="text" placeholder="Pseudo" required/>
                    </div>
                    <div class="form-group">
                        <label for="age">Âge</label>
                        <input class="form-control" id="age" name="age" type="number" placeholder="Âge" required/>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary getIn" value="Participer"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
<%@include file="footer.jsp" %>
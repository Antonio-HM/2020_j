<%-- 
    Document   : home
    Created on : 01-17-2020, 08:38:55 PM
    Author     : Kamus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/component/menu.jsp"/>
        <div class="container">
            <form  method="post" action="">  

                <div class="row">
                    <div class="card-action red white-text  center">
                        <h3>Control de Coperativa</h3>
                    </div>    
                </div>
                <a class="waves-effect waves-light btn modal-trigger" href="#modal1">nuevo registro</a>
                <div id="modal1" class="modal">
                    <div class="modal-content center">
                        <h4>nuevo Cliente</h4>
                    </div>
                    <div class="row">
                        <div class="col m3 right-align"><i class="material-icons">person_add</i>nombre</div>   
                        <div class="col m3">
                            <input  type="text" name="txtname" >
                        </div> 
                        <div class="col m3"></div>   
                        <div class="col m3"></div>   
                    </div>
                    <div class="row">
                        <div class="col m3 right-align"> <i class="material-icons">person_add</i>apellido</div>   
                        <div class="col m3"> 
                            <input type="text" name="txtapellido"
                        </div> 
                        <div class="col m3"> </div>   
                        <div class="col m3"> </div>   
                    </div>
                    <div class="row">
                        <div class="col m3 right-align "><i class="material-icons">tab</i> DUI</div>   
                        <div class="col m3"> 
                            <input type="text" name="txttel">
                        </div> 
                        <div class="col m3"> </div>   
                        <div class="col m3"> </div>   
                    </div>
                    <div class="row">
                        <div class="col m3 right-align"> <i class="material-icons">place</i>direccion</div>   
                        <div class="col m3">
                            <input type="text" name="txtdireccion">
                        </div> 
                        <div class="col m3"> </div>   
                        <div class="col m3"> </div>   
                    </div>
                    <div class="row">
                        <div class="col m3 right-align"><i class="material-icons">contact_phone</i> telefono</div>   
                        <div class="col m3"> 
                            <input type="text" name="txttel">
                        </div> 
                        <div class="col m3"> </div>   
                        <div class="col m3"> </div>   
                    </div>
                    <div class="modal-footer">
                        <a href="control?action=home" class="modal-close waves-effect waves-green btn-flat"> <i class="material-icons">collections</i>Agree</a>
                    </div>            
                </div>
            </form>
            <script src="resources/js/jquery-3.4.1.min.js" type="text/javascript"></script>
            <script src="resources/js/materialize.js" type="text/javascript"></script>
            <script src="resources/js/modal y select.js" type="text/javascript"></script>
        </div>
    </body>
</html>

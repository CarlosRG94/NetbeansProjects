<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>Introduce el radio de la esfera</div>
        <form action="index.jsp" method="POST">
            <input type="text" name="radio" value="1" />
            <input type="submit" value="Calcular" />
        </form>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                esfera.com.CalcularVolumenEsfera_Service service = new esfera.com.CalcularVolumenEsfera_Service();
                esfera.com.CalcularVolumenEsfera port = service.getCalcularVolumenEsferaPort();
                
                // TODO initialize WS operation arguments here
                java.lang.Double radio = Double.valueOf(request.getParameter("radio"));
                
                // TODO process result here
                if (radio <= 0) {
                    out.println("El radio tiene que mayor que 0");
                } else {
                    java.lang.Double result = port.volumen(radio);
                    out.println("El volumen de la esfera es = " + result);
                }
            } catch (Exception ex) {
                
            }
        %>
        <%-- end web service invocation --%><hr/>
</html>


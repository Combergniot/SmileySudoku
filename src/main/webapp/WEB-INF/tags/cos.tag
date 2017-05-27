<%@ attribute name="x" type="java.lang.Integer" %>
<%@ attribute name="y" type="java.lang.Integer" %>
<%@ attribute name="tabela" type="model.PointAndClick" %>


<% if (tabela.getField(x, y)== 0) { %>
 <a href="kot?x=${x}&y=${y}">&nbsp;</a>
 <% } %>
 <% if (tabela.getField(x, y)== 2) { %>
 O
 <% } %>
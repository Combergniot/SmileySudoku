<%@ attribute name="x" type="java.lang.Integer" %>
<%@ attribute name="y" type="java.lang.Integer" %>
<%@ attribute name="tabela" type="model.PointAndClick" %>


<% if (tabela.getField(x, y)== 0) { %>
 <a href="kot?x=${x}&y=${y}"><img src="img/baby.jpg" style="width:50px; height:50px" /></a>

 <% } %>
 <% if (tabela.getField(x, y)== 1) { %>
<a href="kot?x=${x}&y=${y}"><img src="img/angrysmiley.jpg" style="width:50px; height:50px" /></a>

 <% } %>

 <% if (tabela.getField(x, y)== 2) { %>

<a href="kot?x=${x}&y=${y}"><img src="img/drunk.jpg" style="width:50px; height:50px" /></a>
  <% } %>

  <% if (tabela.getField(x, y)== 3) { %>
  <a href="kot?x=${x}&y=${y}"><img src="img/palacz.jpg" style="width:50px; height:50px" /></a>

   <% } %>

     <% if (tabela.getField(x, y)== 4) { %>
<a href="kot?x=${x}&y=${y}"><img src="img/smiley.gif" style="width:50px; height:50px" /></a>

      <% } %>
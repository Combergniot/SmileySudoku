<%@ page import="model.PointAndClick" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="def" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Kot 2.0</title>
    <style>
    tr {text-align: center;}
    td {text-align: center;}

    body { text-align: center;}

    table {
      margin:1em auto;
    }
    td {
      height:30px;
      width:30px;
      border:1px solid;
      text-align:center;
    }
    td:first-child {
      border-left:solid;
    }
    td:nth-child(3n) {
      border-right:solid ;
    }
    tr:first-child {
      border-top:solid;
    }
    tr:nth-child(3n) td {
      border-bottom:solid ;
    }

    </style>



</head>
<body>


<table>
<%
  for (int i = 0 ; i < 9 ; i++) {
%>
    <tr>
<%
    for (int j = 0 ; j < 9 ; j++) {
%>
        <td>
            <def:sudoku sudokuBoard="${sudokuBoard}" x="<%=i%>" y="<%=j%>"/>
        </td>
<%
    }
%>
    </tr>
<%
    }
%>

</table>
</body>
</html>
<%@ attribute name="x" type="java.lang.Integer" %>
<%@ attribute name="y" type="java.lang.Integer" %>
<%@ attribute name="sudokuBoard" type="model.PointAndClick" %>


<% if (sudokuBoard.getSudokuBoard(x, y)== 0) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/happy.jpg" style="width:50px; height:50px"/></a>

<% } %>
<% if (sudokuBoard.getSudokuBoard(x, y)== 1) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/angrysmiley.jpg" style="width:50px; height:50px"/></a>

<% } %>

<% if (sudokuBoard.getSudokuBoard(x, y)== 2) { %>

<a href="sudoku?x=${x}&y=${y}"><img src="img/drunk.jpg" style="width:50px; height:50px"/></a>
<% } %>

<% if (sudokuBoard.getSudokuBoard(x, y)== 3) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/palacz.jpg" style="width:50px; height:50px"/></a>

<% } %>

<% if (sudokuBoard.getSudokuBoard(x, y)== 4) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/smiley.gif" style="width:50px; height:50px"/></a>

<% } %>

<% if (sudokuBoard.getSudokuBoard(x, y)== 5) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/baby.jpg" style="width:50px; height:50px"/></a>

<% } %>

<% if (sudokuBoard.getSudokuBoard(x, y)== 6) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/hungry.jpg" style="width:50px; height:50px"/></a>

<% } %>

<% if (sudokuBoard.getSudokuBoard(x, y)== 7) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/redneck.jpg" style="width:50px; height:50px"/></a>

<% } %>
<% if (sudokuBoard.getSudokuBoard(x, y)== 8) { %>
<a href="sudoku?x=${x}&y=${y}"><img src="img/sad.jpg" style="width:50px; height:50px"/></a>

<% } %>
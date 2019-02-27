<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html lang="en">
<head>
<title>HOME</title>
<!-- <link rel="stylesheet" type="text/css" href="app.css"> -->
<style type="text/css">

#container {
    border: 0px solid;
    max-width: 640px;
    padding-left: 50px;
    padding-right: 50px;
    margin: auto;
    display: block;
    overflow-x: hidden;
}
#header {
    top: 0px;
    left:50%;
    margin-left: -320px;
    position: fixed;
    background-color: grey;
    width: 640px;
    z-index: 1;
    text-align: center;
    display: block;    
}
#content {
    width: 100%;
    overflow-x: hidden;
    clear: both;
    border: 1px solid;
    margin-top: 50px;
}
.post {
    margin-bottom: 45px;
    width: 100%;
    border: 1px solid;
    margin-top: 50px;
    text-align: center;
}
</style>
</head>
<body>
	<div id="container">
    <div id="header">This Is The Header</div>
    <div id="content">
        <div class="post">
            <p>A</p>
            <p>A</p>
            <p>A</p>
            <p>A</p>
        </div>
        <div class="post">
            <p>A</p>
            <p>A</p>
            <p>A</p>
            <p>A</p>
        </div>
        <div class="post">
            <p>A</p>
            <p>A</p>
            <p>A</p>
            <p>A</p>
        </div>
    </div>
</div></body>
</html>

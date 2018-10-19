<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="https://d3js.org/d3.v4.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/seedrandom/2.4.3/lib/alea.min.js"></script>
    <script src="js/d3.layout.cloud.js"></script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div id="cloud-container"></div>
    <script src="js/wordcloud.js"></script>
    <script>
    WordCloud({
        container : '#cloud-container',
        data:'json/dummy.json'
    })
    </script>
</body>
</html>
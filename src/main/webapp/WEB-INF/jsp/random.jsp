<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Welcome</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
	<h1>Welcome</h1>
	<h2>${message}</h2>

	<a href="${pageContext.request.contextPath}/">Home</a>
	<a href="${pageContext.request.contextPath}/sticker-gallery">Sticker Gallery</a>
	<a href="${pageContext.request.contextPath}/random">Random</a>
</body>

</html>
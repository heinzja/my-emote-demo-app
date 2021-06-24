<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Welcome Page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

	<a href="${pageContext.request.contextPath}/">Home</a>
	<a href="${pageContext.request.contextPath}/sticker-gallery">Sticker
		Gallery</a>
	<a href="${pageContext.request.contextPath}/random-sticker-page">Random</a>
	<br />

	<h1>Welcome to ${page_title}</h1>
	<h2>${page_message}</h2>
	<br />

	<table>
		<tr>
			<%
			for (int i = 1; i <= 4; i++) {
			%>
			<td><a
				href="${pageContext.request.contextPath}/get-sticker?stickerName=smi1ey_sticker_<%=i %>">
					<img src="/get-sticker?stickerName=smi1ey_sticker_<%=i%>" width="100px"
					height="100px">
			</a></td>
			<%
			}
			%>
		
		<tr />
		<tr>
			<%
			for (int i = 5; i <= 8; i++) {
			%>
			<td><a
				href="${pageContext.request.contextPath}/get-sticker?stickerName=smi1ey_sticker_<%=i %>">
					<img src="/get-sticker?stickerName=smi1ey_sticker_<%=i%>" width="100px"
					height="100px">
			</a></td>
			<%
			}
			%>
		
		<tr />
		<tr>
			<%
			for (int i = 9; i <= 12; i++) {
			%>
			<td><a
				href="${pageContext.request.contextPath}/get-sticker?stickerName=smi1ey_sticker_<%=i %>">
					<img src="/get-sticker?stickerName=smi1ey_sticker_<%=i%>" width="100px"
					height="100px">
			</a></td>
			<%
			}
			%>
		
		<tr />
		<tr>
			<%
			for (int i = 13; i <= 16; i++) {
			%>
			<td><a
				href="${pageContext.request.contextPath}/get-sticker?stickerName=smi1ey_sticker_<%=i %>">
					<img src="/get-sticker?stickerName=smi1ey_sticker_<%=i%>" width="100px"
					height="100px">
			</a></td>
			<%
			}
			%>
		
		<tr />

	</table>
</body>
</html>
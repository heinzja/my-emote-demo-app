<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link
      rel="stylesheet"
      type="text/css"
      href="${pageContext.request.contextPath}/css/style.css"
    />
  </head>
  <body>
    <a href="${pageContext.request.contextPath}/">Home</a>
    <a href="${pageContext.request.contextPath}/sticker-gallery"
      >Sticker Gallery</a
    >
    <a href="${pageContext.request.contextPath}/random-sticker-page">Random</a>

    <br />
    <h1>Welcome to ${page_title}</h1>
    <h2>${page_message}</h2>
    <br />

    <a href="${pageContext.request.contextPath}/images/${sticker_name}">
      <img src="/images/${sticker_name}" width="100px" height="100px" />
    </a>
  </body>
</html>

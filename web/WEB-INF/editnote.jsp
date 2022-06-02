<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <form method="POST" action="note">
            <h2>Edit Note</h2>
            <label><b>Title: </b></label>
            <input type="text" name="title_input" value="${title}">
            <br>
            <label><b>Contents:</b></label>
            <textarea name="content_input" rows="6" cols="25">${content}</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>

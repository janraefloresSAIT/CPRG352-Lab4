<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <form method="GET" action="edit">
            <h2>Edit Note</h2>
            <label><b>Title:</b></label>
            <input type="text" name="title_input" value="">
            <br>
            <label><b>Contents:</b></label>
            <textarea name="content_input" rows="4" cols="50"></textarea>
        </form>
    </body>
</html>

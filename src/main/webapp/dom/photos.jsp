<%@page contentType="text/html;UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Jay Skript and the Domsters</title>
    <script src="js/modernizr-custom.js"></script>
    <link rel="stylesheet" media="screen" href="css/basic.css"/>
    <script type="text/javascript" src="js/global.js"></script>
    <script type="text/javascript" src="js/photos.js"></script>
</head>
<body>
<header>
    <img src="images/logo.gif" alt="Jay Skript and the Domsters">
    <nav>
        <ul>
            <li><a href="home.jsp">home</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><a href="photos.jsp">Photos</a></li>
            <li><a href="live.jsp">Live</a></li>
            <li><a href="contact.jsp">Contact</a></li>
        </ul>
    </nav>
</header>
<article>
    <h1>Photos of the band</h1>
    <ul id="imagegallery">
        <li>
            <a href="images/photos/bassist.jpg" title="the crow goes wild">
                <img src="images/photos/thumbnail_bassist.jpg"/>
            </a>
        </li>
        <li>
            <a href="images/photos/concert.jpg" title="An atmospheric moment">
                <img src="images/photos/thumbnail_concert.jpg"/>
            </a>
        </li>
        <li>
            <a href="images/photos/crowd.jpg" title="Rocking out">
                <img src="images/photos/thumbnail_crowd.jpg"/>
            </a>
        </li>
        <li>
            <a href="images/photos/guitarist.jpg" title="Encore! Encore!">
                <img src="images/photos/thumbnail_guitarist.jpg"/>
            </a>
        </li>
    </ul>
</article>
</body>
</html>
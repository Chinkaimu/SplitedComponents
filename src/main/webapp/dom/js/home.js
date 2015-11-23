/*---- start side show -----*/
function prepareSlideShow() {
    if (!document.getElementById) return false;
    if (!document.getElementsByTagName) return false;
    var intro = document.getElementById("intro");
    var slideShowDiv = document.createElement("div");
    slideShowDiv.setAttribute("id", "slideshow")
    var preview = document.createElement("img");
    preview.setAttribute("src", "images/slideshow.gif");
    preview.setAttribute("alt", "a glimpse of what awaits you");
    preview.setAttribute("id", "preview");
    slideShowDiv.appendChild(preview);
    insertAfter(slideShowDiv, intro);
    var frame = document.createElement("img");
    frame.setAttribute("src","images/frame.gif");
    frame.setAttribute("alt","");
    frame.setAttribute("id","frame");
    slideShowDiv.appendChild(frame);
    var links = document.getElementsByTagName("a");
    if (links.length == 0) return false;
    for (var i = 0; i < links.length; i++) {
        links[i].onmouseover = function () {
            var destination = this.getAttribute("href");
            if (destination.indexOf("home.jsp") != -1) {
                moveElement("preview",0,0,5);
            }
            if (destination.indexOf("about.jsp") != -1) {
                moveElement("preview",-150,0, 5);
            }
            if (destination.indexOf("photos.jsp") != -1) {
                moveElement("preview",-300,0, 5);
            }
            if (destination.indexOf("live.jsp") != -1) {
                moveElement("preview",-450,0, 5);
            }
            if (destination.indexOf("contact.jsp") != -1) {
                moveElement("preview",-600,0, 5);
            }
          }
        }
    }
    /*---- home end side show -----*/

    addLoadEvent(prepareSlideShow);
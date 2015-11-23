/*---- start side show -----*/
function prepareSlideShow(){
    if(!document.getElementById) return false;
    var intro = document.getElementById("intro");
    var slideShowDiv = document.createElement("div");
    slideShowDiv.setAttribute("id","slideshow")
    var preview = document.createElement("img");
    preview.setAttribute("src","images/slideshow.gif");
    preview.setAttribute("alt","a glimpse of what awaits you");
    preview.setAttribute("id","preview");
    slideShowDiv.appendChild(preview);
    insertAfter(slideShowDiv,intro);
}
/*---- home end side show -----*/

addLoadEvent(prepareSlideShow);
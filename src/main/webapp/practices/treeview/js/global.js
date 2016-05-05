/**
 * Created by chm on 4/15/16.
 */
function addLoadEvent(func){
    var oldLoadEvent = window.onload;

    if(typeof oldLoadEvent != 'function'){
        window.onload = func;
    }else{
        window.onload = function(){
            oldLoadEvent();
            func();
        }
    }
}

function replaceClass(element,sour,dest){
    //split all the classes
    var classNames = element.className.split(" ");
    var result = "";

    for(var i = 0 ; i < classNames.length ; i++){
        if(classNames[i] != sour){
            result += classNames[i] + " ";
        }
    }
    result += dest;
    element.className = result;
    return result;
}
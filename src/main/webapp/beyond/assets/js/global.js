/*
generate methods used frequently
 */

//------**** write for window load event ****--------
//add function to load event so that it can be called as soon as the page is loaded
function addLoadEvent(func){
    var oldonload = window.onload;
    if(typeof oldonload != 'function'){
        window.onload = func;
    }else{
        window.onload = function(){
            oldonload();
            func();
        }
    }
}
//------**** end write for window load event ****--------


//-------*** write for forms ****---------
//support placeholder for those browsers without such attribute
function resetFields(whichform){
    if(Modernizr.input.placeholder) return;
    for(var i = 0 ; i < whichform.elements.length ; i++){
        var element = whichform.elements[i];
        if(element.type == "submit") continue;
        var check = element.placeholder || element.getAttribute("placeholder");
        if(!check) continue;

        //when mouse focus on the input area, clear the placeholder
        element.onfocus = function(){
            var text = this.placeholder || this.getAttribute("placeholder");
            if(this.value == text){
                /*
                   //if the styles of placeholder and inputs are different, add these codes
                   if(this.className.indexOf("placeholder") != -1){
                   var index = this.className.indexOf("placeholder");
                    this.className = this.className.substring(0,index) + this.className.substring(index+1);
                }*/
                this.value = "";
            }
        }

        //when mouse leave the input area ,set the placeholder
        element.onblur = function(){
            if(this.value==""){
                /*
                 //if the styles of placeholder and inputs are different, add these codes
                this.classname  += "placeholder";
                */
                if(this.name.indexOf("password") == -1) {
                    this.value = this.placeholder || this.getAttribute("placeholder");
                }else{
                    //create a new input
                    this.style.display = "none";
                    var pwd = this;
                    var showpwd = document.createElement("input");
                    showpwd.setAttribute("id","showpwd");
                    showpwd.className = this.className;
                    showpwd.value ="密码";
                    pwd.parentNode.appendChild(showpwd);
                    showpwd.onfocus = function(){
                        pwd.style.display = "block";
                        pwd.focus();
                        this.style.display = "none";
                    }
                }
            }
        }
        element.onblur();
    }
}

//get the forms from the page , call resetField() to reset the placeholder
function prepareForms(){
    for(var i = 0 ; i < document.forms.length ; i++){
        var thisForm = document.forms[i];
        resetFields(thisForm);
    }
}

addLoadEvent(prepareForms);
//-------*** end write for forms ****---------


//-------*** write for classes ****---------
function removeElementById(id) {
    var element = document.getElementById(id);
    element.remove();
}
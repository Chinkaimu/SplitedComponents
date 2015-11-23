<%@page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>navbar_setting</title>
    <link rel="stylesheet" type="text/css" href="assets/css/basic_beyond.css">
</head>
<body>
     <div class="setting">
       <a id="btn-setting" title="Setting" href="#">
           <i class="icon glyphicon glyphicon-cog"></i>
       </a>
     </div>
    <div class="setting-container" id="setting-container">
        <label>
            <input type="checkbox" id="checkbox_fixednavbar">
            <span class="text">Fixed Navbar</span>
        </label>
        <label>
            <input type="checkbox" id="checkbox_fixedsidebar">
            <span class="text">Fixed SideBar</span>
        </label>
        <label>
            <input type="checkbox" id="checkbox_fixedbreadcrumbs">
            <span class="text">Fixed BreadCrumbs</span>
        </label>
        <label>
            <input type="checkbox" id="checkbox_fixedheader">
            <span class="text">Fixed Header</span>
        </label>
    </div>
     <script src="assets/js/jquery-2.0.3.min.js"></script>
     <script src="assets/js/bootstrap.min.js"></script>
     <script src="assets/js/skins.min.js"></script>
     <script src="assets/js/beyond.min.js"></script>
     <script src="assets/js/global.js"></script>

     <script>
       function adapter(){
          var inputs = document.getElementsByTagName("input");
           for(var i=0 ; i< inputs.length ; i++){
               inputs[i].style.position = "static";
               inputs[i].style.opacity = "1";
           }
       }
         addLoadEvent(adapter);
     </script>

</body>
</html>
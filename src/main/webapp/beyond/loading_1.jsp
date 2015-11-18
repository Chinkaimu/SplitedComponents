<%@page contentType="text/html; UTF-8" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>loading example</title>
      <style type="text/css">

         #div{
            position:relative;
            width:100px;
            height:100px;
            margin-bottom:1.5em;
            margin-right:1.5em;
            float:left;
         }

         #div div{
            width:10px;
            height:30px;
            background:#90F38D;
            position:absolute;
            top:35px;
            left:45px;
         }

         .bar1 {
           -moz-transform:rotate(0deg) translate(0, -40px);
           -webkit-transform:rotate(0deg) translate(0, -40px);opacity:0.12;
         }
         .bar2 {
           -moz-transform:rotate(45deg) translate(0, -40px);
           -webkit-transform:rotate(45deg) translate(0, -40px);opacity:0.25;
         }
         .bar3 {
           -moz-transform:rotate(90deg) translate(0, -40px);
           -webkit-transform:rotate(90deg) translate(0, -40px);opacity:0.37;
         }
         .bar4 {
           -moz-transform:rotate(135deg) translate(0, -40px);
           -webkit-transform:rotate(135deg) translate(0, -40px);opacity:0.50;
         }
         .bar5 {
           -moz-transform:rotate(180deg) translate(0, -40px);
           -webkit-transform:rotate(180deg) translate(0, -40px);opacity:0.62;
         }
         .bar6 {
           -moz-transform:rotate(225deg) translate(0, -40px);
           -webkit-transform:rotate(225deg) translate(0, -40px);opacity:0.75;
         }
         .bar7 {
           -moz-transform:rotate(270deg) translate(0, -40px);
           -webkit-transform:rotate(270deg) translate(0, -40px);opacity:0.87;
         }
         .bar8 {
           -moz-transform:rotate(315deg) translate(0, -40px);
           -webkit-transform:rotate(315deg) translate(0, -40px);opacity:1;
         }
      </style>
   </head>
   <body>
      <div id="div">
         <div class="bar1"></div>
         <div class="bar2"></div>
         <div class="bar3"></div>
         <div class="bar4"></div>
         <div class="bar5"></div>
         <div class="bar6"></div>
         <div class="bar7"></div>
         <div class="bar8"></div>
      </div>

      <script>
           var count = 0;
           function rotate() {
             var elem2 = document.getElementById('div');
             elem2.style.MozTransform = 'scale(0.5) rotate('+count+'deg)';
             elem2.style.WebkitTransform = 'scale(0.5) rotate('+count+'deg)';
             if (count==360) { count = 0 }
             count+=45;
             window.setTimeout(rotate, 100);
           }
           window.setTimeout(rotate, 100);
      </script>
   </body>
</html>

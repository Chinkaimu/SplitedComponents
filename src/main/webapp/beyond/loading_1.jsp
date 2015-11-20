<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>loading example</title>
      <style type="text/css">

         .table-with-header{
             position:relative;
             top:20%;
             left:20%
             right:20%;
             bottom:20%;
             width:150px;
             height:150px;
         }
         #loading_container{
            position:absolute;
            width:100%;
            height:100%;
            top:0;
            left:0;
            right:0;
            bottom:0;
            background:red;
         }

         #loading_container div{
            width:7%;
            height:25%;
            background:#90F38D;
            position:absolute;
            top:40%;
            left:40%;
         }

         table{
          border:1px solid;
         }
         table tr{
          border:1px solid;
         }
         table tr td{
          border:1px solid;
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
    <div class="table-with-header">
       <div id="loading_container">
         <div class="bar1"></div>
         <div class="bar2"></div>
         <div class="bar3"></div>
         <div class="bar4"></div>
         <div class="bar5"></div>
         <div class="bar6"></div>
         <div class="bar7"></div>
         <div class="bar8"></div>
       </div>
       <table id="test_table">
         <tr><td>学号</td><td>姓名</td></tr>
         <tr><td>2014111467</td><td>陈海梦</td></tr>
         <tr><td>2014111467</td><td>陈海梦</td></tr>
         <tr><td>2014111467</td><td>陈海梦</td></tr>
         <tr><td>2014111467</td><td>陈海梦</td></tr>
      </table>
    </div>

      <script>
           var count = 0;
           function rotate() {
             var elem2 = document.getElementById('loading_container');
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

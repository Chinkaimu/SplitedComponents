<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta chaset="utf-8">
      <title>loading example</title>
      <style type="text/css">
         @-webkit-keyframes typing {
         0% {
           background-color: #2dc3e8;
           box-shadow: 12px 0 0 0 rgba(0, 255, 255, .2), 24px 0 0 0 rgba(0, 255, 255, .2),36px 0 0 0 rgba(0,255,255,.2)
         }
         25% {
           background-color: rgba(0, 255, 255, .4);
           box-shadow: 12px 0 0 0 #2dc3e8, 24px 0 0 0 rgba(255, 255, 255, .2),36px 0 0 0 rgba(0,255,255,.2)
         }
         75% {
            background-color: rgba(0, 255, 255, .4);
            box-shadow: 12px 0 0 0 rgba(0, 255, 255, .2), 24px 0 0 0 #2dc3e8,36px 0 0 0 rgba(0,255,255,.2)
           }
         100%{
            background-color: rgba(0, 255, 255, .4);
            box-shadow: 12px 0 0 0 rgba(0, 255, 255, .2), 24px 0 0 0 rgba(0,255,255,.2),36px 0 0 0 #2dc3e8
           }
         }
         .row{
          position:relative;
          left:20%;
          width:50%;
         }

         .loading-container{
           z-index:2000;
           position:absolute;
           width:100%;
           height:100%;
           top:0;
           left:0;
           right:0;
           bottom:0;
           opacity:0.7;
           background:#fff;
           display:none;
         }

         .loading-container .loading{
           width:7px;
           height:7px;
           border-radius:50%;
           -webkit-animation:typing 1s linear infinite alternate;
           position:relative;
           top:45%;
           left:45%;
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
      </style>
   </head>
   <body>
    <div class="row">
      <div class="loading-container">
         <div class="loading"></div>
      </div>
       <table id="test_table">
           <tr><td>学号</td><td>姓名</td></tr>
           <tr><td>2014111467</td><td>陈海梦</td></tr>
           <tr><td>2014111467</td><td>陈海梦</td></tr>
           <tr><td>2014111467</td><td>陈海梦</td></tr>
           <tr><td>2014111467</td><td>陈海梦</td></tr>
       </table>
     </div>
     <button class="button" id="button">刷新</button>
   </body>
   <script type="text/javascript" src="assets/js/1.10.2/jquery.js"></script>
   <script>
       $("#button").click(function(){
          $(".loading-container").toggle();
       });
   </script>
</html>
<%@ page contentType="text/html; charset = utf-8" %>
<!DOCTYPE html>
<html>
  <head>
      <title>Asynchronous Javascript and XML</title>
      <style type="text/css">
          .progress-bar{
              display:inline-block;
              width:200px;
              background-color:#a9a9a9;
          }
          .progress-bar:after{
              content:"";
              width:20px;
              background-color: green;
          }
      </style>
  </head>
  <body>
    请选择要上传的文件： <input id="uploadItem" name="uploadItem" type="file">
    <div>
        <span class="progress-bar"></span>
    </div>
  <script>
      var test = function x(){
          var elem = document.getElementById("uploadItem");

          elem.addEventListener("change",function() {
              var item =  document.getElementById("uploadItem").files[0];
              var formData = new FormData();
              formData.append("uploadItem",item);

              var xhr = new XMLHttpRequest();
              xhr.open("post","../upload");

//              var headers = {
//                  "Accept": "application/json",
//                  "Cache-Control": "no-cache",
//                  "X-Requested-With": "XMLHttpRequest",
//                  "Content-Type":"multipart/form-data"
//               };
//              for (headerName in headers) {
//                  headerValue = headers[headerName];
//                  xhr.setRequestHeader(headerName, headerValue);
//              }
//              xhr.setRequestHeader("Content-Type","multipart/form-data");
              xhr.send(formData);
          },false);
      }();
  </script>
  </body>
</html>
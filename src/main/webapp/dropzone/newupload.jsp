<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>上传文件</title>
    <script src="js/mydropzone2.js"></script>
    <link href="css/mydropzone.css" type="text/css" rel="stylesheet">
</head>
<body>
<h2>默认dropzone样式</h2>
   <button class="addButton">上传文件</button>
   <button class="deleteButton" disabled="true">全部删除</button>
   <div id="fileArea" class="dropzone"></div>
    <script>
        //设置方法一:定义时设定相应属性
//      var myDropzone = new Dropzone("#fileArea",{
//          url:"../upload",
//          autoQueue:false,
//          clickable:".addButton"
//      });
//        document.getElementById("uploadButton").onclick = function () {
//
//        }
//        myDropzone.enqueueFile();

        //设置方法二:变量设置相应属性
        // fileArea作为class="dropzone"区域的id
        Dropzone.options.fileArea={
            url:"/splitedComponents/upload",
            autoQueue:true,
            autoProcessQueue:true,
            addRemoveLinks:true,
            clickable:".addButton"
        }
    </script>
</body>
</html>
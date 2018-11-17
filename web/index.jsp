<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>新闻首页</title>
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
      $(function () {
          var pageNum=${param.pageNum}
          $.ajax({
              "url":"getAllDetail",
              "type":"post",
              "data":{"pageNum":pageNum},
              "dataType":"json",
              "success":function (result) {
                  for(var i=0;i<result.length-1;i++){
                      var str="<tr>"+
                          "<td>"+result[i].id+"</td>"+
                          "<td>"+result[i].title+"</td>"+
                          "<td>"+result[i].summary+"</td>"+
                          "<td>"+result[i].author+"</td>"+
                          "<td>"+result[i].createDate+"</td>"+
                          "<td><a href=''>查看评论</a>&nbsp;&nbsp;<a href=''>评论</a>&nbsp;&nbsp;<a href=''>删除</a></td>"+
                          +"</tr>";
                      $("table").append(str);
                  }

                  var str1="<tr>" +
                      "<td colspan='6'><a href='index.jsp?pageNum=1'>首页</a>" +
                      "&nbsp;&nbsp;<a href='index.jsp?pageNum="+(result[result.length-1].pageNum-1)+"'>上一页</a>"+
                      "&nbsp;&nbsp;<a href='index.jsp?pageNum="+(result[result.length-1].pageNum+1)+"'>下一页</a>"+
                      "&nbsp;&nbsp;<a href='index.jsp?pageNum="+result[result.length-1].total+"'>尾页</a>"+
                      "&nbsp;&nbsp;第"+result[result.length-1].pageNum+"页/共"+result[result.length-1].total+"页"
                  " </td>" +
                  "</tr>";

                  $("table").append(str1);

                  $("table tr:odd").css({"background":"#88CFFD"});
                  $("table tr:last").css({"background":"white","text-align":"center"});
              }
          })
      })


    </script>
      <style type="text/css">
          div {
              width: 800px;
              text-align: center;
          }
          table caption    {
              border: solid black 1px;
              width: 100%;
              height: 50px;
              font-size: 30px;
              padding-top: 5px;
              box-sizing: border-box;
              font-family: '宋体';
              font-weight: bolder;
          }
          table {
              width: 100%;
          }
          table th{
              text-align: left;
              background-color: #CBCBFD;
              height: 40px;
          }

      </style>
  </head>
  <body>
      <div>
          <p>新闻标题:<input type="text" name="title" /><input type="button" value="查询" /> </p>
          <table border="all">
              <caption>新闻列表</caption>
              <tr>
                  <th>新闻编号</th>
                  <th>新闻标题</th>
                  <th>新闻摘要</th>
                  <th>作者</th>
                  <th>创建时间</th>
                  <th>操作</th>
              </tr>
          </table>
      </div>
  </body>
</html>

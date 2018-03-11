<%--
  Created by IntelliJ IDEA.
  User: KINGTONG
  Date: 2018/3/11
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    // request.setCharacterEncoding("UTF-8") ;
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<input type="button" id="addBut" name="addBut" value="增加"><br>
<input type="button" id="editBut" name="editBut" value="更新"><br>
<input type="button" id="deleteBut" name="deleteBut" value="删除"><br>
<input type="button" id="getBut" name="getBut" value="查询"><br>
<input type="button" id="listBut" name="listBut" value="分页显示"><br>
<div id="showDiv"></div>
</body>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
<script type="text/javascript">
    $(addBut).on("click",function(){
        $.ajax({
            url: "restful",
            type : "post",
            data : {
                empno : 110,
                ename : "RESTful",
                sal : 1.1,
                hiredate : "1111-11-11"
            },
            success : function(data){
                $(showDiv).append("<p> 数据增加成功："+data.flag+"</p>");
            },
            dataType : "json",
            error : function(data){
                $(showDiv).append("<p>出错了</p>");
            }
        })
    });

    $(editBut).on("click",function(){
        $.ajax({
            url: "restful",
            type : "post",
            data : {
                _method : "put",
                empno : 110,
                ename : "RESTful",
                sal : 1.1,
                hiredate : "1111-11-11"
            },
            success : function(data){
                $(showDiv).append("<p> 数据更新成功："+data.flag+"</p>");
            },
            dataType : "json",
            error : function(data){
                $(showDiv).append("<p>出错了</p>");
            }
        })
    });


    $(deleteBut).on("click",function(){
        $.ajax({
            url: "restful",
            method : "post" ,
            data : {
                _method : "delete",
                mid : 1
            },
            dataType : "json",
            success : function(data){
                $(showDiv).append("<p> 数据删除成功："+data.flag+"</p>");
            },
            error : function(data){
                $(showDiv).append("<p>出错了</p>");
            }
        })
    });
    $(getBut).on("click",function(){
        $.ajax({
            url: "restful/1",
            method : "get" ,
            data : {
            },
            dataType : "json",
            success : function(data){
                $(showDiv).append("<p> 编号："+data.allMembers.empno+"，名称："+data.allMembers.ename+",工资"+
                    data.allMembers.sal+",日期:"+data.emp.hiredate+"</p>");
                console.log(1);
            },
            error : function(data){
                $(showDiv).append("<p>出错了</p>");
            }
        })
    });
    $(listBut).on("click",function(){
        $.ajax({
            url: "restful/1",
            method : "PATCH" ,
            dataType : "json",
            success : function(data){
                for(var t=0;t<data.allEmps.length;t++){
                    $(showDiv).append("<p> 编号："+data.allEmps[t].empno+"，名称："+data.allEmps[t].ename+",工资"+
                        data.allEmps[t].sal+",日期:"+data.allEmps[x].hiredate+"</p>");
                }
            },
            error : function(data){
                $(showDiv).append("<p>出错了</p>");
            }
        })
    });
</script>
</html>
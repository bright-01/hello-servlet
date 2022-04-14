<%@ page import="hello.servlet.domain.MemberRepository" %>
<%@ page import="hello.servlet.domain.Member" %><%--
  Created by IntelliJ IDEA.
  User: bright1
  Date: 2022/04/14
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // request, response 는 그냥 사용 가능
    MemberRepository memberRepository = MemberRepository.getInstance();
    System.out.println("jsp member save");

    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id<% member.getId(); %></li>
    <li>username<% member.getUsername(); %></li>
    <li>age<% member.getAge(); %></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>

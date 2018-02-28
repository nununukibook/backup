<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD:WebProj3/WebContent/helloStrutsError.jsp
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
=======
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
>>>>>>> 4c57c2379ec527a364325b46aedfe4e7e9996492:WebProj/WebContent/index.jsp
<html>
<head>
<meta charset="UTF-8">
<title>HelloStrutsError</title>
</head>
<body>
<<<<<<< HEAD:WebProj3/WebContent/helloStrutsError.jsp
<h1>エラーが発生しました</h1>
<br>
<h3><s:property value="result" /></h3>
=======
	<form action="HelloStrutsAction">
		<s:submit value="HelloStruts"/>

	</form>

	<form action="WelcomeAction">
		<s:submit value="Welcome"/>

	</form>

	<form action="InquiryAction">
		<s:submit value="問い合わせ"/>
	</form>

	<br>
	GET通信
	<s:form method="get" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>
	POST通信
	<s:form method="post" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>

>>>>>>> 4c57c2379ec527a364325b46aedfe4e7e9996492:WebProj/WebContent/index.jsp

</body>
</html>
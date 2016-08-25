<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Spring 4 - Struts 2 - Hibernate 4</title>
</head>
<body>
<h1>Spring 4 - Struts 2 - Hibernate 4</h1>
<s:form action="result.action" validate="true">
    <s:textfield name="user.name" label="Name"/>
    <s:textfield name="user.email" label="Email"/>
    <s:textfield name="user.age" label="Age"/>
    <s:submit method="execute"/>
</s:form>
</body>
</html>

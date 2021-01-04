<jsp:useBean id="e" class="employeePack.Employee">
<jsp:setProperty name="e" property="name" value="chandra"/>
<jsp:setProperty name="e" property="id" value="10"/>
Given Name:<jsp:getProperty name="e" property="name"/>
<br></br>
Given Id:<jsp:getProperty name="e" property="id"/>
</jsp:useBean>

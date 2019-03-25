<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link
	href="${pageContext.servletContext.contextPath }/assets/css/main.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<c:import url="/WEB-INF/views/includes/header.jsp"></c:import>
		<div id="wrapper">
			<div id="content">
				<div id="site-introduction">
					<img id="profile"
						src="${pageContext.servletContext.contextPath }${siteVo.urlprofile }"
						style="width: 100px">
					<h2>${siteVo.welcome }</h2>
					<p>
						${siteVo.description }<br> <br> <a
							href="${pageContext.servletContext.contextPath }/guestbook/list">방명록</a>에
						글 남기기<br>
					</p>
				</div>
			</div>
		</div>
		<c:import url="/WEB-INF/views/includes/navigation.jsp">
			<c:param name="menu" value="main" />
		</c:import>
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>
<!-- 
<script>
	(function() {
		while(true) {
			alert("멍청한 개발자 같으니라고!!");
		}
	})();
</script>
	 -->
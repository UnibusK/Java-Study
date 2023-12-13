<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<style>
			#wrap {
				width:300px;
				border:2px solid black;
				border-radius:10px;
				margin:0 auto;
				padding:30px;
				background-color:darkgray;
				color:white;
			}
			input[name="id"] {
				width:120px;
				margin-left:10px;
			}
			input[name="pw"] {
				width:120px;
				margin-left:6px;
			}
			input[name="nm"]{
				width:120px;
				margin-left:10px;
			}
			input[name=ph]{
				width:120px;
				margin-left:10px;
			}
			fieldset{
				border:1px solid beige;
				border-radius:6px;
				width:130px;
				margin:0 auto;
			}
			#submit, #reset{
				display:block;
				margin:0 auto;
			}
			#submit {
				background-color:black;
				color:white;
			}
		</style>
	</head>
	<body>
		<!-- form태그는 submit이 눌렸을 때 내부의 input을 전송한다.
			전송 목적지는 action 위치이며 방식은 method를 따른다. -->
		<!-- 전송데이터는 name=value 형태로 가공되여 request를 통해 전송된다. -->
		
		<!-- *******매우중요 -->
		<!-- get방식은 도메인 뒤로 데이터가 그대로 노출되는 방식 -->
			<!-- 개발자가 데이터의 전송여부를 파악하기 쉽고 개발편의가 대단이 높음 -->
			<!-- 보낼 수 있는 데이터의 길이가 잛고, 문자로 표현하기 어려운 데이터는 전송할 수 없음(객체전송 불가) -->
		<!-- post방식은 보이지 안흔ㄴ 공간에 데이터를 담아서 전송하는 방식 -->
			<!-- 개발자는 데이터를 별도로 확인하기 전까지 전송여부를 파악할 수 없다. -->
			<!-- 데이터 보안이 가능하고 객체를 전달할 수 있다는 장점을 갖는다. -->
			<!-- 한글이 깨진다. -->
		<div id="wrap">
			<form method="post" action="dest.jsp">
				<h1>회원가입</h1>
				<hr>
				아 이 디 : <input type="text" placeholder="아이디를 입력해주세요" name="id" id="id"><input type="checkbox" onclick="idCheck()">중복체크<br>
				비밀번호 : <input type="password" placeholder="비밀번호 4자이상으로 넣어주세요" name="pw"><br>
				이&nbsp&nbsp&nbsp&nbsp&nbsp름 : <input type="text" placeholder="이름을 입력해주세요" name="nm"><br>
				연 락 처 : <input type="text" placeholder="-제외, 숫자만 입력해주세요" name="ph">
				<br><br>
				<fieldset id = "one">
					<legend>관심분야</legend>
					<input type="radio" value="java" name="sub">JAVA<br>
					<input type="radio" value="html" name="sub">HTML<br>
					<input type="radio" value="js" name="sub">Java Script
				</fieldset>
				<br>
				<fieldset id ="two">
					<legend>수강과목</legend>
					JSP<input type="checkbox" value="jsp" name="jsp">
					<br>
					SQL<input type="checkbox" value="sql" name="sql">
				</fieldset>
				<hr>
				<input type="submit" value="회원가입" id="submit">
			</form>
		</div>
		<script>
			function idCheck(){
				let userID = document.getElementById("id").value
				prompt("아이디 중복체크" , defalt=userID);
			}
		</script>
	</body>
</html>
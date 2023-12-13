<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>값을 전송하는 여러 태그들</title>
	</head>
	<body>
		동해물과 백두산이 마르고 닳도록
		<div id="wrap" name="aa"> </div>
			<form method="post" action="data.jsp">
				<p>일반 p태그의 값 전송처리</p>
				<input type="text" value="input 태그값을 처리" name="tx">
				<input type="hidden" name="hi">
				<
				<input type="submit" value="전송!">
			</form>
		</div>
		<select>
			<option>봄</option>
			<option>여름</option>
			<option>가을</option>
			<option>겨울</option>			
		</select>
		<script>
			//document : 지금 보고있는 문서 자체
			//getElementsByTagName(String tag_name) : document.객체가 수행하는 메서드
				//태그이름을 기준으로 문서 내부에서 요소들을 가져옴
				var i = document.getElementsByTagName("p")[0];
				//i.value = "이걸로 교체";
				console.log(i.innerHTML);
			console.log(document.getElementsByTagName("p")[0].innerHTML);
			console.log(document.getElementsByTagName("input")[0].value);
			//p태그의 inneerHTML을 input의 value로 넣어서 전송
			document.getElementsByTagName("input")[1].value=document.getElementsByTagName("p")[0].innerHTML
			//어떤 태그들은 값을 전송할 수 없는 것들이 있다.
			//그런 값들은 input type="hidden"에 넣어서 전송하면 된다.
		</script>
	</body>
</html>

<!-- 
노드의 농류
1. Element : 추상적으로 p. div 모두 담을 수 있음
2. Attribute
3. text 
-->
/**
 * 
 */
const modifyForm = document.querySelector("#modifyForm");

 document.querySelector(".btn-success").addEventListener("click",()=>{
	 //location.href="list.do";
	 modifyForm.action = "list.do";
	 modifyForm.submit();
 });
 
 //삭제버튼 클릭시 modifyForm 전송
 //action = delete
 
 document.querySelector(".btn-danger").addEventListener("click",()=>{
	 //password 입력여부 확인
	 const password = document.querySelector("#inputPassword");
	 if(password.value==""){
		 alert("비밀번호를 입력해 주세요");
		 password.focus();
		 return;
	 }
	 //사용자가 입력한 비밀번호를 가져와서
	 //id password 요소의 value 값으로 세팅
	 document.querySelector("#password").value = password.value;
	 
	 modifyForm.action = "delete.do";
	 modifyForm.method = "post";
	 //console.log(modifyForm);
	 modifyForm.submit();
 })
 
 
 //DAO deleteArticle()작성 => bno,password가 일치할 경우
 //서비스, 액션 작성
 //액션팩토리 작성
 // 성공시 목록 보여주기
 

 
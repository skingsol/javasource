/**
 * 
 */
 document.querySelector(".btn-success").addEventListener("click",()=>{
	 location.href="list.do";
 });

 // 수정 클릭 시 submit 기능 중지
  document.querySelector("form").addEventListener("submit", (e) => {
	  e.preventDefault();
	  
 // readForm을 가져온 후 readForm 전송
  const readForm = document.querySelector("#readForm");
	  
	  
 // modify.do
  readForm.action = "modify.do";
  readForm.submit();
	  });
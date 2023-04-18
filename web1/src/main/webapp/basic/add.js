/**
 *  add.html 사용자 입력 값 검증 
 *  num1, num2 숫자인지 확인하기
 * 
 * 
 *  submit 버튼이기 때문에 무조건 폼 전송 됨 => 폼 전송 못하게 막기
 *  num1, num2 숫자인지 확인
 *  둘중에 하나라도 숫자가 아니라면 경고창 띄우기
 *  둘 다 숫자라면 form submit 시키기
 */
document.querySelector("form").addEventListener("submit", (e)=> {
  // 숫자 검증을 위해 입력된 값 가져오기
  e.preventDefault(); // 폼 제출 막기
  const num1 = document.querySelector("#num1").value;
  const num2 = document.querySelector("#num2").value;

  // 입력된 값이 숫자인지 확인하기
  if (isNaN(num1) || isNaN(num2) || num1=="" || num2=="") {
    alert("숫자를 입력해주세요.");
    return;
  }
  
  document.querySelector("form").submit();
  
  
});


/** "목록으로" 버튼 클릭 시 : list.jsp로 이동
 *  "수정" 버튼 클릭시 : form 안의 no값 가져와서, modify.jsp로 이동하여 주소가 modify.jsp?no=가져온값으로
 * 	"삭제" 버튼 클릭시 : form 안의 no값 가져와서, remove.jsp로 이동하여 주소가 remove.jsp?no=가져온값으로
 * 
 * 
 */
//const no = document.querySelector("#no").value;

document.querySelector(".btn-primary").addEventListener("click", () => {
  location.href = "listPro.jsp";
});

document.querySelector(".btn-success").addEventListener("click", () => {
  location.href = "modifyPro.jsp?no="+no;
});

document.querySelector(".btn-danger").addEventListener("click", () => {
  location.href = "removePro.jsp?no="+no;
});
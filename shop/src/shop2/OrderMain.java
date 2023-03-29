package shop2;







// 연습용 클래스






public class OrderMain {

	public static void main(String[] args) {
		// OrderDTO 사용하기
		OrderDTO dto = new OrderDTO();
		
		// 프로퍼티에 값 세팅하는 방법 : 생성자 사용 or setter 메소드 사용
		dto.setOrderId(1000);
		
//		UserDTO userDTO = new UserDTO();
//		userDTO.setUserId(100);
//		userDTO.setName("차무식");
//		userDTO.setPayNo(2);
//		userDTO.setType("현금");
//		dto.setUserDTO(userDTO);    <==아래 한줄과 같음
		dto.setUserDTO(new UserDTO(100, "차무식", 2, "현금"));
		
		// 프로퍼티 값 조회
		System.out.println(dto.getOrderId());
		System.out.println(dto.getUserDTO().getName());
		
		UserDTO getUser = dto.getUserDTO();
		System.out.println(getUser.getName());
		System.out.println(getUser.getType());
		
		

	}

}

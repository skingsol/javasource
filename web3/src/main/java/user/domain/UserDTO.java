package user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class UserDTO {
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
}

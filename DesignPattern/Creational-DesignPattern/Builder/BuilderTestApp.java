package Builder;

public class BuilderTestApp {

	public static void main(String[] args) {

		UserRegistration userRegistration = new UserRegistration.UserRegistrationBuilder("Ravi Ranjan", "ravi115ranjan",
				"Coder@1234").gender("Male").age(25).city("bangalore").country("india").mobileNumber(9620856208l)
						.pinCode(560068).build();

		System.out.println("User Registration 1 : " + userRegistration);
	
	}

}

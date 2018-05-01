package Builder;

/**
 * when we have many attributes in a class which can be mandatory or optional
 * then we should go for builder design pattern.
 * 
 * so, rather than direct exposing the main class, we provide a builder class to
 * build the object of main class.
 * 
 * so, all the mandatory attributes has to be passed as the constructor of
 * builder class(inner class) and rest of the optional attributes will be set
 * via chaining method of builder class.
 * 
 * @author raviranjan
 *
 */
public class UserRegistration {

	// mandatory parameter for user registration.
	private final String fullName;
	private final String userName;
	private final String password;

	// define the optional parameters.
	private final String gender;
	private final int age;
	private final String address;
	private final String city;
	private final String state;
	private final String country;
	private final long mobileNumber;
	private final long pinCode;

	private UserRegistration(UserRegistrationBuilder userRegistrationBuilder) {

		this.fullName = userRegistrationBuilder.fullName;
		this.userName = userRegistrationBuilder.userName;
		this.password = userRegistrationBuilder.password;
		this.gender = userRegistrationBuilder.gender;
		this.age = userRegistrationBuilder.age;
		this.address = userRegistrationBuilder.address;
		this.city = userRegistrationBuilder.city;
		this.state = userRegistrationBuilder.state;
		this.country = userRegistrationBuilder.country;
		this.mobileNumber = userRegistrationBuilder.mobileNumber;
		this.pinCode = userRegistrationBuilder.pinCode;
	}

	public String getFullName() {
		return fullName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public long getPinCode() {
		return pinCode;
	}

	@Override
	public String toString() {
		return "UserRegistration [fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", gender=" + gender + ", age=" + age + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", mobileNumber=" + mobileNumber + ", pinCode=" + pinCode + "]";
	}

	// create a static builder class
	public static class UserRegistrationBuilder {
		// mandatory parameter for user registration.
		private final String fullName;
		private final String userName;
		private final String password;

		// define the optional parameters.
		private String gender;
		private int age;
		private String address;
		private String city;
		private String state;
		private String country;
		private long mobileNumber;
		private long pinCode;

		// we must a constructor for mandatory parameter in builder class.
		public UserRegistrationBuilder(final String fullName, final String userName, final String password) {
			this.fullName = fullName;
			this.userName = userName;
			this.password = password;
		}

		// define a chaining method
		public UserRegistrationBuilder gender(final String gender) {
			this.gender = gender;
			return this;
		}

		public UserRegistrationBuilder age(final int age) {
			this.age = age;
			return this;
		}

		public UserRegistrationBuilder address(final String address) {
			this.address = address;
			return this;
		}

		public UserRegistrationBuilder city(final String city) {
			this.city = city;
			return this;
		}

		public UserRegistrationBuilder state(final String state) {
			this.state = state;
			return this;
		}

		public UserRegistrationBuilder country(final String country) {
			this.country = country;
			return this;
		}

		public UserRegistrationBuilder mobileNumber(final long mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public UserRegistrationBuilder pinCode(final long pinCode) {
			this.pinCode = pinCode;
			return this;
		}

		// finally build the object and return to the client.
		public UserRegistration build() {
			UserRegistration userRegistration = new UserRegistration(this);
			return userRegistration;
		}
	}

}

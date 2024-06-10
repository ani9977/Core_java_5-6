package in.co.exceptions;

public class TestCustomLoginEx {

	public static void main(String[] args) throws LoginException    {

		String loginId = "niket";

		if (loginId == null || loginId != "Aniket") {

			throw new LoginException();

		}

		else {
			System.out.println("Login Sucessfully");
		}

	}

}
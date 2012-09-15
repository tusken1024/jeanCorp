package service;

import org.apache.commons.lang.StringUtils;

public class SecurityService {

	public static boolean checkCredentials(String login, String password) {
		assert login != null : "login obligatoire";
		assert password != null : "login obligatoire";

		if (StringUtils.equalsIgnoreCase(login, "admin")
				&& StringUtils.equalsIgnoreCase(password, "admin")) {
			return true;
		}

		return false;
	}

}

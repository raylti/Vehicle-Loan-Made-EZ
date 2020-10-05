/**
 * Declaring methods for Login authentication
 * @author: Rahul
 * @Version:1.0
 */

package com.lti.repo;

import com.lti.entity.User;
import com.lti.pojo.Login;

public interface LoginRepo {

	User authenticate(Login login);
}

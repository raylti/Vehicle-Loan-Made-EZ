/**
 * Method Declaration Service Class
 * @author: Rahul
 * @Version:1.0
 */

package com.lti.service;

import com.lti.entity.User;
import com.lti.pojo.Login;

public interface LoginService {

	User validate(Login login);
}

package edu.iot.controller_test.service;

import edu.iot.controller_test.exceoption.LoginFailException;
import edu.iot.controller_test.model.Member;

public interface AccountService {
	void login(Member member) throws LoginFailException;
}

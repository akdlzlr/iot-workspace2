package edu.iot.tiles_test.service;

import edu.iot.tiles_test.exceoption.LoginFailException;
import edu.iot.tiles_test.model.Member;

public interface AccountService {
	void login(Member member) throws LoginFailException;
}

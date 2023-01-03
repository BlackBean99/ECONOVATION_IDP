package com.econovation.idp.application.port.in;

import com.econovation.idp.global.common.BasicResponse;

public interface AccountSignUpUseCase {
    public void signUp(String userName, Long year, String userEmail, String password);

    // 중복된 이메일 확인
    BasicResponse isDuplicateEmail(String email);

    public String sendfindingPasswordConfirmationCode(String name, Long year) throws IllegalAccessException;
}

package com.workintech.s19d2.service;

import com.workintech.s19d2.dto.RegisterResponse;
import com.workintech.s19d2.dto.RegistrationMember;
import com.workintech.s19d2.entity.Member;

public interface AuthenticationService {
    Member register(String email, String password);
}

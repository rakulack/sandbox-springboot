package com.rakulack.spring.tabi.service;

public interface AccountService {
    void register(String email, String password, String[] roles);
}

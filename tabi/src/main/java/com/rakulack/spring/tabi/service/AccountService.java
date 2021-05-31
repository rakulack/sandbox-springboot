package com.rakulack.spring.tabi.service;

public interface AccountService {
    void register(String name, String email, String password, String[] roles);
}

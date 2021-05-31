package com.rakulack.spring.tabi.controller.signup;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupForm {
  @NonNull
  private String email;
  @NonNull
  private String password;
  @NonNull
  private String name;
}   

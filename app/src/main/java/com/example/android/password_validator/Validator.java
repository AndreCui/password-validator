package com.example.android.password_validator;

public class Validator {

    public int validate (String password) {
        int number =0;

        //check whether or not is "password"
        if (!password.equalsIgnoreCase("password")){
            number ++;
            }

        //check length
        if(password.length() >= 8) {

            number ++;
        }
        // password needs to contain special character
        if(password.matches(".*[! @ # $ % ^ & * ( ) _ + - = / . > < : ; ' { } | ? ,  ].*")){
            number ++;
        }

        // password needs at least 1 digit
        if (password.matches(".*[0-9].*")){
            number ++;
        }

        // password can be uppercase or lowercase
        if (password.matches(".*[a-z].*[A-Z].*")) {
            number ++;
        }
        return number;
    }

}

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
        return number;
    }

}

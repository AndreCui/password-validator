package com.example.android.password_validator;

import org.junit.Test;
import static org.junit.Assert.*;

public class validatorJunitTest {

    @Test

    public void checkWords(){
        Validator validator = new Validator();
        //expected pass 1
        assertEquals(1, validator.validate("password"));
    }

    @Test

    public void checkLength(){
        Validator validator = new Validator();
        //expected pass 2
        assertEquals(2, validator.validate("asdfghjkl"));
    }
}

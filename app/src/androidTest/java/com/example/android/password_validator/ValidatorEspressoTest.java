package com.example.android.password_validator;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class ValidatorEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void case1(){
        //enter password
        onView(withId(R.id.editText)).perform(typeText("1111"));
        //close keyboard
        closeSoftKeyboard();
        //Click button
        onView(withId(R.id.button)).perform(click());
        //show the password strength
        onView(withId(R.id.textView)).check(matches(withText("Password Strength: 2 Not Strong.")));
    }

    @Test
    public void case2(){
        //enter password
        onView(withId(R.id.editText)).perform(typeText("1111ssaq"));
        //close keyboard
        closeSoftKeyboard();
        //Click button
        onView(withId(R.id.button)).perform(click());
        //show the password strength
        onView(withId(R.id.textView)).check(matches(withText("Password Strength: 3 Not Strong.")));
    }

    @Test
    public void case3(){
        //enter password
        onView(withId(R.id.editText)).perform(typeText("1111,.sse"));
        //close keyboard
        closeSoftKeyboard();
        //Click button
        onView(withId(R.id.button)).perform(click());
        //show the password strength
        onView(withId(R.id.textView)).check(matches(withText("Password Strength: 4 Not Strong.")));
    }
    @Test
    public void case4(){
        //enter password
        onView(withId(R.id.editText)).perform(typeText("powert"));
        //close keyboard
        closeSoftKeyboard();
        //Click button
        onView(withId(R.id.button)).perform(click());
        //show the password strength
        onView(withId(R.id.textView)).check(matches(withText("Password Strength: 1 Not Strong.")));
    }

    @Test
    public void case5(){
        //enter password
        onView(withId(R.id.editText)).perform(typeText("asdQ877,,"));
        //close keyboard
        closeSoftKeyboard();
        //Click button
        onView(withId(R.id.button)).perform(click());
        //show the password strength
        onView(withId(R.id.textView)).check(matches(withText("Password Strength: 5  Strong")));
    }

    @Test
    public void case6(){
        //enter password
        onView(withId(R.id.editText)).perform(typeText("1111,.ssY"));
        //close keyboard
        closeSoftKeyboard();
        //Click button
        onView(withId(R.id.button)).perform(click());
        //show the password strength
        onView(withId(R.id.textView)).check(matches(withText("Password Strength: 5  Strong")));
    }



}
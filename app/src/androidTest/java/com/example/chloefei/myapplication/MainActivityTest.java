package com.example.chloefei.myapplication;

import org.junit.Test;

        import static org.junit.Assert.*;

        import org.junit.Rule;
        import org.junit.Test;
        import android.support.test.rule.ActivityTestRule;
        import android.support.test.espresso.Espresso;
        import static android.support.test.espresso.action.ViewActions.click;
        import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
        import static android.support.test.espresso.action.ViewActions.typeText;
        import static android.support.test.espresso.assertion.ViewAssertions.matches;
        import static android.support.test.espresso.matcher.ViewMatchers.withId;
        import static android.support.test.espresso.matcher.ViewMatchers.withText;
    public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void test() {
        Espresso.onView(withId(R.id.editText)).perform(typeText("password"));
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.password)).check(matches(withText("Password not strong!")));
    }
    @Test
    public void test2(){
        Espresso.onView(withId(R.id.editText)).perform(typeText("Qwerty!"));
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.password)).check(matches(withText("Password not strong!")));

    }
    @Test
    public void test3() {
        Espresso.onView(withId(R.id.editText)).perform(typeText("abc"));
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.password)).check(matches(withText("Password not strong!")));
    }
    @Test
    public void test4() {
        Espresso.onView(withId(R.id.editText)).perform(typeText("!!$$"));
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.password)).check(matches(withText("Password not strong!")));
    }
    @Test
    public void test5() {
        Espresso.onView(withId(R.id.editText)).perform(typeText("Qwerty321!"));
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.password)).check(matches(withText("Valid Password!")));
    }
}
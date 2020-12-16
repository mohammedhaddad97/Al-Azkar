package com.example.azkar;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.*;

@RunWith(AndroidJUnit4.class)
public class AzkarInstrumentedTest extends TestCase {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule(MainActivity.class);


    /*
        What we need to do here is:
            1- Choose a zikr type from the spinner.
            2- Then click on "اضغط هنا" button.
            3- Al-Azkar activity will launch.
            4- Click on a zikr from the ListView.
            5- Display that zikr on a Dialog.
            6- Close the Dialog.
     */

    @Test
    public void showZikr() {
        onView(withId(R.id.spinner_zikr_type)).perform(click());

        onData(allOf(instanceOf(String.class), equalTo("أذكار الصباح"))).perform(click());

        onView(withId(R.id.button_submit)).perform(click());

        DataManager dm = DataManager.getInstance();

        Zikr zikr = dm.getSabahZikr().get(3);

        onData(allOf(instanceOf(Zikr.class), equalTo(zikr))).perform(click());

        pressBack();

    }
}
package com.example.basic_app_work;

import android.widget.RatingBar;
import android.widget.TextView;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.InputStream;

@RunWith(AndroidJUnit4.class)
public class TestApp {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    public TestApp() throws JSONException, IOException {
    }

    @Test
    public void test() throws InterruptedException, JSONException {

            onView(ViewMatchers.withId(R.id.recyclerview))
                    .perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));
        onView(withId(R.id.ShowHotelName)).check(matches(not(withText("HotelName"))));
            onView(withId(R.id.backbtn)).perform(click());
        onView(ViewMatchers.withId(R.id.recyclerview))
                .perform(RecyclerViewActions.actionOnItemAtPosition(8, click()));
        onView(withId(R.id.ShowHotelName)).check(matches(not(withText("HotelName"))));
        onView(withId(R.id.backbtn)).perform(click());



//        -------------------------------------------sortTest--------------------------------
        onView(withId(R.id.sortBtn)).perform(click());

        onView(withId(R.id.ratingStar)).perform(click());


        onView(withId(R.id.showSort)).perform(click());


        onView(withId(R.id.sortBtn)).perform(click());
        onView(withId(R.id.ratingStar)).perform(click());
        onView(withId(R.id.switchSortName)).perform(click());
        onView(withId(R.id.showSort)).perform(click());



    }

}

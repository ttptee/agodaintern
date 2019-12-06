package com.example.basic_app_work;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction linearLayout = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.recyclerview),
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        1)),
                        0),
                        isDisplayed()));
        linearLayout.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.ShowHotelName), withText("Centara Grand at CentralWorld"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("Centara Grand at CentralWorld")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.ShowHotelArea), withText("Siam"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        textView2.check(matches(withText("Siam")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.ShowHotelStar), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        textView3.check(matches(withText("1")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.ShowHotelRoom), withText("505"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView4.check(matches(withText("505")));

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.backbtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatImageView2 = onView(
                allOf(withId(R.id.sortBtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        ViewInteraction switch_ = onView(
                allOf(withId(R.id.switchSortName),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        switch_.perform(click());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.showSort), withText("Ok"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction linearLayout2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.recyclerview),
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        1)),
                        0),
                        isDisplayed()));
        linearLayout2.perform(click());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.ShowHotelName), withText("Ambassador Hotel"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        textView5.check(matches(withText("Ambassador Hotel")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.ShowHotelArea), withText("Siam"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        textView6.check(matches(withText("Siam")));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.ShowHotelStar), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        textView7.check(matches(withText("1")));

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.ShowHotelRoom), withText("505"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView8.check(matches(withText("505")));

        ViewInteraction appCompatImageView3 = onView(
                allOf(withId(R.id.backbtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView3.perform(click());

        ViewInteraction appCompatImageView4 = onView(
                allOf(withId(R.id.sortBtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView4.perform(click());

        ViewInteraction switch_2 = onView(
                allOf(withId(R.id.switchSortName),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        switch_2.perform(click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.showSort), withText("Ok"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction appCompatImageView5 = onView(
                allOf(withId(R.id.sortBtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView5.perform(click());

        ViewInteraction appCompatImageView6 = onView(
                allOf(withId(R.id.closeBtn),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView6.perform(click());

        ViewInteraction linearLayout3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.recyclerview),
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        1)),
                        0),
                        isDisplayed()));
        linearLayout3.perform(click());

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.ShowHotelName), withText("Ambassador Hotel"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        textView9.check(matches(withText("Ambassador Hotel")));

        ViewInteraction textView10 = onView(
                allOf(withId(R.id.ShowHotelArea), withText("Siam"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        textView10.check(matches(withText("Siam")));

        ViewInteraction textView11 = onView(
                allOf(withId(R.id.ShowHotelStar), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        textView11.check(matches(withText("1")));

        ViewInteraction textView12 = onView(
                allOf(withId(R.id.ShowHotelRoom), withText("505"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView12.check(matches(withText("505")));

        ViewInteraction appCompatImageView7 = onView(
                allOf(withId(R.id.backbtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView7.perform(click());

        ViewInteraction appCompatImageView8 = onView(
                allOf(withId(R.id.sortBtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView8.perform(click());

        onView(withId(R.id.ratingStar)).perform(click());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.showSort), withText("Ok"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction linearLayout4 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.recyclerview),
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        1)),
                        0),
                        isDisplayed()));
        linearLayout4.perform(click());

        ViewInteraction textView13 = onView(
                allOf(withId(R.id.ShowHotelName), withText("Grand Centre Point Hotel"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        textView13.check(matches(withText("Grand Centre Point Hotel")));

        ViewInteraction textView14 = onView(
                allOf(withId(R.id.ShowHotelArea), withText("Wireless"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        textView14.check(matches(withText("Wireless")));

        ViewInteraction textView15 = onView(
                allOf(withId(R.id.ShowHotelStar), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        textView15.check(matches(withText("3")));

        ViewInteraction textView16 = onView(
                allOf(withId(R.id.ShowHotelRoom), withText("402"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView16.check(matches(withText("402")));

        ViewInteraction appCompatImageView9 = onView(
                allOf(withId(R.id.backbtn),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView9.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}

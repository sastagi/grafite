package com.primedroid.grafite

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.filters.LargeTest
import android.support.test.runner.AndroidJUnit4
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
  @get:Rule
  var activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

  @Test
  fun test() {
    Espresso.onView(ViewMatchers.withId(R.id.hello)).check(matches(isDisplayed()))
  }
}
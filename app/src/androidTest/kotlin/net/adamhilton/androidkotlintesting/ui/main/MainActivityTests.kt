package net.adamhilton.androidkotlintesting.ui.main

import android.content.Intent
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import net.adamhilton.androidkotlintesting.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTests {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun mainActivity_whenGetDataButtonIsClicked_populatesScreenWithData() {
        activityRule.launchActivity(Intent())
        onView(withId(R.id.get_data_button)).perform(click())
        onView(withId(R.id.data))
                .check(matches(withText("Hello from MockDataService class!")))

    }
}

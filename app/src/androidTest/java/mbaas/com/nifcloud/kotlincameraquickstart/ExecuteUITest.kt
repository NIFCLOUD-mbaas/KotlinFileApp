package mbaas.com.nifcloud.kotlincameraquickstart

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ExecuteUITest {
    var tvTitle: ViewInteraction? = null
    var tvCMTitle: ViewInteraction? = null
    var imgMain: ViewInteraction? = null
    var btnStart: ViewInteraction? = null

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setup() {
        tvTitle = Espresso.onView(withId(R.id.textview))
        tvCMTitle = Espresso.onView(withId(R.id.textView))
        imgMain = Espresso.onView(withId(R.id.imageView))
        btnStart = Espresso.onView(withId(R.id.button))
    }

    @Test
    fun initialScreen() {
        tvTitle!!.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        tvTitle!!.check(ViewAssertions.matches(ViewMatchers.withText("NIFCLOUD mobile backend")))
        tvCMTitle!!.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        tvCMTitle!!.check(ViewAssertions.matches(ViewMatchers.withText("Camera Upload")))
        imgMain!!.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        btnStart!!.check(ViewAssertions.matches(ViewMatchers.withText("camera")))
    }
}
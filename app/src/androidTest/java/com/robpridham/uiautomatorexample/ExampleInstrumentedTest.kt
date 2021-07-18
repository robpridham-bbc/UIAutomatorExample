package com.robpridham.uiautomatorexample

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val rule = ExampleTestRule()

    @Test
    fun useAppContext() {
        // Context of the app under test.
        rule.launchActivity(null)

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val selector = UiSelector()
        val webPageTitle = device.findObject(selector.textContains("18 Websites"))
        val exists = webPageTitle.waitForExists(10000L)
        assertTrue(exists)
    }


}

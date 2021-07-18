package com.robpridham.uiautomatorexample

import androidx.test.rule.ActivityTestRule

class ExampleTestRule: ActivityTestRule<MainActivity>
    (MainActivity::class.java, false, false)

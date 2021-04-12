package com.test.bintudhillon.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.test.bintudhillon.utils.DriverUtils.getDriver;
import static com.test.bintudhillon.utils.DriverUtils.tearDown;

public class Hooks {

    @Before
    public void setUp() {
        getDriver();
    }

    @After
    public void teardown() {
        tearDown();
    }

}

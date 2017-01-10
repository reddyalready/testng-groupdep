package com.example;

import org.testng.annotations.Test;

public class TestParent {

    @Test(groups = "parent")
    public void parentTestRuns() {
        System.out.println("Running parent");
        assert true;
    }
}

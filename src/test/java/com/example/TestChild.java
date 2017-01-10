package com.example;

import org.testng.annotations.Test;

public class TestChild {

    @Test(groups = "child", dependsOnGroups = "parent")
    public void childTestRuns() {
        System.out.println("Running child");
        assert true;
    }

}

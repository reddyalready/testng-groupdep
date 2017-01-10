package com.example;

import org.testng.annotations.Test;

public class TestSuperChild {

    @Test(groups = "superchild", dependsOnGroups = "child")
    public void childTestRuns() {
        System.out.println("Running superchild");
        assert true;
    }
}

package com.TheMorpheusTutorial;

import org.junit.jupiter.api.Test;

public class JUnitTest {
    @Test
    public void test() {
        HelperClass h = new HelperClass();
        h.endless();
        org.junit.jupiter.api.Assertions.assertEquals("h not \"4\"", "4", h.j);

    }
}

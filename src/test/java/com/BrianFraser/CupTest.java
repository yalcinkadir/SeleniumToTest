package com.BrianFraser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals("Orange Juice", c.getLiquidType());
        c.write();

    }

    @Test
    void getPercentageFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals(85.5, c.getPercentFull());

    }

    @Test
    void setLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        String liq = c.getLiquidType();
        liq = "Water";
        c.setLiquidType(liq);
        assertEquals("Water", c.getLiquidType());

    }

}


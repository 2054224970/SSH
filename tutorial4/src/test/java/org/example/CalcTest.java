package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    void testSubtraction() {
        // 新的减法测试
        assertEquals(2, new Calculator().subtract(4, 2));
}

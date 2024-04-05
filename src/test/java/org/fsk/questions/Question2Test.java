package org.fsk.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void isPerfectNumber() {
        assertEquals(true, Question2.isPerfectNumber1(6));
    }

    @Test
    void isPerfectNumber2() {
        assertEquals(true, Question2.isPerfectNumber1(28));
    }

    @Test
    void isPerfectNumber3() {
        assertEquals(false, Question2.isPerfectNumber1(123871));
    }
}
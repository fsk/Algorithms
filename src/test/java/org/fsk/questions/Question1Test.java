package org.fsk.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void isPrime2() {

        assertEquals(
                false,
                Question1.isPrime2(16),
                "Test Error From FSK");

    }
}
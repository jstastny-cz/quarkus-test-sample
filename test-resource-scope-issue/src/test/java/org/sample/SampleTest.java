package org.sample;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

@QuarkusTest
public class SampleTest {

    @Test
    public void testPass() {
        Assertions.assertTrue(true);
    }
}
package org.sample;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


@QuarkusTest
@QuarkusTestResource(SampleTestResource.class)
public class SampleIT {

    @Test
    public void testPass() {
        Assertions.assertTrue(true);
    }
}
package org.sample;

import java.util.Map;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class SampleTestResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        throw new RuntimeException("Shouldn't have been started cause linked from Integration Test");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

}
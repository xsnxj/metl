package org.jumpmind.symmetric.is.core.runtime;

import org.jumpmind.symmetric.is.core.runtime.component.IComponent;

public class ExecutionTrackerNoOp implements IExecutionTracker {

    @Override
    public void beforeHandle(String executionId, IComponent component) {
    }

    @Override
    public void afterHandle(String executionId, IComponent component, Throwable error) {
    }

    @Override
    public void flowStepFinished(String executionId, IComponent component, Throwable error) {
    }

    @Override
    public void beforeFlow(String executionId) {
    }

    @Override
    public void afterFlow(String executionId) {
    }

    @Override
    public void log(String executionId, LogLevel level, IComponent component, String output) {
    }

}
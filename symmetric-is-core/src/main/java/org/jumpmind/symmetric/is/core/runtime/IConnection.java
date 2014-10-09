package org.jumpmind.symmetric.is.core.runtime;

import org.jumpmind.symmetric.is.core.config.Connection;

public interface IConnection {

    public void start(Connection connection);
    
    public void stop();
    
    public <T> T reference();
    
}

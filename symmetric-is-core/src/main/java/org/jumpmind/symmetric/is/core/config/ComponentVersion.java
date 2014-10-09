package org.jumpmind.symmetric.is.core.config;

import org.jumpmind.symmetric.is.core.config.data.ComponentVersionData;

public class ComponentVersion extends AbstractObject<ComponentVersionData> {

    private static final long serialVersionUID = 1L;

    Connection connection;
    
    public ComponentVersion() {
    }
    
    public ComponentVersion(ComponentVersionData data) {
        super(data);
    }

    public Connection getConnection() {
        return connection;
    }
    
}

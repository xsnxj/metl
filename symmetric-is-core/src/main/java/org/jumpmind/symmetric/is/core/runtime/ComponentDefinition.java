package org.jumpmind.symmetric.is.core.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ComponentDefinition {

    String typeName();
    
    ComponentSupports[] supports();
    
    ConnectionCategory connectionCategory() default ConnectionCategory.NONE;
    
}

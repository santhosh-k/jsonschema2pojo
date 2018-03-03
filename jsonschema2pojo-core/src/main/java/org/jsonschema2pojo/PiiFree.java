/**
 * 
 */
package org.jsonschema2pojo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author skalisamy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PiiFree {
  
  public boolean serialize() default true;

  public boolean deserialize() default true;
  
  public boolean enabled() default true;
  
}

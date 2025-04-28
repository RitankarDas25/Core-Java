package anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  //Make it available at runtime
// @Target(ElementType.METHOD)  //can be used on methods
@Target(ElementType.TYPE)  //can be used on class

public @interface Info {
	String coursename() default "SpringBoot";
	int duration() default 120;
}

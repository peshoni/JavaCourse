package com.sirma.itt.javacourse.reflectionannotationregex.arrangeobjects;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ITTE-1751 Arranging objects.
 * 
 * @author Petar Ivanov
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Hierarchy {
	/**
	 * The value of the annotation.
	 * 
	 * @return Value
	 */
	int value();
}

package com.sirma.itt.javacourse.reflectionannotationregex.classinfo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1748 Class info. class that contains methods and fields with different access modifiers. The class accepts an
 * instance of the class and displays the information on the object include the signature of the methods of the class of
 * object fields together with their types and values.
 * 
 * @author Petar Ivanov
 */
public final class ClassInfo {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClassInfo.class);
	private final static String NL = System.lineSeparator();

	/**
	 * Private constructor for utility classes.
	 */
	private ClassInfo() {
	}

	/**
	 * Gets information about methods of the class.
	 * 
	 * @param obj
	 *            Instance of class for which will receive information
	 * @return String with fields information.
	 */
	public static String getMethods(final Object obj) {
		Method[] methods = obj.getClass().getDeclaredMethods();
		StringBuilder classInfo = new StringBuilder();
		classInfo.append(String.format("%s%s.class%sMethods:%s", NL, (obj.getClass().getSimpleName()), NL, NL));
		for (Method method : methods) {
			method.setAccessible(true);
			classInfo.append(String.format("%s-%s%s", method.getName(), method.getReturnType().getSimpleName(), NL));
		}
		return classInfo.toString();
	}

	/**
	 * Gets information about fields of the class.
	 * 
	 * @param obj
	 *            Instance of class for which will receive information
	 * @return String with fields information.
	 */
	public static String getFields(final Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		final StringBuilder classInfo = new StringBuilder();
		classInfo.append(String.format("%sFields:%s", NL, NL));
		Arrays.asList(fields).forEach(e -> {
			e.setAccessible(true);
			try {
				classInfo.append(String.format("%s-%s-%s", e.getName(), e.getType(), e.get(obj).toString()));
			} catch (Exception ex) {
				LOGGER.info("Collect values exception.", ex);
			}
			classInfo.append(NL);
		});
		return classInfo.toString();
	}
}

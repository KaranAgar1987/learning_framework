package org.FrameworkAnnotation;


import org.enums.TestCategory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FrameworkAnnotation {

    public String[] author() default "Karan";

    public TestCategory[] Category() default {TestCategory.Regression};

}

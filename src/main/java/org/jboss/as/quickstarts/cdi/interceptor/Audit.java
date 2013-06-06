package org.jboss.as.quickstarts.cdi.interceptor;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@Retention(RUNTIME)
@Target({METHOD, TYPE})
@InterceptorBinding
public @interface Audit {
}

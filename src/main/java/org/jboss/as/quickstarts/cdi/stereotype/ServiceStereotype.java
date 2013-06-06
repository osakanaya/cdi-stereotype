package org.jboss.as.quickstarts.cdi.stereotype;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;

import org.jboss.as.quickstarts.cdi.interceptor.Audit;
import org.jboss.as.quickstarts.cdi.interceptor.Logging;

@Alternative
@Stereotype
@Audit
@Logging
@Retention(RUNTIME)
@Target(TYPE)
public @interface ServiceStereotype {
}

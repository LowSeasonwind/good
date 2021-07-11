package org.good.google.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Getter {
}

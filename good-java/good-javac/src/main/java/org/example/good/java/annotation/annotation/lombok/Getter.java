package org.example.good.java.annotation.annotation.lombok;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Getter {
}

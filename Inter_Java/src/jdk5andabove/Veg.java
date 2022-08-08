package jdk5andabove;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;; // [static[1] and runtime[last]-- Static Import]

@Retention(RUNTIME)// retention policy-Interface,Runtime-Static variable
public @interface Veg {

}

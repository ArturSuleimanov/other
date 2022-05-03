import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})    // this annotation is enabled for only fields and methods
@Retention(RetentionPolicy.RUNTIME)   // this annotation is available while running program
public @interface MethodInfo {
    String author() default "Artur";   // this field has defaul definition Artur
    int dateOfCreation() default 2022;
    String purpose() default "print Hello World";

}

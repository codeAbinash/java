package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME) // Will be available at runtime
@Documented // Will be included in the Javadoc
@Target(value = { java.lang.annotation.ElementType.TYPE }) // Can be applied to classes and interfaces
@Inherited // This will be inherited
@interface MyAnno {
  String author();

  String version() default "2.0.1";
}

@MyAnno(author = "Abinash Karmakar")
public class BuiltInUserDefined {
  public static void main(String[] args) {

  }
}

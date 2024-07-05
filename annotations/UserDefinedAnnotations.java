package annotations;

@interface MyAnno {
  String author();

  String version() default "2.0.1";

}

@MyAnno(author = "Abinash Karmakar") // version is optional
public class UserDefinedAnnotations {
  public static void main(String[] args) {

  }
}

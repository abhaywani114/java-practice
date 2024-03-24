import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface HttpRequest {
    String path() default "http://localhost/";
    String method();
    int responseStatus();
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnot {
    String hello();
}

@HttpRequest(method = "POST | GET | PUT", responseStatus = 500)
@TestAnnot(hello = "Selam pasha")
class HandleHttp {

    @HttpRequest(method = "GET", responseStatus = 400)
    public static void greetUser() {
        System.out.println("Hello user");
    }

    @HttpRequest(method = "POST", responseStatus = 404)
    @TestAnnot(hello = "hey")
    public void parseForm() {
        System.out.println("Parsing form");
    }
}

class AnnotationDemo2 {
    public static void main(String[] args) {
        try {
            Annotation[] annotations = HandleHttp.class.getAnnotations();
            

            for(Annotation a : annotations) {
                System.out.println("Found annotation: " + a);
            }   
            System.out.println();
            System.out.println(HandleHttp.class.getMethod("greetUser").getAnnotation(HttpRequest.class));
            System.out.println(HandleHttp.class.getMethod("parseForm").getAnnotation(HttpRequest.class));
           
            System.out.print("Is greetUser() have TestAnnot annotation: ");
            System.out.println(HandleHttp.class.getMethod("greetUser").isAnnotationPresent(TestAnnot.class));

            System.out.print("Is greetUser() have HttpRequest annotation: ");
            System.out.println(HandleHttp.class.getMethod("greetUser").isAnnotationPresent(HttpRequest.class));

            System.out.println();
            for (Annotation a: HandleHttp.class.getMethod("parseForm").getAnnotations())
                System.out.println("Found @nnotation: " + a);
        } catch(NoSuchMethodException e) {
            System.err.println(e);
        }
    }
    
}
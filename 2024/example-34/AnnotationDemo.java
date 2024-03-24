import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String str();
    int val();
}

class MyDemo {
    @MyAnnotation(str = "Abhay", val = 1941)
    public void printGreeting() {
        System.out.println("Let me greet you: Hello");
    }

    @MyAnnotation(str = "Zara", val = 241)
    public void printGreeting(int flag) {
        System.out.println("Let me greet you: Hello");
    }

}

class AnnotationDemo {
    public static void printAnnotation(MyAnnotation a1) {
        System.out.println("Annotation MyAnnotation: " + a1);
        System.out.println("Str: " + a1.str());    
        System.out.println("Str: " + a1.val());  
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)  {
        try {
            // Class classDemo = demo1.getClass();
            
            // Method printGreetingMethod;
            // printGreetingMethod = classDemo.getMethod("printGreeting");
            // MyAnnotation a1  = printGreetingMethod.getAnnotation(MyAnnotation.class);

            // printGreetingMethod = classDemo.getMethod("printGreeting", int.class);
            // MyAnnotation a2  = printGreetingMethod.getAnnotation(MyAnnotation.class);

            MyAnnotation a1  = MyDemo.class.getMethod("printGreeting").getAnnotation(MyAnnotation.class);
            MyAnnotation a2  = MyDemo.class.getMethod("printGreeting", int.class).getAnnotation(MyAnnotation.class);
            printAnnotation(a1);
            printAnnotation(a2);
        } catch (NoSuchMethodException e) {
            System.out.println("Exception found" + e);
        }
    }
    
}
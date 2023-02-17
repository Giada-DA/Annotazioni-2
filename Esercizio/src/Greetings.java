import java.lang.annotation.Annotation;


public class Greetings {
    @DevAnnotation(devName = "Jhon", devSurname = "Walker")
    public void sayWelcome(){
        System.out.println("Say welcome");
    }
    @DevAnnotation(devName = "Mark", devSurname = "Brown")
    public void sayGoodbye(){
        System.out.println("Say goodbye");
    }
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Student bean from the Spring container
        Student student = context.getBean("student", Student.class);

        // Set student details
        student.setStudentId(1);
        student.setFirstName("John");
        student.setLastName("Doe");

        // Access and print student details
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
    }
}

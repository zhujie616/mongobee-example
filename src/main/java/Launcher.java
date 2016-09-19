import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.getBean(Launcher.class).start();
    }

    public void start() {
        System.out.println("Mongobee example application has been started");
    }

}

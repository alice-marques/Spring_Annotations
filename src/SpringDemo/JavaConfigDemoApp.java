package SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public  static void main(String[] args){
        //read spring file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call bean method
        System.out.println(theCoach.getDailyWorkout());
        //call fortune
        System.out.println(theCoach.getDailyFortune());
        //close context
        context.close();
    }
}

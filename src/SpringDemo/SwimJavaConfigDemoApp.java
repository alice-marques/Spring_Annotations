package SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public  static void main(String[] args){
        //read spring file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //call bean method
        System.out.println(theCoach.getDailyWorkout());
        //call fortune
        System.out.println(theCoach.getDailyFortune());
        //close context
        context.close();
    }
}

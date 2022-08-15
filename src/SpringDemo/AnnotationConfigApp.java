package SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApp {
    public static void main(String[] args){
        //Read Spring file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSport.class);
        //Get beans
        Coach theCoach = context.getBean("handBallCoach", Coach.class);
        //Call bean methods
        System.out.println(theCoach.getDailyFortune());
        //Call other bean method
        System.out.println(theCoach.getDailyWorkout());
        //Close Context
        context.close();
    }
}

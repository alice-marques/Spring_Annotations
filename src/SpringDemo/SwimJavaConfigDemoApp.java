package SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public  static void main(String[] args){
        //read spring file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //call bean method
        System.out.println(theCoach.getDailyWorkout());
        //call fortune
        System.out.println(theCoach.getDailyFortune());

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());
        //close context
        context.close();
    }
}

package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public  static void main(String[] args){
        //read spring file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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

package SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    //default Constructor
    public TennisCoach(){
        System.out.println("TennisCoach: Default Constructor");
    }

    //@PostConstruct
    public void doStartupStuff(){
        System.out.println("TennisCoach: inside doStartupStuff()");
    }

    //@PreDestroy
    public void doCleanupStuff(){
        System.out.println("TennisCoach: inside doCleanupStuff");
    }

    //define setter
    /*@Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("TennisCoach: fortune setter");
        fortuneService = theFortuneService;
    }*/

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

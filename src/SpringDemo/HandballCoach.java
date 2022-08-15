package SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HandballCoach implements Coach{
    @Qualifier("newFortuneService")
    @Autowired
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Make 10 goals!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

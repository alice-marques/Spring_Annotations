package SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class KartCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Drive for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

package SpringDemo;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    public  SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Swim 1km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

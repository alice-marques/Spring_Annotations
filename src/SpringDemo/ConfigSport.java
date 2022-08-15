package SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigSport {
    @Bean
    public FortuneService newFortuneService(){return new NewFortuneService();}

    @Bean
    public Coach handBallCoach(){return new HandballCoach();}
}

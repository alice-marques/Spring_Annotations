package SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class NewFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "New Fortune!";
    }
}

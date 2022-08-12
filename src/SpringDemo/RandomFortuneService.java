package SpringDemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private String[] data ={
            "You are as I am with You.",
            "The ripest fruit falls first.",
            "Communicate!  It can't make things any worse.",
            "Nothing so needs reforming as other people's habits."
    };
    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}

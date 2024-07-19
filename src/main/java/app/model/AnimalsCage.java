package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal acat;
    private Animal adog;
    private Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal acat, @Qualifier("dog") Animal adog, Timer time) {
        this.acat = acat;
        this.adog = adog;
        this.time = time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(acat.toString() +", " + adog.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return this.time;
    }
}

import java.util.*;

interface LightBehavior {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightBehavior motion = () -> System.out.println("Lights ON with Motion Sensor");
        LightBehavior time = () -> System.out.println("Lights DIM at Night");
        LightBehavior voice = () -> System.out.println("Lights ON with Voice Command");
        motion.activate();
        time.activate();
        voice.activate();
    }
}

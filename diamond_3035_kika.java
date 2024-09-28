import javax.xml.stream.events.Characters;

public class diamond_3035_kika {
    public static void main(String[] args) {
        System.out.println("Krithika Ravishankar - 2022503035 - Diamond problem");
        TonyStark Rdj = new TonyStark();
        Rdj.fight();
    }
}
interface Marvelcharacters{
    void fight();
}

interface Og6 extends Marvelcharacters {
    default void fight(){
        System.out.println("The Marvel character is fighting now");
    }
}

interface Ironman extends Marvelcharacters {
    default void fight(){
        System.out.println("The Iron man Marvel character is fighting now");
    }
}



class TonyStark implements Og6, Ironman{
    public void fight(){
        Og6.super.fight();
        Ironman.super.fight();
        System.out.println("The Tony Stark Iron man Marvel character is fighting now");
    }
}
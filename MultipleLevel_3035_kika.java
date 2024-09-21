class Characters{
    String name;
    int Killrate ;
    Characters(String name){
        this.name = name;
    }

    void isAlive(){
        System.out.println(name + " is Alive right now ");
    }

}

class Witch extends Characters{
    String power;
    Witch(String name){
        super(name);
    }
    void Haspower(){
        System.out.println(name + " has magical abilities ");
    }
}

class Heroine extends Witch{
    String magic;
    Heroine(String name, String magic){
        super(name);
        this.magic = magic;
    }

    void isStrong(){
        System.out.println(name + " has "+magic);
    }
}
public class MultipleLevel_3035_kika {
    public static void main (String[] args){
        System.out.println("MultiLevel inheritence - Krithika - 2022503035");
        Heroine Wanda = new Heroine("Wanda", "Telekinesis");
        Wanda.isAlive();
        Wanda.Haspower();
        Wanda.isStrong();
    }
}

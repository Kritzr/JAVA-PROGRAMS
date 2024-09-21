
class Character{
    void isAlive(){
        System.out.println("The character is alive");
    }

}

class Assassin extends Character{
    void Strength(){
        System.out.println("Assassin can be used in close combat and secret killings");
    }
    void Magic(){
        System.out.println("Cannot use Magic");
    }
}
public class SingleInheritence_3035_kika {
    public static void main(String[] args){
        System.out.println("Single inheritence - Krithika - 2022503035");
        Assassin Natasha = new Assassin();
        Natasha.isAlive();
        Natasha.Strength();
        Natasha.Magic();
    }
}

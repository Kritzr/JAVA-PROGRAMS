class CharacterOfGame{
    String name;
    CharacterOfGame(String name){
        this.name = name;
    }
    void isAlive(){
        System.out.println(name + " is a not dead character ");
    }
    void isDead(){
        System.out.println(name + " is a dead character ");
    }
}
class Magician extends CharacterOfGame{
    Magician(String name){
        super(name);
    }
    void HasAbilities(){
        System.out.println(name + " has magical abilities");
    }
}

class Assassinator extends CharacterOfGame{
    Assassinator(String name){
        super(name);
    }

    void isStrong(){
        System.out.println(name + " has strong combat skills");
    }
}
public class HierarchicalInheritence_3035_kika {
    public static void main(String[] args){
        System.out.println("Hierarchical inheritence - Krithika - 2022503035");
        Magician Wanda = new Magician("Wanda");
        Assassinator Yelena = new Assassinator("Yelena");
        Wanda.isAlive();
        Wanda.HasAbilities();
        Yelena.isDead();
        Yelena.isStrong();
    }
}

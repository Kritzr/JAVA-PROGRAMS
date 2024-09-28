import java.io.FileNotFoundException;

class MarvelBase {
    public void processUnchecked() {
        throw new RuntimeException("Marvel Base Class: Unchecked Exception - RuntimeException");
    }

    public void processChecked() throws FileNotFoundException {
        throw new FileNotFoundException("Marvel Base Class: Checked Exception - FileNotFoundException");
    }
}

class MarvelHero extends MarvelBase {
    @Override
    public void processUnchecked() {
        throw new RuntimeException("Marvel Hero Class: Unchecked Exception - RuntimeException");
    }

    @Override
    public void processChecked() throws FileNotFoundException {
        throw new FileNotFoundException("Marvel Hero Class: Checked Exception - FileNotFoundException");
    }
}

public class overrideexception_3035_kika {
    public static void main(String[] args) {
        System.out.println("Krithika Ravishankar - 2022503035");

        MarvelBase hero = new MarvelHero();

        try {
            hero.processUnchecked();
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        try {
            hero.processChecked();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

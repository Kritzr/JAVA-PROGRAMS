import java.util.*;
import java.io.*;

class AvengersMission {
    public static String IronMan() throws FileNotFoundException {
        System.out.println("Iron Man is starting the mission.");
        return CaptainAmerica();
    }

    public static String CaptainAmerica() throws FileNotFoundException {
        System.out.println("Captain America is continuing the mission.");
        return Thor();
    }

    public static String Thor() throws FileNotFoundException {
        System.out.println("Thor is looking for the mission file...");

        File file = new File("mission.txt");
        if (!file.exists()) {
            System.out.println("Mission file not found!");
            throw new FileNotFoundException("Thor couldn't find the mission file!");
        } else {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        return "Mission Accomplished!";
    }
}

public class marvelflow_3035_kika {
    public static void main(String[] args) {
        System.out.println("Krithika Ravishankar - 2022503035");

        try {
            AvengersMission.IronMan();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

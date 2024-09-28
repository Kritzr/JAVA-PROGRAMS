import java.io.*;
import java.util.*;

class AvengersMissions {
    public static String TonyIron () {
        System.out.println("Iron Man is initiating the mission.");
        return CaptainAmerica();
    }

    public static String CaptainAmerica() {
        System.out.println("Captain America is continuing the mission.");
        return Thor();
    }

    public static String Thor() {
        System.out.println("Thor is checking the mission file...");

        File file = new File("mission.txt");
        if (!file.exists()) {
            System.out.println("Mission file not found!");
            throw new RuntimeException("Thor couldn't find the mission file!");
        } else {
            System.out.println("Mission file found! Reading the mission...");
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading the mission file.");
                throw new RuntimeException("Mission file is corrupted or missing!");
            }
        }
        return "Mission Accomplished!";
    }
}

public class Marvelflowunchecked_3035_kika {
    public static void main(String[] args) {
        System.out.println("Krithika Ravishankar - 2022503035");
        try {
            AvengersMissions.TonyIron();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}

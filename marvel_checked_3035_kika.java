import java.io.*;
import java.util.Scanner;

class CheckedMarvelException {
    public static void readMissionFile() throws FileNotFoundException {
        File file = new File("mission.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("Reading mission details...");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

public class marvel_checked_3035_kika {
    public static void main(String[] args) {
        System.out.println("Krithika - 2022503035");
        System.out.println("Marvel Checked Exception Handling");
        try {
            CheckedMarvelException.readMissionFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Hero is ready for the next mission!");
    }
}

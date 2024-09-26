import java.util.Scanner;

public class FrequencyCounter_2022503035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the Paragraph:");
        String para = scanner.nextLine();
        System.out.println("Enter the key:");
        String key = scanner.nextLine();

        int count = countKeyFrequency(para, key);
        System.out.println("Frequency of key " + key + " appears : " + count);
    }

    public static int countKeyFrequency(String para, String key) {
        int count = 0;
        for (int i = 0; i <= (para.length() - key.length()); i++) {
            boolean flag = true;
            for (int j = 0; j < key.length(); j++) {
                if (para.charAt(i + j) != key.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
}

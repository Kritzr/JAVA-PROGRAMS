import java.util.Scanner;
public class Character_count_2022503035_kika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_str;
        String output_str = "";
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string: ");
        input_str = sc.nextLine();
        input_str = input_str.toLowerCase();
        for (int i = 0; i < input_str.length(); i++) {
            char currentChar = input_str.charAt(i);
            if (output_str.indexOf(currentChar) == -1 ) {
                int count = 0;
                for (int j = 0; j < input_str.length(); j++) {
                    if (input_str.charAt(j) == currentChar) {
                        count++;
                    }
                }
                System.out.println(currentChar + " : " + count);
                output_str+=currentChar;
            }
        }


    }
}



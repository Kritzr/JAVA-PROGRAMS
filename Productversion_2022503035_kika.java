import java.util.Scanner;
public class Productversion_2022503035_kika {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input_str1;
        String input_str2;
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string 1 :");
        input_str1 = sc.nextLine();
        System.out.println("Enter the string 2 : ");
        input_str2 = sc.nextLine();
        String[] split_parts1 = input_str1.split("\\.");
        String[] split_parts2 = input_str2.split("\\.");
        for(int i =0; i < split_parts1.length; i++){
            int digit1 = Integer.parseInt(split_parts1[i]);
            int digit2 = Integer.parseInt(split_parts2[i]);

            if (digit1 > digit2) {
                System.out.println(input_str1 + " is greater than " + input_str2);
                return;
            } else if (digit1 < digit2) {
                System.out.println(input_str2 + " is greater than " + input_str1);
                return;
            }
        }

        System.out.println(input_str1 + " is equal to " + input_str2);
    }
}



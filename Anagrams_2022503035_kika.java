import java.util.Arrays;
import java.util.Scanner;
public class Anagrams_2022503035_kika {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String input_str1;
        String input_str2;
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string 1 : ");
        input_str1 = sc.nextLine();
        System.out.println("Enter the string 2 : ");
        input_str2 = sc.nextLine();
        if(CheckAnagram(input_str1, input_str2)){
            System.out.println("The two strings are anagrams of each other");
        }
        else{
            System.out.println("The two strings are not anagrams of each other ");
        }
    }
    public static boolean CheckAnagram(String input_str1, String input_str2){
        char[] Array1 = input_str1.toCharArray();
        char[] Array2 = input_str2.toCharArray();
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        Arrays.equals(Array1,Array2);
        if(Array1.length == Array2.length) {
            for (int i = 0; i < Array1.length; i++) {
                if (Array1[i] != Array2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

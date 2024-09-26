import java.util.Locale;
import java.util.Scanner;
public class Godd_2022503035_kika {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input ;
        String sub_not = "not";
        String sub_bad = "bad";
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string you want to check: ");
        input = sc.nextLine();
        input = input.toLowerCase();
        System.out.println("string: " +isFollowedBy(input) );


    }
    public static String isFollowedBy(String input){
        int notIndex = input.indexOf("not");
        int badIndex = input.indexOf("bad");
        if (notIndex != -1 && badIndex != -1 && notIndex < badIndex) {
            String good_str = input.substring(notIndex, badIndex + 3);
                    input = input.replace(good_str, "good");
                }

                return input;
            }
        }



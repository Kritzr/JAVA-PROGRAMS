import java.util.Scanner;
public class LetterOccurance_2022503035_kika {
    public static void main(String[] args){
        int index = 0 ;
        Scanner sc = new Scanner(System.in);
        String input_str;
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string: ");
        input_str = sc.nextLine();
        input_str = input_str.toLowerCase();
        int[]countChar = new int[26];
        for(int i =0; i<input_str.length(); i++){
            char Chartocheck = input_str.charAt(i);
            if(Chartocheck >= 'a' && Chartocheck <= 'z'){
                 index = Chartocheck - 'a';
            }
            countChar[index]++;
        }
        for (int i = 0; i < countChar.length; i++) {
            if (countChar[i] > 0) {
                System.out.println("the letter " +((char) (i + 'a')) + " occurs : " + countChar[i]);
            }
        }

    }

}

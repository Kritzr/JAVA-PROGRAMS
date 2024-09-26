import java.util.Scanner;
 class Pangram_2022503035_kika {
     public static void main(String[] args){
         int index = 0 ;
         boolean isPan = true;
         Scanner sc = new Scanner(System.in);
         String input_str;
         System.out.println("Krithika Ravishankar - 2022503035");
         System.out.println("Enter the string: ");
         input_str = sc.nextLine();
         input_str = input_str.toLowerCase();
         boolean[]countChar = new boolean[26];
         for(int i =0; i<input_str.length(); i++){
             char Chartocheck = input_str.charAt(i);
             if(Chartocheck >= 'a' && Chartocheck <= 'z'){
                 index = Chartocheck - 'a';
             }
             countChar[index]=true;
         }
         for (int i = 0; i < countChar.length; i++) {
             if (countChar[i] == false) {
                 isPan = false;
             }
         }
         if(isPan){
             System.out.println("The string is a Pangram");
         }
         else{
             System.out.println("The string is not a Pangram");
         }

     }
 }


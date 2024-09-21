import java.util.Scanner;
public class String_compression_kika_2022503035 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String input_str;
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string: ");
        input_str = sc.nextLine();
        Compression_string(input_str);
    }

    public static void Compression_string(String input_str){
        String output_str= "";
        int count = 1;
        char num = input_str.charAt(0);
        for(int i = 1; i<input_str.length(); i++){
            if(num == input_str.charAt(i)){
                count++;
            }
            else{
               output_str += Character.toString(num) + Integer.toString(count);
               num = input_str.charAt(i);
               count = 1;
            }
        }
        output_str += Character.toString(num) + Integer.toString(count);
        if(output_str.length() < input_str.length()){
            System.out.println("the compressed string is : "+ output_str);
        }


    }
}

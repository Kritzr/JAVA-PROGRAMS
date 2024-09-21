import java.util.Scanner;
public class Number_extract_2022503035_kika {

    public static void ExtractNumbers(String input_str){
        int count = 0;
        String output_str = "";
        for(int i = 0; i<input_str.length(); i++){
            char num = input_str.charAt(i);
            if(num>='0'  && num<='9'){
                //count = num - 48;
                //output_str = output_str+ count;
                output_str = output_str + num;
            }
        }
        System.out.println(output_str);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String input_str;
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string: ");
        input_str = sc.nextLine();
        ExtractNumbers(input_str);
    }

}

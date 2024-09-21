import java.util.Scanner;
public class ReverseString_2022503035_kika {

    public static String Reverse_string(String input_str){
        char[] char_Array = input_str.toCharArray();
        int left = 0;
        int right = (char_Array.length)-1;
        for(int i =0; i<char_Array.length; i++){
            if(left<right){
                char temp = char_Array[left];
                char_Array[left] = char_Array[right];
                char_Array[right] = temp;
            }
            left++;
            right--;
        }
        return new String (char_Array);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input_str;
        System.out.println("Krithika Ravishankar - 2022503035");
        System.out.println("Enter the string you want to reverse: ");
        input_str = sc.nextLine();
        System.out.println("String before reverse: "+ input_str);
        System.out.println("String after reverse: " + Reverse_string(input_str));
    }
}

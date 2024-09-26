import java.util.Scanner;
import java.util.Random;
public class Array_2022503035 {
// we are initialising the values as the members of the class so that when we create a object, it can be easily accessed.
    int size;
    int[] num_arr;
    char[] letter_arr;
    Random rd = new Random();// random is another feature just like the scanner
    Scanner sc = new Scanner(System.in);

    public void read () {
        int i;
        System.out.println("Krithika-2022503035 - random num-char array");
        size = sc.nextInt();
        num_arr = new int[size];
        letter_arr = new char[size];
        int randomNumber;
        for (i = 0; i < size; i++) {
            boolean flag = rd.nextBoolean();//random boolean value is generated, and oh that basis, we get the ascii value
            if (flag) {
                randomNumber= 65 + rd.nextInt(26);//here we are setting the bound of the random generation to be within 0-26
            } else {
                randomNumber = 97 + rd.nextInt(26);

            }
            num_arr[i] = randomNumber;
            letter_arr[i] = (char)randomNumber;//creating the same in char array by typecasting

        }
    }

    public void sort(){//bubble sort
        for(int i =0; i<size; i++){
            for(int j =0; j<size-(i+1); j++){
                if(num_arr[j]< num_arr[j+1]){
                    int temp = num_arr[j];
                    num_arr[j] = num_arr[j+1];
                    num_arr[j+1] = temp;
                }
            }
        }
    }

    public void displayLine(){
        for(int i =0; i<size; i++){
            System.out.print("------");//displays line_obviously
        }
    }

    public void display_full(){
        displayLine();
        System.out.println();
        System.out.print("|");
        for(int i =0; i<size; i++){
            System.out.printf("%4d |",i);//padding given to display as a matrix.
        }
        System.out.println();
        displayLine();
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < size; i++) {
            System.out.printf("%4d |", num_arr[i]);
        }
        System.out.println();
        displayLine();
        System.out.println();
        sort();

        System.out.print("|");
        for (int i = 0; i < size; i++) {
            System.out.printf("%4d |", num_arr[i]);
        }
        System.out.println();
        displayLine();
        System.out.println();

        System.out.print("|");
        for (int i = 0; i < size; i++) {
            System.out.printf("%4c |", num_arr[i]);//since the numbers are already sorted, we just type cast and display them as characters. This reduces another sorting and another array.
        }

    }
    public static void main(String[] args){
        Array_2022503035 obj = new Array_2022503035();
        obj.read();//objects are created and called
        obj.display_full();

    }
}

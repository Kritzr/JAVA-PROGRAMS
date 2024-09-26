import java.util.Scanner;
public class Date_kika {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Krithika_2022503035");
        System.out.println("Enter the year, month, and the date");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();

        int y = year-(14-month)/12;
        int x = y + y /4 - y / 100 + y / 400;
        int m = month + 12 *((14 - month)/12) - 2;
        int day = (date + x +(31 * m)/12)%7;

        switch(day){
            case 0: {
                System.out.println("It is a Sunday");
                break;
            }
            case 1: {
                System.out.println("It is a Monday");
                break;

            }
            case 2: {
                System.out.println("It is a Tuesday");
                break;

            }

            case 3: {
                System.out.println("It is a Wednesday");
                break;

            }
            case 4: {
                System.out.println("It is a Thursday");
                break;

            }
            case 5: {
                System.out.println("It is a Friday");
                break;

            }
            case 6: {
                System.out.println("It is a Saturday");
                break;

            }
            default: {
                System.out.println("Unexpected value! sorry cannot compute");
                break;

            }



        }



    }
}

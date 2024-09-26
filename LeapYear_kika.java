import java.util.Scanner;
public class LeapYear_kika {
    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Krithika_2022503035");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year that you wish to check: \t");
        int year = sc.nextInt();
        if(year>1000) {
            boolean checkLeap = isLeap(year);
            System.out.println(checkLeap);
            if (checkLeap) {

                System.out.println("The year " + year + " is a leap year");
            } else {
                System.out.println("The year " + year + " is not a leap year");
            }
            year++;
            while (!isLeap(year)) {
                year++;
            }
            System.out.println("The next leap is :" + year);
        }
        else{
            System.out.println("Enter a valid year");
        }
    }
}


import java.util.Scanner;
class numtoWord_kika {

    public static String converttoWord(int num) {
        String[] UNITS = {
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] TENS = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (num == 0) {
            return "Zero";
        }

        if (num < 20) {
            return UNITS[num];
        }

        if (num < 100) {
            return TENS[num / 10] + (num % 10 != 0 ? " " + UNITS[num % 10] : "");
        }

        return UNITS[num / 100] + " Hundred" + (num % 100 != 0 ? " and " + converttoWord(num % 100) : "");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Krithika_2022503035");
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num >0 && num <999){
            System.out.println(converttoWord(num));
        }
        else{
            System.out.println("Enter a number within the range 0 and 999");
        }
    }
}

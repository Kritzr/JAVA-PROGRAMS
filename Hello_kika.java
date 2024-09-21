import java.util.Scanner;

class Hello_kika{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Krithika_2022503035");
        System.out.println("Enter the number of names you wish to display");
        int number_name = sc.nextInt();
        sc.nextLine();
        if(number_name >0){
            String[] names = new String[number_name];
            for(int i=0; i<number_name ; i++){
                System.out.println("Enter the name "+(i+1) + ":\t");
                names[i] = sc.nextLine();

            }
            System.out.print("Hello, ");
            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                System.out.print(name +",");
            }
            System.out.print(" ! Good Morning!");
        }
        else{
            System.out.println("Helo! Good Morning!");
        }

    }
}
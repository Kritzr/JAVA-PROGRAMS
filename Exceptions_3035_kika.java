import java.util.*;

public class Exceptions_3035_kika {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("KRITHIKA R - 2022503035");
        System.out.println("Select an exception to demonstrate:");
        System.out.println("1. ArrayIndexOutOfBoundsException");
        System.out.println("2. ArrayStoreException");
        System.out.println("3. ClassCastException");
        System.out.println("4. IllegalArgumentException");
        System.out.println("5. IndexOutOfBoundsException");
        System.out.println("6. NegativeArraySizeException");
        System.out.println("7. NullPointerException");
        System.out.println("8. NumberFormatException");
        System.out.println("9. StringIndexOutOfBoundsException");
        System.out.println("10. UnsupportedOperationException");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                Arrayindexoutofbounds arrey = new Arrayindexoutofbounds();
                arrey.Arrayindex();
                break;
            case 2:
                Arraystore storeare = new Arraystore();
                storeare.Arrstore();
                break;
            case 3:
                classcast cc = new classcast();
                cc.classcastexception();
                break;
            case 4:
                illegalargumentexception IAE = new illegalargumentexception();
                IAE.illegalargument();
                break;
            case 5:
                Indexoutbound yeba = new Indexoutbound();
                yeba.indexoutbounds();
                break;
            case 6:
                Negative ney = new Negative();
                ney.negativearr();
                break;
            case 7:
                nullpointer npe = new nullpointer();
                npe.nullpointer();
                break;
            case 8:
                numberformatexception yemma = new numberformatexception();
                yemma.numberformatexception();
                break;
            case 9:
                stringindexoutofbounds ennama = new stringindexoutofbounds();
                ennama.stringindexoutofbounds();
                break;
            case 10:
                unsupportedexception idhu = new unsupportedexception();
                idhu.unsupported();
                break;
            default:
                System.out.println("Invalid choice, please select a number between 1 and 10.");
        }

    }
}

class Arrayindexoutofbounds{
    public void Arrayindex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for your array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i<size; i++){
            System.out.println("Enter the "+ (i +1) + "th element :");
            arr[i] = sc.nextInt();
        }

        for(int k:arr) System.out.println(k);

        try{
            System.out.println("enter the index you wish to print");
            int index = sc.nextInt();
            System.out.println(arr[index-1]);
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Array index that I tried to print is one index more than size and that is out of bounds " + aie.getMessage());
        }
    }
}
class Arraystore{
    public void Arrstore(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for your string array:");
        int size = sc.nextInt();
        sc.nextLine();
        Object [] Str_arr = new String[size];
        System.out.println("Enter the elements of the array:");

        try{
            for(int i = 0 ; i<size; i++){
                System.out.println("Enter the elements :");
                Str_arr[i] = sc.nextLine();
            }
            System.out.println("value to cause an exception:");
            int value = sc.nextInt();
            Str_arr[1] = value;

        }
        catch(ArrayStoreException ase){
            System.out.println("The value causes Array Store error:  " + ase.getMessage());
        }
        for(Object k: Str_arr) System.out.println(k);
    }
}

class classcast{
    public void classcastexception(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for your string array:");
        int sixe = sc.nextInt();
        sc.nextLine();
        Object [] castarr = new Object[sixe];
        System.out.println("Enter the elements of the array:");

        try{
            for(int i = 0 ; i<castarr.length; i++){

                castarr[i] = sc.nextLine();

            }
            castarr[sixe-1] = 2022503035;
            for(Object k: castarr){
                String output =(String) k;
                System.out.println(output);
            }
        }
        catch (ClassCastException cce){
            System.out.println("we made a class cast exception : "+cce.getMessage());
        }
    }
}
class illegalargumentexception{
    public void illegalargument(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wish to live:");
        try{
            int years = sc.nextInt();
            if(years>80) {
                throw new IllegalArgumentException();
            }
            System.out.println("You will be blessed to live that long");
        }
        catch(IllegalArgumentException iae){
            System.out.println("You are wishing way beyond luck as : "+ iae);
        }
    }
}

class Indexoutbound{
    public void indexoutbounds(){
        Scanner sc = new Scanner(System.in);
        List<String> Books = new ArrayList<>();
        System.out.println("Enter the number of books:");
        int books =  sc.nextInt();
        System.out.println("Enter the books you wish to enter in the list:");
        for (int i = 0; i < books; i++) {
            String element= sc.nextLine();
            Books.add(element);
        }
        try{
            System.out.println("Enter a index you wish to enter:");
            int idx = sc.nextInt();
            System.out.println("Book in index "+ idx + " is: "+Books.get(idx));
        }
        catch(IndexOutOfBoundsException ibe){
            System.out.println("The index you have requested is out of bounds as : " + ibe.getMessage());
        }

    }
}

class Negative {
    public void negativearr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        try {
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("The array index is fine ");
        } catch (NegativeArraySizeException nae) {
            System.out.println("The array index is negative!" + nae.getMessage());
        }
    }
}

class nullpointer{
    public void nullpointer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of string:");
        String check = sc.nextLine();
        if(check.equals("null")){
            check = null;
        }
        try{
            if(check.equals("something")){
            System.out.println("the string size is acceptable");
            }

        }
        catch(NullPointerException npe){
            System.out.println("the string size is not acceptable "+npe.getMessage());
        }
    }
}

class numberformatexception{
    public void numberformatexception(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wish to enter:");
        String value = sc.nextLine();
        try{
            int number = Integer.parseInt(value);
        }
        catch(NumberFormatException nfe){
            System.out.println("The string cannot be changed to it as : " + nfe.getMessage());
        }

    }
}
class stringindexoutofbounds{
    public void stringindexoutofbounds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wish to enter:");
        String value = sc.nextLine();
        try{
            System.out.println(value.charAt((value.length()+2)));
        }
        catch(StringIndexOutOfBoundsException sioob){
            System.out.println("The string I tried to print is out of bounds as : " + sioob.getMessage());
        }
    }
}

class unsupportedexception{
    public void unsupported(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of string you wish to enter:");
        int size = sc.nextInt();
        String array[] =  new String[size];
        for(int i = 0 ; i<array.length; i++){
            array[i] = sc.nextLine();
        }
        try {
            List<String> random = Arrays.asList(array);
            random.add("Krithika");
        }
        catch(UnsupportedOperationException uoe){
            System.out.println("Can't add Krithika as: "+uoe.getMessage() );
        }

    }
}
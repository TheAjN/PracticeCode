import java.io.UncheckedIOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 98;
        int y =0;
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));
      //  System.out.println(divide(x,y));

     //   int z = getInt();
   //     System.out.println(z);

     //   int stringValue = isItANumberLBYL();

        int intvalueEAFB = isItANumberEAFP();

  //      System.out.println("Integer value = "+ stringValue);
        System.out.println("Integer value = "+ intvalueEAFB);
    }

    public static int divideLBYL(int x, int y){ //loop before you leap
        if(y!=0){
            return x/y;
        }

        return 0;
    }

    public static int divideEAFP(int x, int y){ //easy to ask for forgiveness and permission

        try{
            return x/y;
        }catch(ArithmeticException e) {
            System.out.println("Exception called "+ e);
            return 0;
        }
    }


/*
    public static int divide(int x, int y){
        return x/y;
    }
*/

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        return sc;
    }

    // converting String to number (LBYL approach)
    public static int isItANumberLBYL(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value - ");
        String str = sc.next();
        boolean isValid = true;
        for (int i =0 ;i<str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isValid = false;
            }
        }
        if(isValid){
            return Integer.parseInt(str);
        }
        return 0;
    }


    //converting String to Integer (EAFP)
    public static int isItANumberEAFP(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value - ");
            int num = sc.nextInt();
            System.out.println("Execute this comment if exception is not present");
            return  num;
        }catch (InputMismatchException e){
            return 0;
        }
    }

}


import java.util.Scanner;

public class sum{
    public static Scanner scanner = new Scanner(System.in);

    public static int int_input(String msg){ //For user input
        System.out.print(msg);
        return scanner.nextInt();
    }
    public static void main(String[] args){
        //Variable set up
        int usr_int = 1;
        int sum = 0;

        while (usr_int != 0){
            usr_int = int_input("The sum of your numbers will be added together until you guess my super secret number: ");
            sum += usr_int;//Adds user input and sum.
        }
        System.out.println("Good job, you did it. Your sum is "+ sum); //Displays sum
    }
}

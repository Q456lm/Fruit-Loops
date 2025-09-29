import java.time.LocalDateTime;
import java.util.Scanner;

public class menu{
    public static Scanner scanner = new Scanner(System.in);
    public static int int_input(String msg){ //Gets user input easily
        System.out.print(msg);
        return scanner.nextInt();
    }
    public static void main(String[] args){
        int option = 0; //So option can be refrneced outside of the loop (Just in case)
        do{
            option = int_input("What do you want to do:\n1. Say Hello \n2. Get Date and Time\n3. Exit\n[1,2,3]: ");//Gets input
            if (option == 1){//If user wants option 1
                System.out.println("Hello");
            }else if (option == 2){//If user wants option 2
                System.out.println(LocalDateTime.now());
            }
        }while(option != 3);//If user wants option 3 it will close.
    }

}

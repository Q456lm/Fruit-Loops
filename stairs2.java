import java.util.Scanner;

public class stairs2{
    public static Scanner scanner = new Scanner(System.in);
    public static int int_input(String msg){//For integer input
        System.out.print(msg);
        return scanner.nextInt();
    }

    public static String single_input(String msg){//For single letter input (not char)
        System.out.print(msg);
        return scanner.nextLine().substring(0,1);
    }
    public static void main(String[] args){
        //Variable setup
        String char_thing = single_input("What symbol for your staircase: ");
        int space_amount = int_input("How long is your staircase: ");
        int cur_amount = space_amount;//Used so we can change current stair levels without affecting for loop

        for(int i = 1; i < space_amount+1; i++){//Will run for staricase length, so proper amount of stars are printed out.
            cur_amount = cur_amount-1;//Changes current amount so there are proper amount of spaces.
            System.out.println(" ".repeat(cur_amount)+char_thing.repeat(i));//Will multiply one space by amount of current spaces and whatever symbol entered by current valeu of i.
        }
    }
}

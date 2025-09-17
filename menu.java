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
            option = int_input("What do you want to do:\n1. Display Super Macho Man Wiki Page \n2. Learn about Mr. McCuen\n3. Exit\n[1,2,3]: ");//Gets input
            if (option == 1){//If user wants option 1
                System.out.println("Super Macho Man has made multiple video game appearances; his first appearance was as the WVBA World Champ in the arcade version of Super Punch-Out!! in 1984. Later, he became the very last boxer to fight against in the Japan-only, limited-edition, Famicom gold cartridge game simply called Punch-Out!!. Next, when Mike Tyson became the final boxer to fight against in Mike Tyson's Punch-Out!! (and later, Mr. Dream in Punch-Out!! featuring Mr. Dream), Super Macho Man became the champion of the World Circuit. His next appearance was when he became champion of the World Circuit in 1994's Super Punch-Out!! for the Super Nintendo Entertainment System. In his latest appearance on Punch-Out!! (Wii), he appears as the #1 contender in the World Circuit. He is a stereotypical bodybuilder, taunting Little Mac by flexing his pectoral muscles in Mike Tyson's Punch-Out!!, and incorporating his exercise routines into his powerful attacks in the SNES Super Punch-Out!!.\r\n" + //
                                        "\r\n" + //
                                        "His offense is similar to that of Soda Popinski (given that in most his 2D appearances he was in, he was a palette swap of Soda Popinski) with big uppercuts and hooks, except he has his own attack, the clothesline. He utilizes two versions of this punch; for the first one he simply spins around 360 degrees with his arms outstretched and throws a quick haymaker at Little Mac. The second is a stronger one that occurs once he gets up from being knocked down; this time he moves back a bit and then keeps spinning around seemingly until Mac can no longer dodge. Like the Bull Charge of Bald Bull, this one can also floor Mac in one strike.\r\n" + //
                                        "\r\n" + //
                                        "In the picture during profile mode in Mike Tyson's Punch-Out!!, Super Macho Man is tanned and has grey hair, but in the actual game, he has pale skin and black hair. This inconsistent appearance only occurs in the NES versions (due to limitations of the time).\r\n" + //
                                        "\r\n" + //
                                        "The music played for Super Macho Man in Punch-Out!! (NES) (also used for Von Kaiser and Great Tiger) is a quote from the classical composition \"Ride of the Valkyries\", though in the Wii version of Punch-Out!!, it is a short piece of music reminiscent of 60s music. Super Macho Man was also featured as a Hasbro action figure, in a Topps trading card series and in Valiant Comics Nintendo Comics System, appearing in the story \"Fox and Hounds.\""); //This was copy and pasted.
            }else if (option == 2){//If user wants option 2
                System.out.println("\r\n" + //
                                        "Instructor: Russ McCuen\r\n" + //
                                        "\r\n" + //
                                        "Email rjmccuen@waketech.edu\r\n" + //
                                        "\r\n" + //
                                        "BA, English - NC State\r\n" + //
                                        "\r\n" + //
                                        "BS, Computer Science - Oregon State\r\n" + //
                                        "\r\n" + //
                                        "MS, Computer Science - Ball State"); //Also copied and pasted.
            }
        }while(option != 3);//If user wants option 3 it will close.
    }

}

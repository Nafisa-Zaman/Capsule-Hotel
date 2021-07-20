import java.lang.reflect.Array;
import java.util.Scanner;

public class CapsuleHotel {
    public static void main(String[] args) {
        //Start Up, Welcome, Asks for size of capsule hotel, user input number of capsules, print [size] capsules available


        System.out.println("Welcome to Capsule-Capsule");

        System.out.println("============================");

        int size = NumberOfCapsules();
        System.out.println("Capsules available:" + size );

        mainMenu();
    }

    public static int NumberOfCapsules() {
        System.out.println("Please input the number of capsules in your hotel: ");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        return size ;
    }

public static int mainMenu() {
    System.out.println("Guest Menu");
    System.out.println("=================");
    System.out.println("1. Check In");
    System.out.println("2. Check Out");
    System.out.println("3. View Guests");
    System.out.println("4. Exit");
    System.out.println("Choose an Option [1 - 4]");

    Scanner console = new Scanner(System.in);

        int response = console.nextInt();

        if (response == 1) ;
        CheckIn();
        if (response == 2) ;
        CheckOut();
        if (response == 3) ;
        ViewGuests();
        if (response == 4) ;
        Exit();
return response;
}

public static void CheckIn() {
    System.out.println("Enter Guest Name");
    Scanner console = new Scanner(System.in);
    String guestName = console.nextLine();
    System.out.println("Guest Name: " + guestName);
    System.out.println("Choose a Capsule #[1 - 100]:");

    int value = console.nextInt();
 capsule = ;
    boolean success = false;
    while (success = false)


        if (capsule = null) {
            System.out.println("Success :)");
            System.out.println(guestName + "is booked in for Capsule #" + value);
            int success = true;
        }
        // capsule = guestName;
        else {
            System.out.println("Error :(");
        }
        mainMenu();
}
public static void CheckOut(){
    System.out.println("Guest Check Out");
    System.out.println("Capsule #[1 - 100"]);
    Scanner console = new Scanner(System.in);
    int value = console.nextInt();
boolean success = false
    }



public static void ViewGuests(){

    }

public static void Exit(){

    }

}





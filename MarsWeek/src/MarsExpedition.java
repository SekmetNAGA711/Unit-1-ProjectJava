import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Initializing Mars Expedition System...");
        Thread.sleep(1000);
        System.out.println("Booting mission data...");
        System.out.println("Initializing....");
        Thread.sleep(1500);
        System.out.println("Ready to launch");
        Thread.sleep(2000); // Sleep for 2 seconds

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Hi, " + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N: ");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are the team leader for a reason.");
        } else {
            System.out.println("Too bad you are the team leader. You have to go.");
        }


        System.out.print("How many people do you want on your team? ");
        int teamSize = input.nextInt();

        if (teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and at least 1 more member.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect-sized team. Good job.");
        } else if (teamSize < 0) {
            System.out.println("Invalid input. Team size cannot be negative.");
            teamSize = 2;
        }

        System.out.println("Your team size is: " + teamSize);

        System.out.print("You are allowed to bring one snack with you. What do you want to bring? ");
        input.nextLine();
        String snack = input.nextLine();

        System.out.println("Nice choice, you will be bringing " + snack + " with you.");

        System.out.println("Enter a letter from the list to choose a vehicle you want to use: " +
                "\nA. Mars Rover" +
                "\nB. Magical Charm horse" +
                "\nC. Transporting Rocket" +
                "\nD. Galaxy Spaceship\n");
        char vehicleChoice = input.next().charAt(0);
        String vehicleName = "";

        switch (vehicleChoice) {
            case 'A':
                vehicleName = "a Mars Rover";
                break;
            case 'B':
                vehicleName = " a Magical Charm horse";
                break;
            case 'C':
                vehicleName = "a Transporting Rocket";
                break;
            case 'D':
                vehicleName = "a Galaxy Spaceship";
                break;
            default:
                System.out.println("Invalid vehicle choice.");
        }

        System.out.println("You've chosen " + vehicleName + " as your vehicle.");


        System.out.println("Attention, " + name + "!");
        System.out.println("You are all set for the Mars Expedition!, Team size: " + teamSize + " Snack of choice: " + snack + " Chosen vehicle: " + vehicleName);


        System.out.println("Countdown to Blastoff...");

        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Blastoff!");
    }

    public static void main(String[] args) {
        try {
            MarsExpedition expedition = new MarsExpedition();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}







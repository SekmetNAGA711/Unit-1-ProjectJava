import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        System.out.println("Expedition Time... (Please wait)");
        Thread.sleep(1000);

        System.out.println("Welcome back from your expedition!, Time to catalog everything you found.");
        Thread.sleep(1000);
        ArrayList<String> rockSamples = new ArrayList<>();
        rockSamples.add("rock");
        rockSamples.add("weird rock");
        rockSamples.add("smooth rock");
        rockSamples.add("not rock");

        System.out.println("Rock samples downloaded successfully. List of samples:.");
        System.out.println(rockSamples);
        Thread.sleep(1000);
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");
        Thread.sleep(1000);
        System.out.println("Removing non-rocks...");
        Thread.sleep(1000);
        rockSamples.remove("not rock");
        Thread.sleep(1000);
        System.out.println("Perfect");
        System.out.println(rockSamples);

        Thread.sleep(1000);
        System.out.println("Loading fossil data...");
        Thread.sleep(1000);

        System.out.println("Fossil data downloaded.");

        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about? Bird, fish, or tooth? (Spelling and Spacing is important)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine().toLowerCase(); // Convert user input to lowercase

        if (fossilChoice.equals("bird")) {
            System.out.println("Fossil: Bird\nDescription: " + fossilDirectory.get("Bird Fossil"));
        } else if (fossilChoice.equals("fish")) {
            System.out.println("Fossil: Fish\nDescription: " + fossilDirectory.get("Fish Fossil"));
        } else if (fossilChoice.equals("tooth")) {
            System.out.println("Fossil: Tooth\nDescription: " + fossilDirectory.get("Tooth Fossil"));
        } else {
            System.out.println("Invalid choice. Please choose from Bird, Fish, or Tooth.");
        }


        Thread.sleep(700);
        System.out.println("Determining special supplies used...");
        Thread.sleep(700);

        HashSet<String> specialSupplies = new HashSet<>();
        specialSupplies.add("Satellite Transmitter");
        specialSupplies.add("Solar Tracking Device");
        specialSupplies.add("First Aid Kit");

        System.out.println("Supplies Before Expedition:");
        for (String supply : specialSupplies) {
            System.out.println("- " + supply);
        }
        specialSupplies.remove("First Aid Kit");
        Thread.sleep(700);
        System.out.println("Supplies After Expedition:");
        for (String supply : specialSupplies) {
            System.out.println("- " + supply);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        FindingsList findingsList = new FindingsList();
    }
}

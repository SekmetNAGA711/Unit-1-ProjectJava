
public class Mars {
    public static void main(String[] args) throws InterruptedException {
        
        
        String colonyName = "Land of Fairies";

        int shipPopulation = 300;
        double meals = 4000.00;

        boolean landing = landingCheck(4);
        int days = 2;

        //calculate total meals consumed for 2 days
        double mealsConsumed = (shipPopulation * 0.75) * days;
        System.out.println("Meals consumed in 2 days : " + mealsConsumed);

        //calculate meals remaining from 2 days of consumption
        double remainingMealsAfterLanding = (meals - mealsConsumed);
        System.out.println("Remaining meals after landing: " + remainingMealsAfterLanding);

        //calculate increased meals from finding crate
        meals = (meals * 0.5) + meals;
        System.out.println("Increase meals after finding crate: " + meals);

        //calculate increase in population
        shipPopulation += 5;
        System.out.println("Increase in population: " + shipPopulation);


        String landingLocation = "The Ocean";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }


        GuessingGame game = new GuessingGame();
        game.playGame();

        MarsExpedition expedition = new MarsExpedition();
        FindingsList listItems = new FindingsList();

    }


    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("left");
            } else if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;

    }



}

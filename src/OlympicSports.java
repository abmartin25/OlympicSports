public class OlympicSports {
    public static void main(String[] args) {
        // Step 1: Create 5 NSFs and 15 players.
        NSF usaBasketball = new NSF("United States", "Basketball");
        NSF usaSoccer = new NSF("United States", "Soccer");
        NSF canadaHockey = new NSF("Canada", "Hockey");
        NSF canadaSkiing = new NSF("Canada", "Skiing");
        NSF japanBaseball = new NSF("Japan", "Baseball");

        Player player1 = new Player("Amy", "Tam");
        Player player2 = new Player("Bob", "Smith");
        Player player3 = new Player("Charlie", "Lee");
        Player player4 = new Player("David", "Kim");
        Player player5 = new Player("Emily", "Chang");
        Player player6 = new Player("Frank", "Wong");
        Player player7 = new Player("Grace", "Ng");
        Player player8 = new Player("Henry", "Liu");
        Player player9 = new Player("Isabella", "Chen");
        Player player10 = new Player("Jack", "Wu");
        Player player11 = new Player("Katie", "Lam");
        Player player12 = new Player("Lucas", "Zhang");
        Player player13 = new Player("Maggie", "Yu");
        Player player14 = new Player("Nathan", "Lin");
        Player player15 = new Player("Olivia", "Ma");

        // Step 2: For each of the 5 NSFs, add at least 3 players to them.
        usaBasketball.addPlayer(player1);
        usaBasketball.addPlayer(player2);
        usaBasketball.addPlayer(player3);
        usaSoccer.addPlayer(player4);
        usaSoccer.addPlayer(player5);
        usaSoccer.addPlayer(player6);
        canadaHockey.addPlayer(player7);
        canadaHockey.addPlayer(player8);
        canadaHockey.addPlayer(player9);
        canadaSkiing.addPlayer(player10);
        canadaSkiing.addPlayer(player11);
        canadaSkiing.addPlayer(player12);
        japanBaseball.addPlayer(player13);
        japanBaseball.addPlayer(player14);
        japanBaseball.addPlayer(player15);

        // Step 3: Take 3 players and add at least 2 national sports federations to each of them.
        player1.addNSF(usaBasketball);
        player1.addNSF(usaSoccer);
        player2.addNSF(usaBasketball);
        player2.addNSF(canadaHockey);
        player3.addNSF(usaBasketball);
        player3.addNSF(canadaSkiing);

        // Step 4: Create 2 ISFs.
        ISF isf1 = new ISF("International Sports Federation 1");
        ISF isf2 = new ISF("International Sports Federation 2");

        // The first ISF has 3 national sports federations.
        isf1.addNSF(usaBasketball);
        isf1.addNSF(usaSoccer);
        isf1.addNSF(canadaHockey);

        // The second ISF has the remaining 2 national sports federations.
        isf2.addNSF(canadaSkiing);
        isf2.addNSF(japanBaseball);

        // Step 5: Create an IOC that contains the 2 ISFs.
        IOC ioc = new IOC("International Olympic Committee");





    }
}
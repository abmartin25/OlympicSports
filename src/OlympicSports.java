public class OlympicSports {
    public static void main(String[] args) {
        // Create 5 NSFs and 15 players
        NSF nsf1 = new NSF("USA", "Basketball");
        NSF nsf2 = new NSF("Spain", "Soccer");
        NSF nsf3 = new NSF("Japan", "Baseball");
        NSF nsf4 = new NSF("Brazil", "Volleyball");
        NSF nsf5 = new NSF("France", "Fencing");

        Player[] players = {
                new Player("Amy", "Tam"),
                new Player("Bob", "Lee"),
                new Player("Charlie", "Yu"),
                new Player("David", "Chen"),
                new Player("Emily", "Wang"),
                new Player("Frank", "Chang"),
                new Player("Grace", "Zhang"),
                new Player("Henry", "Liu"),
                new Player("Isabel", "Yang"),
                new Player("Jack", "Zhao"),
                new Player("Karen", "Gao"),
                new Player("Larry", "Xu"),
                new Player("Mary", "Lin"),
                new Player("Nancy", "Hu"),
                new Player("Oliver", "Sun")
        };

        // For each of the 5 NSFs, add at least 3 players to them
        nsf1.addPlayer(players[0]);
        nsf1.addPlayer(players[1]);
        nsf1.addPlayer(players[2]);

        nsf2.addPlayer(players[3]);
        nsf2.addPlayer(players[4]);
        nsf2.addPlayer(players[5]);

        nsf3.addPlayer(players[6]);
        nsf3.addPlayer(players[7]);
        nsf3.addPlayer(players[8]);

        nsf4.addPlayer(players[9]);
        nsf4.addPlayer(players[10]);
        nsf4.addPlayer(players[11]);

        nsf5.addPlayer(players[12]);
        nsf5.addPlayer(players[13]);
        nsf5.addPlayer(players[14]);

        // Take 3 players and add at least 2 national sports federations to each of them
        players[0].addNSF(nsf2);
        players[0].addNSF(nsf3);

        players[1].addNSF(nsf1);
        players[1].addNSF

    }
}
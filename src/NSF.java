import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NSF {
    private String country;
    private String sport;
    private List<Player> players;

    public NSF(String country, String sport) {
        this.country = country;
        this.sport = sport;
        this.players = new ArrayList<>();
    }

    public String toString() {
        return country + " " + sport;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public int countPlayers() {
        return players.size();
    }

    public void listNSFPlayers() {
        System.out.print("NSF " + country + " " + sport + "'s players: ");
        for (Player player : players) {
            System.out.print(player.getName() + ", ");
        }
        System.out.println();
    }
}

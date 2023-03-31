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
        players = new ArrayList<Player>();


    }
    public String getCountry() {
        return country;
    }

    public String getSport() {
        return sport;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String toString() {
        return country + " " + sport;
    }

    public void listNSFPlayers() {
        System.out.print("NSF " + country + " " + sport + "'s players: ");
        for (int i = 0; i < players.size(); i++) {
            if (i == players.size() - 1) {
                System.out.print(players.get(i).getFirstName() + " " +players.get(i).getLastName());
            } else {
                System.out.print(players.get(i).getFirstName() + " " + players.get(i).getLastName() + ", ");
            }
        }
        System.out.println();
    }
}

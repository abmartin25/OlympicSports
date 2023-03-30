import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ISF {
    private String name;
    private List<NSF> nsfs;

    public ISF(String name) {
        this.name = name;
        this.nsfs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NSF> getNSFs() {
        return nsfs;
    }

    public void addNSF(NSF nsf) {
        nsfs.add(nsf);
    }

    public int countNSFs() {
        return nsfs.size();
    }

    public int countPlayersInNSFs() {
        Set<Player> players = new HashSet<>();
        for (NSF nsf : nsfs) {
            players.addAll(nsf.getPlayers());
        }
        return players.size();
    }




}

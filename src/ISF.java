import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ISF extends IOC {
    private String name;
    List<NSF> nsfs = new ArrayList<NSF>();

    public ISF(String name) {
        super();
        this.name = name;


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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IOC {
    private String continent;
    private List<ISF> isfs;

    public IOC(String continent) {
        this.continent = continent;
        this.isfs = new ArrayList<>();
    }

    public void addISF(ISF isf) {
        isfs.add(isf);
    }

    public int countNSFs() {
        int count = 0;
        for (ISF isf : isfs) {
            count += isf.countNSFs();
        }
        return count;
    }

    public int countPlayersInISFNSFs() {
        int count = 0;
        for (ISF isf : isfs) {
            count += isf.countPlayersInNSFs();
        }
        return count;
    }
}

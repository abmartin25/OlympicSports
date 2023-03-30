import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IOC {
    private String name;
    private List<ISF> isfs;

    public IOC(String name) {
        this.name = name;
        this.isfs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ISF> getISF() {
        return isfs;
    }

    public void setISF(List<ISF> isfs) {
        this.isfs = isfs;
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

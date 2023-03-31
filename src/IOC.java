import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IOC {
    private String name;
    List<ISF> isfs = new ArrayList<ISF>();

    public IOC() {
        this.name = "International Olympic Committee";


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

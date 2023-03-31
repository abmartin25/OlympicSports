import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IOC {
    private String name;
    private ArrayList<ISF> isfs;


    public IOC(String n) {
        this.name = n;
        isfs = new ArrayList<ISF>();


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

    public void setISF(List<ISF> isf) {
        this.isfs = new ArrayList<>(isf);
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

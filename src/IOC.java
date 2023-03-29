import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IOC {
    private List<?> isfs;

    public IOC() {
        this.isfs = new ArrayList<>();
    }

    public int countNSFs() {
        int count = 0;
        for (Object isf : this.isfs) {
            if (isf instanceof List<?>) {
                count += ((List<?>) isf).size();
            }
        }
        return count;
    }

    public int countPlayersinISFNSFs() {
        Set<String> players = new HashSet<>();
        for (Object isf : this.isfs) {
            if (isf instanceof List<?>) {
                for (Object nsf : (List<?>) isf) {
                    if (nsf instanceof NSF) {
                        players.addAll(((NSF) nsf).getPlayers());
                    }
                }
            }
        }
        return players.size();
    }
}

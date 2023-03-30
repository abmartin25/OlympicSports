import java.util.List;
//need tostring,
public class Player {

    private String firstName;
    private String lastName;
    private List<NSF> nsfs;

    Player (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nsfs = null;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setNSFs(List<NSF> NSF){
        this.nsfs=NSF;
    }

    public List<NSF> getNSFs(){
        return nsfs;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }


    public void listPlayersNSFs() {
        System.out.print(firstName +" " + lastName + " NSFs: ");
        for (NSF nsf : nsfs) {
            System.out.print(nsf.getCountry() + " "+ nsf.getSport()+", ");
        }
        System.out.println();
    }
    public void addNSF(NSF nsf){
        nsfs.add(nsf);
    }

    public String toString() {
        return firstName + " " + lastName;
    }


    }


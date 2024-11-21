import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DAO {
    private List<String> myTeam = Stream.of("Razak","Rasheedha","Annamalai").collect(Collectors.toList());

    public List<String> getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(List<String> myTeam) {
        this.myTeam = myTeam;
    }
    
}
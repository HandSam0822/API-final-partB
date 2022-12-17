import java.util.Map;
import java.util.Set;

public class Election {
    private String id;
    // key is the candidate id, value is a set of voter who voted for that candidate
    private Map<String, Set<Voter>> voteResult;
    public Election(String id) {
        this.id = id;
    }

}

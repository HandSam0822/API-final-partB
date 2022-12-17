import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Organizer extends Person{
    public Organizer(String uuid, String name) {
        super(uuid, name);
    }
    public Election createElection() {
        String ballotId = generateBallotId();
        return new Election(ballotId);
    };
    public void addCandidate(Election election, Candidate candidate){};
    public void addAllCandidate(Election election, List<Candidate> candidates){};
    public void removeCandidate(Election election, Candidate candidate){};
    public void removeAllCandidate(String ballotId, List<Candidate> candidates){};

    /**
     * Return a list of voters who has voted on an election
     * @param election the election to get voter
     * @return a list of voters who has voted on an election
     */
    public List<Voter> getVoter(Election election){
        return new ArrayList<>();
    };


    /**
     * Get the vote result of an election
     * @param election the elction that organizer want to get all candidated
     * @return a map of where key is the candidate id and value is the number they get voted
     */
    public Map<String, Long> getVoteResult(Election election){
        return new HashMap<>();
    };

    public void grantPermission(Election ballot, Voter voter, VotePermission permission, int numOfBallot) {}

    /**
     * Grant all permission in VotePermission to a voter
     * @param election the election that voter and is granted permission
     * @param voter voter who is granted the permission
     * @param numOfBallot number of ballot the voter is allowed to vote
     */
    public void grantAllPermission(Election election, Voter voter, int numOfBallot) {
    }

    private String generateBallotId(){return "";}};

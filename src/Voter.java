import java.util.ArrayList;
import java.util.List;

public class Voter extends Person{
    public Voter(String uuid, String name) {
        super(uuid, name);
    }

    /**
     * Voter vote for specific candidate. If voter has voted this candidate before and has no
     * update permission, SecurityException is thrown. Otherwise, the vote still counts
     * @param election the election that the vote is taking place
     * @param candidate candidate that voter want to vote for
     * @return number of vote remaining for current voter to vote on an election
     */
    public int vote(Election election, Candidate candidate) throws SecurityException{return 0;};

    /**
     * View all candidate that voter has voted in an election
     * @param election the election vote before
     * @return the list of Candidate that voter has voted for before.
     * If voter never vote in an election, an empty List is returned
     */
    public List<Candidate> viewVote(Election election){return new ArrayList<>();};

}

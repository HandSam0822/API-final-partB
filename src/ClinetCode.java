import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ClinetCode {
    public static void main(String[] args) {
        Organizer organizer = new Organizer("1", "Sam");
        Voter voter1 = new Voter("2", "David");
        Voter voter2 = new Voter("3", "Dan");
        Candidate candidate1 = new Candidate("4", "Jack");
        Candidate candidate2 = new Candidate("5", "Ana");
        Candidate candidate3 = new Candidate("6", "Wendy");

        Election election = organizer.createElection();
        organizer.addCandidate(election, candidate1);
        organizer.addAllCandidate(election, Arrays.asList(candidate2, candidate3));
        organizer.removeCandidate(election, candidate2);
        organizer.grantPermission(election, voter1, VotePermission.Viewable, 2);
        organizer.grantAllPermission(election, voter2, 1);
        int voteRemain = voter1.vote(election, candidate1);
        List<Voter> votersForElection = organizer.getVoter(election);
        Map<String, Long> voteResult = organizer.getVoteResult(election);

    }
}

/* Time Complexity: O(n) -> Number of Competitions
Space Complexity: O(t) -> Number of Teams */ 

import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    String bestTeam = "";
    HashMap<String, Integer> resultsHashMap = new HashMap<String, Integer>();
    resultsHashMap.put(bestTeam, 0);
    for(int i=0; i<competitions.size(); i++) {
      String homeTeam = competitions.get(i).get(0);
      String awayTeam = competitions.get(i).get(1);
      String winnerTeam = "";
      if(results.get(i) == 1) {
        winnerTeam = homeTeam;
      }
      else{
        winnerTeam = awayTeam;
      }
      if(resultsHashMap.containsKey(winnerTeam)) {
         resultsHashMap.put(winnerTeam, (resultsHashMap.get(winnerTeam) + 3));
        
      }else{
        resultsHashMap.put(winnerTeam, 3);
      }
      if(resultsHashMap.get(winnerTeam) > resultsHashMap.get(bestTeam)) {
        bestTeam = winnerTeam;
      }
    }
    return bestTeam;
  }
}

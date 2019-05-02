package medium.r;

import java.util.*;

/**
 * Created by jsong on 2019-05-01.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Reconstruct Itinerary (https://leetcode.com/problems/reconstruct-itinerary/)
 */
public class ReconstructItinerary {
  // Eulerian Path. Greedy DFS,
  HashMap<String, PriorityQueue<String>> routes = new HashMap<>();
  LinkedList<String> itinerary = new LinkedList<>();

  public List<String> findItinerary(List<List<String>> tickets) {

    boolean dfs = false;
    for (List<String> ticket : tickets) {
      String from = ticket.get(0);
      String to = ticket.get(1);
      if (!routes.containsKey(from)) {
        routes.put(from, new PriorityQueue<>());
      }
      PriorityQueue<String> arrivals = routes.get(from);
      arrivals.add(to);
    }

    // iteration
    if (!dfs) {
      Stack<String> stack = new Stack<>();
      String departure = "JFK";
      stack.push(departure);
      while (!stack.isEmpty()) {
        departure = stack.peek();
        while (routes.containsKey(departure) && !routes.get(departure).isEmpty()) {
          departure = routes.get(departure).poll();
          stack.push(departure);
        }
        itinerary.add(0, stack.pop());
      }
    }

    // dfs
    if (dfs) {
      travel("JFK");
    }

    return itinerary;
  }

  // dfs
  private void travel(String departure) {
    while (routes.containsKey(departure) && !routes.get(departure).isEmpty()) {
      travel(routes.get(departure).poll());
    }
    itinerary.addFirst(departure);
  }
}

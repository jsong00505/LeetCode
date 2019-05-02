package medium.e;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by jsong on 01/05/2019.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Evaluate Division(https://leetcode.com/problems/evaluate-division/)
 */
public class EvaluateDivision {
  private Map<String, Map<String, Double>> graph = new HashMap<>();

  public double[] calcEquation(
      List<List<String>> equations, double[] values, List<List<String>> queries) {
    buildGraph(equations, values);
    double[] result = new double[queries.size()];
    for (int i = 0; i < queries.size(); i++) {
      result[i] = getPathWeight(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>());
    }
    return result;
  }

  private double getPathWeight(String start, String end, HashSet<String> visited) {
    // no path
    if (!graph.containsKey(start)) {
      return -1.0;
    }

    // right path
    if (graph.get(start).containsKey(end)) {
      return graph.get(start).get(end);
    }

    // don't visit again if visit once
    visited.add(start);
    Map<String, Double> paths = graph.get(start);
    for (String s : paths.keySet()) {
      if (!visited.contains(s)) {
        double weight = getPathWeight(s, end, visited);
        if (weight != -1.0) {
          return paths.get(s) * weight;
        }
      }
    }

    return -1.0;
  }

  private void buildGraph(List<List<String>> equations, double[] values) {
    for (int i = 0; i < equations.size(); i++) {
      String u = equations.get(i).get(0);
      String v = equations.get(i).get(1);
      graph.putIfAbsent(u, new HashMap<>());
      graph.get(u).put(v, values[i]);
      graph.putIfAbsent(v, new HashMap<>());
      graph.get(v).put(u, 1.0 / values[i]);
    }
  }
}

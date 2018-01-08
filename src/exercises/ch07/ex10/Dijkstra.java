package exercises.ch07.ex10;

import java.util.*;

public class Dijkstra {

    private Map<String, Set<Neighbour>> graph = new HashMap<>();
    private Map<String, Integer> distance = new HashMap<>();
    private Map<String, String> previous = new HashMap<>();
    private PriorityQueue<String> unvisited = new PriorityQueue<>(Comparator.comparingInt(distance::get));
    private String start;

    Dijkstra(String start) {
        this.start = start;
    }

    public void shortestPath() {
        graph.forEach((city, neighbours) -> {
            if (city.equals(start)) {
                distance.put(start, 0);
            } else {
                distance.put(city, Integer.MAX_VALUE);
            }
            unvisited.add(city);
        });
        while (!unvisited.isEmpty()) {
            String minDistanceCity = unvisited.poll();
            graph.get(minDistanceCity).forEach(neighbour -> {
                if (distance.get(neighbour.name) > distance.get(minDistanceCity) + neighbour.distance) {
                    distance.put(neighbour.name, distance.get(minDistanceCity) + neighbour.distance);
                    previous.put(neighbour.name, minDistanceCity);
                    // Reorder Priority Queue by removing then adding neighbour with changed distance
                    unvisited.remove(neighbour.name);
                    unvisited.add(neighbour.name);
                }
            });
        }
    }

    public void addCity(String city, Neighbour... neighbours) {
        graph.put(city, new HashSet<>(Arrays.asList(neighbours)));
    }

    public String routeTo(String city) {
        List<String> route = new ArrayList<>(Collections.singleton(city));

        while (previous.containsKey(city)) {
            city = previous.get(city);
            route.add(city);
        }
        return route.stream().reduce((x, y) -> y + " -> " + x).get();
    }

    public Map<String, Integer> getDistance() {
        return distance;
    }

    public Map<String, String> getPrevious() {
        return previous;
    }

    static class Neighbour {
        String name;
        int distance;

        Neighbour(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }

        @Override
        public String toString() {
            return "Neighbour{" +
                    "name='" + name + '\'' +
                    ", distance=" + distance +
                    '}';
        }
    }
}
package exercises.ch07.ex10;

public class DijkstraTest {
    public static void main(String[] args) {
        new DijkstraTest().launch();
    }

    private void launch() {
        Dijkstra dijkstra = new Dijkstra("bristol");
        dijkstra.addCity("bristol",
                new Dijkstra.Neighbour("bath", 30),
                new Dijkstra.Neighbour("yeovil", 60));
        dijkstra.addCity("yeovil",
                new Dijkstra.Neighbour("poole", 45),
                new Dijkstra.Neighbour("bristol", 60),
                new Dijkstra.Neighbour("exeter", 20));
        dijkstra.addCity("bath",
                new Dijkstra.Neighbour("bristol", 30),
                new Dijkstra.Neighbour("poole", 25));
        dijkstra.addCity("poole",
                new Dijkstra.Neighbour("yeovil", 45),
                new Dijkstra.Neighbour("bath", 25),
                new Dijkstra.Neighbour("exeter", 10));
        dijkstra.addCity("exeter",
                new Dijkstra.Neighbour("yeovil", 20),
                new Dijkstra.Neighbour("poole", 10));
        dijkstra.shortestPath();
        System.out.println("\nSHORTEST PATHS\n");
        dijkstra.getDistance().forEach((x, y) -> System.out.println(x + ": " + y));
        System.out.println("\nPREVIOUS CITIES\n");
        dijkstra.getPrevious().forEach((x, y) -> System.out.println(x + ": " + y));
        System.out.println("\nROUTE TO EXETER\n");
        System.out.println(dijkstra.routeTo("exeter"));
        System.out.println("\nROUTE TO POOLE\n");
        System.out.println(dijkstra.routeTo("poole"));
        System.out.println("\nROUTE TO YEOVIL\n");
        System.out.println(dijkstra.routeTo("yeovil"));
        System.out.println("\nROUTE TO BATH\n");
        System.out.println(dijkstra.routeTo("bath"));

    }
}
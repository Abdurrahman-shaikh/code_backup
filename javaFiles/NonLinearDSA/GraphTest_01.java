import java.util.Scanner;

class TestGraph {
    public static void main(String[] args) {
//        Graph g = new Graph(5, false);
//        System.out.println(g.V());
//        System.out.println(g.E());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of edges you want to insert: ");
        int numEdges = scanner.nextInt();
	Graph g1 = new Graph(numEdges,false);

        for (int i = 0; i < numEdges; i++) {
            System.out.print("Enter the source vertex of edge " + (i + 1) + ": ");
            int source = scanner.nextInt();

            System.out.print("Enter the destination vertex of edge " + (i + 1) + ": ");
            int destination = scanner.nextInt();

            Edge edge = new Edge(source, destination);
            g1.insert(edge);
        }

        scanner.close();

        System.out.println(g1.V());
        System.out.println(g1.E());
    }
}

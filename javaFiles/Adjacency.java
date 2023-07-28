import java.util.*;

class ADemo {
    public static void main(String[] args) {
        boolean[][] adjacencyMatrix = {
            {false, true, true, true, true},
            {true, false, true, false, false},
            {true, true, false, false, true},
            {true, false, false, false, true},
            {true, false, true, true, false}
        };

        for (boolean[] row : adjacencyMatrix) {
            for (boolean hasEdge : row) {
                System.out.print(hasEdge ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}

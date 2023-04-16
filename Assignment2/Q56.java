package Assignment2;

import java.util.LinkedList;

public class Q56 {
    public static class Graph {
        int count;
        private LinkedList<LinkedList<Edge>> Adj;
        private static class Edge {
            private int dest;
            private int cost;
            public Edge(int dst, int cst) {
                dest = dst;
                cost = cst;
            }
        }
        public Graph(int cnt) {
            count = cnt;
            Adj = new LinkedList<LinkedList<Edge>>();
            for (int i = 0; i < cnt; i++) {
                Adj.add(new LinkedList<Edge>());
            }
        }
        private void addDirectedEdge(int source, int dest, int cost) {
            Edge edge = new Edge(dest, cost);
            Adj.get(source).add(edge);
        }
        public void addDirectedEdge(int source, int dest) {
            addDirectedEdge(source, dest, 1);
        }
        public void addUndirectedEdge(int source, int dest, int cost) {
            addDirectedEdge(source, dest, cost);
            addDirectedEdge(dest, source, cost);
        }
        public void addUndirectedEdge(int source, int dest) {
            addUndirectedEdge(source, dest, 1);
        }
        public void print() {
            for (int i = 0; i < count; i++) {
                LinkedList<Edge> ad = Adj.get(i);
                System.out.print("\n Vertex " + i + " is connected to : ");
                for (Edge adn : ad) {
                    System.out.print("(" + adn.dest + ", " + adn.cost + ") ");
                }
            }
        }
        public static boolean bfs(Graph gph, int source, int target) {
            int count = gph.count;
            boolean[] visited = new boolean[count];
            LinkedList<Integer> que = new LinkedList<Integer>();
            que.add(source);
            visited[source] = true;
            while (que.isEmpty() == false) {
                int curr = que.remove();
                LinkedList<Edge> adl = gph.Adj.get(curr);
                for (Edge adn : adl) {
                    if (visited[adn.dest] == false) {
                        visited[adn.dest] = true;
                        que.add(adn.dest);
                    }
                }
            }
            return visited[target];
        }

        public static boolean dfs(Graph gph, int source, int target) {
            int count = gph.count;
            boolean[] visited = new boolean[count];
            dfsUtil(gph, source, visited);
            return visited[target];
        }
        public static void dfsUtil(Graph gph, int index, boolean[] visited) {
            visited[index] = true;
            LinkedList<Edge> adl = gph.Adj.get(index);
            for (Edge adn : adl) {
                if (visited[adn.dest] == false)
                    dfsUtil(gph, adn.dest, visited);
            }
        }

        public static void main(String[] args) {
            Graph gph = new Graph(5);
            gph.addDirectedEdge(0, 1, 3);
            gph.addDirectedEdge(0, 4, 2);
            gph.addDirectedEdge(1, 2, 1);
            gph.addDirectedEdge(2, 3, 1);
            gph.addDirectedEdge(4, 1, -2);
            gph.addDirectedEdge(4, 3, 1);
            gph.print();
            System.out.println();
            System.out.println(bfs(gph,3,1));
            System.out.println(dfs(gph,0,4));
        }
    }

}
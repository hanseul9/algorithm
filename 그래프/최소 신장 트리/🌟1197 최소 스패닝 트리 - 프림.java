/*
      백준 골드4 1197 최소 스패닝 트리
      최소 신장 트리 - 프림
 */

import java.io.*;
import java.util.*;
class Main {

    static class Edge implements Comparable<Edge> {
        int vertex, cost;

        Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge other) {
            //
            return Integer.compare(this.cost, other.cost);
        }
    }

    static boolean[] visited; // 방문 여부 -> MST 포함 여부
    static List<List<Edge>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =  new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken()); // 정점의 개수
        int E = Integer.parseInt(st.nextToken()); // 간선의 개수

        visited = new boolean[V + 1]; // 1 ~ V 사용

        graph = new ArrayList<>(); // 정점의 연결을 저장
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < E; i++) { // 연결정보
            st =  new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(v1).add(new Edge(v2, cost));
            graph.get(v2).add(new Edge(v1, cost));
        }

        int answer = prim(1);


        System.out.println(answer);

    }

    static int prim(int start) {

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(start, 0));

        int answer = 0;
        while (!queue.isEmpty()) {
            Edge currentNode = queue.poll();
            if (!visited[currentNode.vertex]) {
                visited[currentNode.vertex] = true;
                answer += currentNode.cost;
                for (Edge next : graph.get(currentNode.vertex)) {
                    if (!visited[next.vertex]) {
                        queue.add(next);
                    }
                }
            }
        }

        return answer;

    }



}


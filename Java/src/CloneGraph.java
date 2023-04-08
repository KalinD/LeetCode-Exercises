import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        Node newGraph = new Node(node.val);
        if (node.neighbors == null){
            return newGraph;
        }
        Queue<Node> q = new LinkedList<>(node.neighbors);
        HashMap<Integer, Node> valToNode = new HashMap<>();
        HashMap<Integer, Node> oldValToNode = new HashMap<>();
        valToNode.put(node.val, newGraph);
        oldValToNode.put(node.val, node);
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (valToNode.containsKey(n.val)) {
                continue;
            }
            Node newNode = new Node(n.val);
            valToNode.put(newNode.val, newNode);
            oldValToNode.put(n.val, n);
            q.addAll(n.neighbors);
        }
        for (Integer i : valToNode.keySet()) {
            for (Node n : oldValToNode.get(i).neighbors) {
                valToNode.get(i).neighbors.add(valToNode.get(n.val));
            }
        }

        return newGraph;
    }
}


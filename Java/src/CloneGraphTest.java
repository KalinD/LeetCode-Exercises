import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraphTest {

    CloneGraph obj = new CloneGraph();

    @Test
    void cloneGraph1() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

//        assertEquals(n1, obj.cloneGraph(n1));
    }

    @Test
    void cloneGraph2() {
        Node n1 = new Node(1);

        assertEquals(n1.val, obj.cloneGraph(n1).val);
    }

    @Test
    void cloneGraph3() {
        assertEquals(null, obj.cloneGraph(null));
    }
}
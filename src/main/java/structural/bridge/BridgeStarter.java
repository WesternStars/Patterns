package structural.bridge;

import structural.bridge.fifoCollection.FifoCollection;
import structural.bridge.fifoCollection.Queue;
import structural.bridge.list.ArrayLinkedList;
import structural.bridge.list.LinkedList;
import structural.bridge.list.SinglyLinkedList;

public class BridgeStarter {
    public static void main(String[] args) {
        testBridgePatternWithDifferentImpl(new SinglyLinkedList<>());
        System.out.println("______________");

        testBridgePatternWithDifferentImpl(new ArrayLinkedList<>());
    }

    private static void testBridgePatternWithDifferentImpl(LinkedList<Integer> impl) {
        FifoCollection<Integer> collection = new Queue<>(impl);
        collection.offer(1);
        collection.offer(4);
        collection.offer(99);

        System.out.println(collection.pull());
        System.out.println(collection.pull());
        System.out.println(collection.pull());
        System.out.println(collection.pull());
    }
}

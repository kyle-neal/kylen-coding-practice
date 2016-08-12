/*
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

Example:

// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();
 */

package main.java.problems;

import main.java.util.Utilities;

public class Problem10 extends Problem {
    @Override
    public void solve() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        for(int i = 0; i < Utilities.randomNumber(); i++)
            System.out.println("Random: " + getRandom(head));
    }

    private int getRandom(Node n){
        int rand = Utilities.randomNumber();
        Node head = n;
        Node curr = n;

        for(int i = 0; i < rand; i++){
            if(curr.next == null){
                curr = head;
            }else{
                curr = curr.next;
            }
        }
        return curr.data;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

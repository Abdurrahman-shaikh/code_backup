import java.util.*;

class LinkedListt_01<T> {
    T data;
    LinkedListt_01<T> next;

    LinkedListt_01(T x) {
        data = x;
    }

    public static LinkedListt_01<Integer> createList(Scanner sc) {
        int num_of_node;
        System.out.println("Enter the number of nodes to be created");
        num_of_node = sc.nextInt();
        LinkedListt_01<Integer> head = null;
        LinkedListt_01<Integer> p = null;
        for (int i = 1; i <= num_of_node; i++) {
            System.out.println("Enter Data");
            LinkedListt_01<Integer> temp = new LinkedListt_01<>(sc.nextInt());
            if (i == 1)
                head = temp;
            else {
                p = head;
                while (p.next != null)
                    p = p.next;
                p.next = temp;
            }
        }
        return head;
    }

    static void traverseList(LinkedListt_01<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static LinkedListt_01<Integer> addNode(Scanner sc, LinkedListt_01<Integer> head) {
        int pos;
        int count = 1;
        LinkedListt_01<Integer> p = head;
        System.out.println("Enter the position: ");
        pos = sc.nextInt();
        System.out.println("Enter The Data Of New Node");
        LinkedListt_01<Integer> temp = new LinkedListt_01<>(sc.nextInt());
        if (pos == 1) {
            temp.next = head;
            return temp;
        } else {
            while (p.next != null && count < pos - 1) {
                p = p.next;
                count++;
            }
            temp.next = p.next;
            p.next = temp;
        }
        return head;
    }

    static LinkedListt_01<Integer> searchElement(Scanner sc, LinkedListt_01<Integer> head) {
        int value;
        LinkedListt_01<Integer> p = head;
        System.out.println("Enter the number you want to search");
        value = sc.nextInt();
        while (p != null) {
            if (p.data == value) {
                System.out.println("Number found at : " + value);
                return p;
            }
            p = p.next;
        }
        System.out.println("Number not found.");
        return null;
    }
}

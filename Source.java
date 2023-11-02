class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    int sum = 0;
    while(head != null) {
      sum += head.val;
      head = head.next;
    }
    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));

    // extra credit
    System.out.println("Testing a second list ...");
    // list: 0 -> 1 -> 2 -> 3 -> 4 -> 5
    // populate list
    Node<Integer> head = new Node<>(0);
    Node<Integer> ptr = head;
    for(int i = 1; i <= 5; i++) {
      ptr.next = new Node<>(i);
      ptr = ptr.next;
    }

    // print list to verify
    for(ptr = head; ptr != null; ptr = ptr.next) {
      if(ptr.next == null) {
        System.out.println(ptr.val);
      } else {
        System.out.print(ptr.val + " -> ");
      }
    }

    // get sum: expected = 15
    System.out.println("Sum of second list: " + Source.sumList(head));
  }
}

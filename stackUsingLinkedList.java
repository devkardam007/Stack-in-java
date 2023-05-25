public class stackUsingLinkedList {
    static class Node{                      // Node Class
        int data;
        Node next;
        public Node(int data){              // Node Head
            this.data=data;
            next=null;
        }
    }
    static class stack{                     // Creating Stack Class
        public static Node head;
        public static boolean isEmpty(){    // Check the Stack is Empty or not
            return head == null;
        }
        public void push(int data){         // Push or Adding data in the stack
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop(){                   // Delete or Removing the data from the Stack
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){                  // Return the Upper Value in the Stack
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);                      // Push the Data = 1 in the Stack
        s.push(2);                      // Push the Data = 2 in the Stack
        s.push(3);                      // Push the Data = 3 in the Stack
        s.push(4);                      // Push the Data = 4 in the Stack
        while (!stack.isEmpty()){            // Printing the Value of Stack
            System.out.println(s.peek());
            s.pop();
        }
    }
}

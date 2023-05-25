import java.util.ArrayList;

public class stackUsingArrayList {
    class stack{
        static ArrayList<Integer> list = new ArrayList<>();     // Creatng Stack Using ArrayList Collection Framework
        public static boolean isEmpty(){                        // Check ArrayList --> Stack is Empty or not
            return list.size()==0;
        }
        public static void push(int data){                      // Push data in the Stack
            list.add(data);                                     // add Func is used to add data in ArrayList
        }
        public static int pop(){                                // Pop data in the Stack
            if (isEmpty()){                                     // Check the Stack is Empty or not
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){                               // Showing the Upper data in the Stack
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

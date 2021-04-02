import java.util.Stack;

public class Solution1 {
   public static void main(String[] args) {
      // your solution will be tested as such, sequentially with random input
      //ask 
      Solution sol = new Solution();
      sol.add(2); 
      sol.add(1); 
      System.out.println(sol.peek());    
      // 8, if you use System.out.print()**********
      //System.out.print(), peek, remove, isEmpty
      System.out.println(sol.remove());  // 8
      System.out.println(sol.isEmpty()); // false
      sol.add(1); 
      sol.add(1); 
      //
      System.out.println(sol.peek());    // 1    
      // etc
   }
}
class Solution {
    // PLEASE USE THESE GLOBAL STACKS FOR THIS PROBLEM
    private Stack<Integer> pushStack = new Stack<Integer>();
    private Stack<Integer> popStack = new Stack<Integer>();
    /*
     * ==================================== 
     * !!! DO NOT MODIFY ABOVE THIS LINE!!!
     * ====================================
     */

    /**
     * PURPOSE: push, to bring num to the top; add makes x 
     * PARAMETERS: int x 
     * RETURN VALUES:
     */
    public void add(int x) {
        // push and pop
        while(!pushStack.isEmpty())
        {
          popStack.push(pushStack.pop());
          //pushStack.push(popStack.pop()); 
          //return;
        }
        pushStack.push(x);
        //pop
        while(!popStack.isEmpty()){
          pushStack.push(popStack.pop()); 
          //popStack.push(pushStack.pop());
          //return;
        }
    }
    /**
     * PURPOSE: removes specific element from list 
     * PARAMETERS:  int val
     * RETURN VALUES: return remove element from list
     */
    public int remove() {
        // YOUR CODE HERE
        //storing val before removing? 
        int val = pushStack.peek();
        pushStack.pop();

        return val;
    }

    /**
     * PURPOSE: sees object from the top w/out removing it from the stack 
     * PARAMETERS:  peek, looks at top object
     * RETURN VALUES: object from the top from the stack 
     */
    public int peek() {
        // YOUR CODE HERE
        //smwt like bool, check for t/f
        return pushStack.peek();
    }

    /**
     * PURPOSE: return false if lsit contains no elements 
     * PARAMETERS: isEmpty returns false
     * RETURN VALUES: false 
     */
    public boolean isEmpty() {
        // YOUR CODE HERE
        return pushStack.isEmpty();
    }
}
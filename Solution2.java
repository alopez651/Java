import java.util.Stack;
public class Solution2 {    
    public static void main(String[] args) {
       // just like Problem 1, whatever you need here
       // etc. 
       MinStack obj = new MinStack();
       obj.push(-2);  //should print last -3
       obj.push(0);   //should print middles  0
       obj.push(-3);  //should print first    -2

       System.out.println(obj.getMin());  //-3
       obj.pop();
       System.out.println(obj.top());     //0
       System.out.println(obj.getMin());  //-2
       //obj.pop(); <-- check where to put it  
   }
}
// API DOCUMENTATION HERE
// SEE PROBLEM 1 FOR EXAMPLE.
/**
* The MaxStack program implements a Stack class with the following features:
* push(x) -- push element x onto stack
* pop() -- remove the element on top of the stack
* top() -- get the top element.
* getMin() -- retrieve the min element in the stack in constant time (i.e., O(1)
*/
class MinStack {
  Stack<Integer> m;
  Stack<Integer> n;
   // Initialize your data structure here
   public MinStack() { // YOUR CODE HERE 
    m = new Stack<Integer>(); //to store min
    n = new Stack<Integer>();
   }
   public void push(int x) { // YOUR CODE HERE 
    m.push(x);
    int min = x;

    if(!n.empty())
    min = n.peek();

    x = x<min?x:min;  //fix error conditional?
//https://www.tutorialspoint.com/cplusplus/cpp_operators.htm    
    n.push(x);
   }
   public void pop() { // YOUR CODE HERE 
    if(m.empty()){
      return;
    }
    m.pop();
    n.pop();
   }
   public int top() 
   { // YOUR CODE HERE
    return m.peek();    //n or m
   }
   public int getMin() { // YOUR CODE HERE 
    return n.peek();  //--^
   }
}
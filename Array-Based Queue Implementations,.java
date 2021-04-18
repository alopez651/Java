public class Solution1 {
   public static void main(String[] args) {
      // your solution method will be tested as such, with random sequential input
      // TEST CASE #1: instantiate a queue of capacity = 1
      Solution sol = new Solution(1);
      System.out.println(sol.getFront()); // -1
      System.out.println(sol.getRear()); // -1
      sol.add(8);
      System.out.println(sol.getFront()); // 0
      System.out.println(sol.getRear()); // 0
      System.out.println(sol.peek()); // 8
      System.out.println(sol.remove()); // 8
      System.out.println(sol.isEmpty()); // true
      System.out.println(sol.getFront()); // -1, when queue is empty
      System.out.println(sol.getRear()); // -1, when queue is empty

      // TEST CASE #2: instantiate a queue of capacity = 3
      Solution sol2 = new Solution(3);
      sol2.add(1);
      sol2.add(2);
      sol2.add(3);
      System.out.println(sol2.getFront()); // 0
      System.out.println(sol2.getRear()); // 2
      System.out.println(sol2.remove()); // 1
      System.out.println(sol2.getFront()); // 1
      System.out.println(sol2.getRear()); // 2
      // etc
   }
}

class Solution {
   // Dynamic array size
   private int capacity;
   // Queue
   private int[] elements;
   // Dynamic queue size
   private int numElements = 0;
   // Dynamic index for the front of queue, defaulting to -1 when the queue is empty
   private int front = -1;
   // Dynamic index for the rear of queue, defaulting to -1 when the queue is empty
   private int rear = -1;

   // Constructor
   public Solution(int capacity) {
      this.capacity = capacity;
      this.elements = new int[this.capacity];
   }
   // Get the front index
   public int getFront() {
      return this.front;
   }
   // Get the rear index
   public int getRear() {
      return this.rear;
   }

   /* =====================================
   /* !!! DO NOT MODIFY ABOVE THIS LINE!!!
   /* ====================================

  
  /**
   * PURPOSE: 
   * PARAMETERS: int x = is where specific element is to be sorted 
   * RETURN VALUES: x
  */
  public void add(int x) { 
     // YOUR CODE HERE
     if(capacity == (rear + 1))
     {
       return;
     }
     else{
       if(front == -1 && rear == -1)
       {
         elements [++rear] = x;
         front++;

       }
       else {
         elements[++rear] = x;
       }
     }
     //element[++rear] = x;
  }

  /**
   * PURPOSE: removes queque if empty
   * PARAMETERS: element - sort the value that will be removed
   rear/front - for element to just have one element, once removed front and rear will be pointed to -1. 
   * RETURN VALUES:
  */
  public int remove() { 
     // YOUR CODE HERE
     int rem = -999;  //0
     if(isEmpty())  //error empty 
     System.out.println("empty");

     else {
       rem = elements[front];
       if(rear == front){
         //private class solution
         front = -1;
         rear = -1;
       }
       else {
         front++;

       }
     }
     return rem;
  }

  /**
   * PURPOSE: to look at list without removing the top list
   * PARAMETERS: peek, looks at the object at the top without removing it. 
   * RETURN VALUES: object at the top 
  */
  public int peek() { 
     // YOUR CODE HERE
     if(isEmpty()){
       System.out.println("empty");
       //for(rear )
     }
     return elements[front];
  }
  
  /**
   * PURPOSE: to return true
   * PARAMETERS: isEmpty - check if list if list contains no elements 
   * RETURN VALUES: returns true if theres no elements
  */
  public boolean isEmpty() { 
    // YOUR CODE HERE
    if(front == rear && front == -1)
    //if(rear == front && rear == -1)
    return true;
    return false;
  }
}
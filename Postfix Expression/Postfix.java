import java.util.*;

class Solution1
{

  public static void main (String[]args)
  {
    // create object sol

    Solution sol = new Solution ();

    // demostrating results 
    //work on postfix
      System.out.println (sol.postfix ("4 55 + 62 23 - *"));	//check for solutions
      System.out.println (sol.postfix ("5 2 4 * + 7 -"));
      System.out.println (sol.postfix ("5 7 + 6 2 -  *"));
      System.out.println (sol.postfix ("-1 2 +"));	//atempt multiple numbers
      System.out.println (sol.postfix ("-1      2        +"));
      System.out.println (sol.postfix ("1 2 3 * + 4 +"));
      System.out.println (sol.postfix ("8 5 * 7 4 2 + * +"));
      System.out.println (sol.postfix ("6 8 2 / 1 - *"));
      
  }
}
//**************API********************//
//Purpose: input/valid arithmetic evaluates to valid integer value. 
//Paramaters: postfix evaluates operand 
/*stack tockenizer to break strings, matches to see if the numbers
are operand */
//Return Values: returning final results

class Solution
{

  public int postfix (String equation)
  {
    // first create stack 

    Stack < Integer > nums = new Stack <> ();

    
    //https://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
    StringTokenizer st = new StringTokenizer (equation, " ");


    //https://www.tutorialspoint.com/java/util/stringtokenizer_hasmoretokens.htm
    while (st.hasMoreTokens ())
      {				//get an item
	String num = st.nextToken ();

	// checks if num is an operand 
	//https://www.codementor.io/@nehavaidya/java-regex-tutorial-regular-expressions-in-java-x5d8cx3xt
	if (num.matches ("-?\\d+"))
	  {
	    //if (num.matches("(\d+)/(\d+)")){
	    // convert item into integer

	    // push it to the stack.
	    //https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
	    nums.push (Integer.parseInt (num));
	  }
	else
	  {
	    int num1 = nums.pop ();

	    int num2 = nums.pop ();

	    switch (num)
	      {			// apply + operation to operand1 and operand2
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html 
		//Using Strings in switch Statements***last example

	      case "+":
		//nums.push(num1 + num2);*****check for all order******
		nums.push (num2 + num1);	// error push 
		break;

	      case "-":
		nums.push (num2 - num1);
		break;
		//case 2:

	      case "/":
		nums.push (num2 / num1);
		break;
		
	      case "*":
		nums.push (num2 * num1);	// pushing to stack
		break;
	      }
	  }
      }
    //results from stack
    int result = nums.pop ();
    //returning(??, pop, result)
    return result;
  }
}




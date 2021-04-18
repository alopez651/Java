/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
class Box
{
  //top or bottom
  //Private instance variables H,W,D, boolean
  private int height;
  private int width;
  private int depth;
  private boolean full;		//full or not

  //define constructor to accpet H,W,D
  //include false to full
  public Box (int height, int width, int depth)	//check if necessary to add boolean 
  {
    this.height = height;
    this.width = width;
    this.depth = depth;
    this.full = false;
  }

  public int getHeight ()	//only height
  {
    return height;
  }

  public void setHeight (int height)	//getter setter
  {
    this.height = height;
  }

  public int getWidth ()	//only width
  {
    return width;
  }

  public void setWidth (int width)	//getter setter
  {
    this.width = width;
  }

  public int getDepth ()	//depth
  {
    return depth;
  }

  public void setDepth (int depth)	//getter setter
  {
    this.depth = depth;
  }
  public boolean isFull ()
  {
    return full;
  }
  public void setFull (boolean full)
  {
    this.full = full;
  }
  public String toString ()	//toString *look at class example***dont forget BOOLEAN
  {
    return "[Height: " + height + ", Width: " + width + ", Depth: " + depth +
      ", full = " + full + "]";
  }
}

class Main
{
  public static void main (String[]args)
  {
    //box array called ****Boxes****
    Box boxes[] = new Box[20];
    Random random = new Random ();
    //driver test that creates 20 boxes*****
    for (int b = 0; b < boxes.length; b++)	//count
      {
	boxes[b] =
	  new Box (random.nextInt (88), random.nextInt (88),
		   random.nextInt (88));
      }
    //print array info. 
    for (Box box:boxes)
      {
	System.out.println (box);	//box or boxes
      }
  }
}


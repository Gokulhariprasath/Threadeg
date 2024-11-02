import java.util.Random;
class square extends Thread
{
 int x;
 square(int n)
{
 x=n;
}
public void run()
{
 int sqr=x*x;
 System.out.println("the sqaure root of"+x+"is"+sqr);
}
}

class cube extends Thread
{
 int x;
 cube(int n)
{
 x=n;
}
public void run()
{
 int cube=x*x*x;
 System.out.println(" the cube of "+x+"is"+cube);
}
}

class Number extends Thread
{
public void run()
{
 Random random = new Random();
 for(int i=0;i<10;i++)
 {
 int randomInteger=random.nextInt(100);
 System.out.println("Random integre generated"+randomInteger);
 if (randomInteger%2==0)
  {
  square s = new square(randomInteger);
  s.start();
  }
 else
  {
  cube c= new cube(randomInteger);
  c.start();
  }
try
{
 Thread.sleep(1000);
}
catch(InterruptedException ex)
{
 System.out.println(ex);
}
}
}
}
public class Threadeg
{
 public static void main(String ags[])
{
 Number n = new Number();
 n.start();
}
}



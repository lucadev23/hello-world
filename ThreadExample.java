/**
 *
 * @author lucadev23
 */
public class ThreadExample extends Thread{
    private int millSec;
    
    public ThreadExample(int time) { //time in milliseconds
        millSec=time;
    }
    
    public void run() {
      try {  
          update();
          new IllegalArgumentException("timeout value is negative");
      } catch (Exception e)
      {  
          e.printStackTrace();
          System.out.println("Error Thread");
      }
    }
    
    public void update () {
        while(true) {
            try {
                Thread.sleep(millSec);//1 minute=60000
                //Anything you want to do...
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
   }
    
}

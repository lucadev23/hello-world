/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiothread;

/**
 *
 * @author lucadev23
 */
public class ThreadEstrai extends Thread{
    private MainForm mf;
    private int millSec;
    
    public ThreadEstrai(MainForm mf,int t)
    {
        this.mf=mf;
        millSec=t;
    }
    
    
    public void run()
    {
      try
      {  aggiorna();  new IllegalArgumentException("timeout value is negative");}
      catch (Exception e)
      {  
          e.printStackTrace();
          System.out.println("Errore nel Thread mio");
      }
    }
    
    public void aggiorna ()
    {
        
        while(true)
        {
              
                try
                {
                Thread.sleep(millSec);//1 minuto=60000
                mf.generaNumero();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }

        }
   }
    
}

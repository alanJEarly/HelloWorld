

package GameMaker;

public class Run {
    public void start() throws InterruptedException {
    	OnStart restart=new OnStart();
   
    Bin.win.winsetup();
      

        // Start the game loop in a new thread
        Thread updateThread = new Thread(() -> {
            try {
                gameLoop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        updateThread.start();
        
        
    }

    private void gameLoop() throws InterruptedException {
        while (Bin.setUp.run) {
            Bin.update.update();
            
  
        }
    }
}

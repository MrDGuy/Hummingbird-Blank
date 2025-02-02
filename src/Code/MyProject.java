
package Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.birdbraintechnologies.HummingbirdRobot;


public class MyProject
   {

   public static void main(final String[] args) throws IOException
      {
          // Instantiate the Hummingbird object (establishes a connection to the Hummingbird)
      HummingbirdRobot hummingbird = new HummingbirdRobot();

      // Print instructions for exiting
      System.out.println("");
      System.out.println("Press ENTER to quit.");

      int i = 0;
      final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true)
         {
         // check whether the user pressed a key, if so, break out of the loop
         if (in.ready())
            {
            break;
            }
         //Write you code here:
         
         }

        // Disconnect - if you miss this call the Hummingbird will continue doing stuff for five more seconds
        // you may also get a java error.
      hummingbird.disconnect();
      }

   // Pause for 1 second
   private static void sleep()
      {
      try
         {
         Thread.sleep(1000);
         }
      catch (InterruptedException e)
         {
         System.err.println("InterruptedException while sleeping!");
         }
      }

   }

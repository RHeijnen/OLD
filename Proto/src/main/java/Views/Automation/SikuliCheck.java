package Views.Automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.TimerTask;

/**
 * Created by Indi on 2/3/2016.
 */
public class SikuliCheck extends TimerTask {

    public static boolean poweredOn;
    Screen screen = new Screen();
    int refill = 0;
    public SikuliCheck(SummonersWarController summonersWarController){
        System.out.println("print once");
    }

    @Override
    public void run() {
        System.out.println("print again..");
        check();

    }

    public void check(){
        try{
            screen.click("/src/main/resources/IMG/get.PNG");
            screen.click();
            screen.click("/src/main/resources/IMG/replay.PNG");

            screen.click("/src/main/resources/IMG/startbattle.PNG");

            stop();
        }
        catch(FindFailed e){
            e.printStackTrace();
        }
    }
    public void stop(){
        this.cancel();
    }
}

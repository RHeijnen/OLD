package Views;

import org.sikuli.script.*;
import org.sikuli.script.Image;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.util.Random;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Indi on 2/4/2016.
 */
public class SikuliLoopLogic extends TimerTask {
    // Safeguard to prevent multiple threads
    public static boolean poweredOn = false;
    // Sikuli X caps the screen and checks what to click
    Screen screen;
    ApplicationMenuView gui;

    //img
    Image StartBattle;
    Image GetRune;
    Image GetOther;
    Image Victory;
    Image Defeat;
    Image Replay;
    Image Refill;
    Image RefillA;
    Image RefillB;
    Image RefillC;
    Image RefillD;
    Image RefillE;
    //
    Image Art;
    Robot robo;
    public SikuliLoopLogic(ApplicationMenuView applicationMenuView) throws AWTException {
        gui = applicationMenuView;
        robo = new Robot();
        System.out.println("run once");
        screen = new Screen();
        try {
            StartBattle = Image.create("C:\\SummonersWarAutoFarmer\\img\\start.PNG");
            GetRune = Image.create("C:\\SummonersWarAutoFarmer\\img\\rune.PNG");
            GetOther = Image.create("C:\\SummonersWarAutoFarmer\\img\\other.PNG");
            Victory = Image.create("C:\\SummonersWarAutoFarmer\\img\\victory.PNG");
            Defeat = Image.create("C:\\SummonersWarAutoFarmer\\img\\defeat.PNG");
            Replay = Image.create("C:\\SummonersWarAutoFarmer\\img\\replay.PNG");
            //
            RefillA = Image.create("C:\\SummonersWarAutoFarmer\\img\\refillA.PNG");
            RefillB = Image.create("C:\\SummonersWarAutoFarmer\\img\\refillB.PNG");
            RefillC = Image.create("C:\\SummonersWarAutoFarmer\\img\\refillC.PNG");
            RefillD = Image.create("C:\\SummonersWarAutoFarmer\\img\\refillD.PNG");
            RefillE = Image.create("C:\\SummonersWarAutoFarmer\\img\\refillE.PNG");
            //
            Art = Image.create("C:\\SummonersWarAutoFarmer\\img\\test.PNG");

        }catch(Exception e){

        }
    }
    public static int randomInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    public void arttest() {
        if (screen.exists(Art) != null) {
            try {
                screen.mouseMove(Art);
                screen.mouseMove(randomInt(-110,100),randomInt(-110,100));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                // move curser away
                robo.mouseMove(1,1);

            } catch (FindFailed findFailed) {
                // findFailed.printStackTrace();
            }
        } else {
            gui.setTextArea("Nothing found, waiting..");
        }
    }

    @Override
    public void run() {
       // arttest();
        System.out.println(ApplicationMenuView.BattleCount);
        if (screen.exists(StartBattle) != null) {
            findObject(StartBattle);
            gui.setTextArea("Starting Battle");

      /*  } else if (screen.exists(RefillA) != null) {
            refill();
            gui.setTextArea("Refilling");
*/
        } else if (screen.exists(Replay) != null) {
            findObject(Replay);
            gui.setTextArea("Restarting Battle");

        } else if (screen.exists(GetRune) != null) {
            findObject(GetRune);
            gui.setTextArea("Found Rune");

        } else if (screen.exists(GetOther) != null) {
            findObject(GetOther);
            gui.setTextArea("Found Item");

        } else if (screen.exists(Victory) != null) {
            victory(Victory);
            //ApplicationMenuView.BattleCount++;
//            ApplicationMenuView.SCENE_BATTLECOUNT.setText(String.valueOf(ApplicationMenuView.BattleCount));
            gui.setTextArea("Ending Battle");

        } else {
            gui.setTextArea("Waiting on Task..");
        }
    }


        public void findObject(Image img){
        if (screen.exists(img) != null) {
            // click start battle
            try {
                screen.mouseMove(img);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } catch (FindFailed findFailed) {
               // findFailed.printStackTrace();
            }
        } else {
            gui.setTextArea("Nothing found, waiting..");
        }
    }
    public void victory(Image img){
        if (screen.exists(img) != null) {
            try {
                screen.mouseMove(img);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);
                // again
                screen.mouseMove(img);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);

            } catch (FindFailed findFailed) {
                // findFailed.printStackTrace();

            }
        }
    }

    public void defeat(Image img,String msg){
        if (screen.exists(img) != null) {

        }
    }

    public void refill(){
        if (screen.exists(RefillA) != null) {
            try {
                //
                screen.mouseMove(RefillA);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);
                //
                screen.mouseMove(RefillB);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);
                //
                screen.mouseMove(RefillC);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);
                //
                screen.mouseMove(RefillD);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);
                //
                screen.mouseMove(RefillE);
                screen.mouseMove(randomInt(-10,10),randomInt(-10,10));
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                screen.wait(1.00);
                //
            } catch (FindFailed findFailed) {
                // findFailed.printStackTrace();
            }
        }
    }

    public void CrashRecovery(){

    }
}

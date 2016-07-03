package Views;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.sikuli.script.Screen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class ApplicationMenuView extends SuperView {
    public TextArea SCENE_OutputArea;
    public Label SCENE_REFILLCOUNT;
    static public Label SCENE_BATTLECOUNT;
    static int BattleCount = 0;
    static int RefillCount = 0;
    Timer timer = new Timer(); // init timer checker

    public ApplicationMenuView(){

    }


    public void test(ActionEvent actionEvent) throws AWTException {
        SCENE_OutputArea.appendText("Starting Auto Farmer..\n");
        timer.schedule(new SikuliLoopLogic(this), 0, 4500); // checks for cursor - 0.1ms

    }
    public void setTextArea(String msg){
        SCENE_OutputArea.appendText(msg +"\n");
    }

    public void upRefillCount(){
        RefillCount++;
        SCENE_REFILLCOUNT.setText(String.valueOf(RefillCount));
    }

    public void upBattleCount(){
        BattleCount++;
        SCENE_BATTLECOUNT.setText(String.valueOf(BattleCount));
    }
    public void stop(ActionEvent actionEvent) {
        SCENE_OutputArea.appendText("Stopping Thread...\n");
        timer.cancel();
        SCENE_OutputArea.appendText("Thread Stopped.\n");
    }
}


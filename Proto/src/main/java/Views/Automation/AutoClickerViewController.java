package Views.Automation;

import Views.SuperView;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by Indi on 1/28/2016.
 */
public class AutoClickerViewController extends SuperView {
    public Label scene_XCoord;
    public Label scene_YCoord;
    public Label scene_ClickCount;
    public TextField scene_ClickAmmountInput;
    public TextField scene_delay;
    int var_coordX;
    int var_coordY;
    Robot robot;
    int var_ammount;

    public AutoClickerViewController() throws AWTException {
        robot = new Robot();
    }

    public void SaveMouseLocation(ActionEvent actionEvent) {
        var_coordX = MouseInfo.getPointerInfo().getLocation().x;
        var_coordY = MouseInfo.getPointerInfo().getLocation().y;
        scene_XCoord.setText(String.valueOf(var_coordX));
        scene_YCoord.setText(String.valueOf(var_coordY));
    }

    public void StartClicking(ActionEvent actionEvent) {
        var_ammount = 0;
        scene_ClickCount.setText(String.valueOf(var_ammount));
        String var_StringCount = scene_ClickAmmountInput.getText();
        String var_DelayOffset = scene_delay.getText();
        ClickingLogic(Integer.parseInt(var_StringCount),Integer.parseInt(var_DelayOffset));
    }


    public void ClickingLogic(int Ammount,int delay){
        robot.mouseMove(var_coordX,var_coordY);
        robot.setAutoDelay(40);
        robot.setAutoWaitForIdle(true);

        for (int i = 0; i < Ammount; i++){
            //robot.mouseMove(var_coordX,var_coordY); to inside or not to inside
            robot.delay(delay);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            var_ammount++;
            scene_ClickCount.setText(String.valueOf(var_ammount));
        }
    }
}


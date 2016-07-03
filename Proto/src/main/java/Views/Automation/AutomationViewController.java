package Views.Automation;

import Views.SuperView;
import javafx.event.ActionEvent;

/**
 * Created by Indi on 1/28/2016.
 */
public class AutomationViewController extends SuperView {

    public void openAutoClickers(ActionEvent actionEvent) {
        FXController.Controller logout = new FXController.Controller();
        logout.setMainWindow("Home", "/FXML/Automation/AutoClickerWindow.fxml");
    }

    public void openBotWorkspace(ActionEvent actionEvent) {
        System.out.println("not yet implemented");
    }


    public void openSummonersWar(ActionEvent actionEvent) {
        FXController.Controller logout = new FXController.Controller();
        logout.setMainWindow("Home", "/FXML/Automation/SummonersWarView.fxml");
    }
}
package Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationMenuView extends SuperView {
    public Label scene_DescriptionLabel;
    FXController.Controller logout = new FXController.Controller();

    @FXML
    public void openWebsiteParser() {
        logout.setMainWindow("Home", "/FXML/Website/WebsiteParserWindow.fxml");
    }
    @FXML
    public void openAutomation() {
        logout.setMainWindow("Home", "/FXML/Automation/AutomationWindow.fxml");
    }
    @FXML
    public void openSound() {
        logout.setMainWindow("Home", "/FXML/Sound/SoundWindow.fxml");

    }
}

package Views;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.sikuli.script.Screen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

/**
 * Created by Indi on 1/27/2016.
 */
public class ConfigController extends SuperView implements Initializable {
    public ImageView SCENE_SSStartBattle;
    public ImageView SCENE_SSGetLootRune;
    public ImageView SCENE_SSGetLootOther;
    public ImageView SCENE_SSVictory;
    public ImageView SCENE_SSReplay;
    public ImageView SCENE_SSRefill;
    public ImageView SCENE_SSDefeat;
    public Label SCENE_Information;
    public Label SCENE_FootNote;
    public TextField SCENE_REFILLAMMOUNT;

    public ImageView SCENE_SSRefillA;
    public ImageView SCENE_SSRefillB;
    public ImageView SCENE_SSRefillC;
    public ImageView SCENE_SSRefillD;
    public ImageView SCENE_SSRefillE;

    int Switchcount = 1;
    int refillcount = 0;
    Screen screen; // SikuliX
    File file; // file location
    // images
    Image StartBattle;
    Image GetRune;
    Image GetOther;
    Image Victory;
    Image Defeat;
    Image Replay;
    Image Refill;
    //
    public ConfigController(){
        new Thread() {
            public void run() {
                screen = new Screen();
            }
        }.start();
    }

    // screencapture(1,1,250,250,"test2");
    public void screencapture(int X,int Y,int Length,int Width,String filename) {
        try{
            BufferedImage bf = screen.capture(X,Y,Length,Width).getImage();
            file = new File("C:\\SummonersWarAutoFarmer\\img\\"+filename+".PNG");
            ImageIO.write(bf, "png", file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void SSStartBattle(ActionEvent actionEvent) throws FileNotFoundException {
        screencapture(MousePositionX(),MousePositionY(),75,25,"start");
        SetImgView("start",StartBattle,SCENE_SSStartBattle);

    }

    public void SSGetLootRune(ActionEvent actionEvent) {
        screencapture(MousePositionX(),MousePositionY(),75,25,"rune");
        SetImgView("rune",GetRune,SCENE_SSGetLootRune);
    }

    public void SSGetLootOther(ActionEvent actionEvent) {
        screencapture(MousePositionX(),MousePositionY(),75,25,"other");
        SetImgView("other",GetOther,SCENE_SSGetLootOther);
    }

    public void SSVictory(ActionEvent actionEvent) {
        screencapture(MousePositionX(),MousePositionY(),100,50,"victory");
        SetImgView("victory",Victory,SCENE_SSVictory);
    }

    public void SSReplay(ActionEvent actionEvent) {
        int count = 0;
        screencapture(MousePositionX(),MousePositionY(),100,40,"replay");
        SetImgView("replay",Replay,SCENE_SSReplay);
    }

    public void SSRefill(ActionEvent actionEvent) {

        switch (Switchcount) {
            case 1 : Switchcount = 1;
                screencapture(MousePositionX(),MousePositionY(),25,25,"refillA");
                SetImgView("refill",Refill,SCENE_SSRefillA);
                Switchcount ++;
                break;
            case 2: Switchcount = 2;
                screencapture(MousePositionX(),MousePositionY(),25,25,"refillB");
                SetImgView("refill",Refill,SCENE_SSRefillB);
                Switchcount ++;
                break;
            case 3: Switchcount = 3 ;
                screencapture(MousePositionX(),MousePositionY(),25,25,"refillC");
                SetImgView("refill",Refill,SCENE_SSRefillC);
                Switchcount++;
                break;
            case 4: Switchcount = 4;
                screencapture(MousePositionX(),MousePositionY(),25,25,"refillD");
                SetImgView("refill",Refill,SCENE_SSRefillD);
                Switchcount++;
                break;
            case 5: Switchcount = 5;
                screencapture(MousePositionX(),MousePositionY(),25,25,"refillE");
                SetImgView("refill",Refill,SCENE_SSRefillE);
                Switchcount++;
                break;
            case 6: Switchcount = 6;
                Switchcount = 1;
                System.out.println("reset");
                SetImgView("",Refill,SCENE_SSRefillA);
                SetImgView("",Refill,SCENE_SSRefillB);
                SetImgView("",Refill,SCENE_SSRefillC);
                SetImgView("",Refill,SCENE_SSRefillD);
                SetImgView("",Refill,SCENE_SSRefillE);

                break;
            default:
                break;
        }
    }

    public void SSDefeat(ActionEvent actionEvent) {
        screencapture(MousePositionX(),MousePositionY(),75,50,"defeat");
        SetImgView("defeat",Defeat,SCENE_SSDefeat);
    }
    public void SetImgView(String filename,Image img,ImageView view){
        file = new File("c:/SummonersWarAutoFarmer/img/"+filename+".png");
        img = new Image(file.toURI().toString());
        view.setImage(img);
    }
    public void LoadConfig(){
        SetImgView("start",StartBattle,SCENE_SSStartBattle);
        SetImgView("rune",GetRune,SCENE_SSGetLootRune);
        SetImgView("other",GetOther,SCENE_SSGetLootOther);
        SetImgView("victory",Victory,SCENE_SSVictory);
        SetImgView("replay",Replay,SCENE_SSReplay);
        SetImgView("defeat",Defeat,SCENE_SSDefeat);
        //TODO FIX dynamic loading
        SetImgView("refill",Refill,SCENE_SSRefillA);
        SetImgView("refill",Refill,SCENE_SSRefillB);
        SetImgView("refill",Refill,SCENE_SSRefillC);
        SetImgView("refill",Refill,SCENE_SSRefillD);
        SetImgView("refill",Refill,SCENE_SSRefillE);

    }

    public int MousePositionX(){
        return MouseInfo.getPointerInfo().getLocation().x;
    }
    public int MousePositionY(){
        return MouseInfo.getPointerInfo().getLocation().y;
    }
    // check if config exists, set it up.
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Files.isDirectory(Paths.get("c:/SummonersWarAutoFarmer"))) {
                SCENE_Information.setText("Config Loaded");
                LoadConfig();
                SCENE_FootNote.setText("Note:\nAny change in Window Size\nwill need new configs!");
        } else{
            File dir = new File("c:/SummonersWarAutoFarmer");
            File dir2 = new File("c:/SummonersWarAutoFarmer/img");
            dir.mkdir();
            dir2.mkdir();
            SCENE_Information.setText("First Launch, Please Read The Tutorial");
        }

    }
    public void SetRefill(ActionEvent actionEvent) {

    }
}

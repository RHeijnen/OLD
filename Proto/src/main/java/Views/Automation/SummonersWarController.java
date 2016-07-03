package Views.Automation;
import Views.SuperView;
import javafx.event.ActionEvent;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Indi on 1/30/2016.
 */
public class SummonersWarController extends SuperView {
    Screen screen = new Screen();
    Timer timer = new Timer(); // init timer checker

    public void sikuli(ActionEvent actionEvent) throws TesseractException {
        //screencapture(1022,693,75,25,"test2");

    }

    public void test(ActionEvent actionEvent) {
        timer.schedule(new SikuliCheck(this), 0, 600); // checks for cursor - 0.1ms
        SikuliCheck.poweredOn = true; // Starts the timer (multi guard)1
    }

    public void screencapture(int Y,int X,int Length,int Width,String filename) throws TesseractException {
        try{
            BufferedImage bf = screen.capture(Y,X,Length,Width).getImage();
            File file1 = new File("C:\\sikuli\\img\\"+filename+".PNG");
            ImageIO.write(bf, "png", file1);
            readfile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readfile(){
        File imageFile = new File("C:\\sikuli\\img\\test2.PNG");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
         //ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setLanguage("eng");
        instance.setDatapath("src/main/resources/tessdata");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}

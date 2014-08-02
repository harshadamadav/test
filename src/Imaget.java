/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author megha
 */
public class Imaget extends MIDlet {

    private Display dis;
    private Image img;
    private ImageItem it;
    private Form f=new Form ("Display");
    
    public void startApp() {
        dis=Display.getDisplay(this);
        try
        {
            img=Image.createImage("earthpackage.jpg");
            it=new ImageItem("Image", img, ImageItem.LAYOUT_CENTER, "img");
            f.append(it);
            dis.setCurrent(f);
        }
        catch(java.io.IOException e)
        {
            
        }
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}

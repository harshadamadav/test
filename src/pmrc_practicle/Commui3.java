/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmrc_practicle;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author megha
 */
public class Commui3 extends MIDlet implements CommandListener{

    private Display dis;
    private Form f1;
    private Command exit=new Command("Exit",Command.EXIT,0);
    private Command back=new Command ("Back",Command.BACK,0);
    private Command help=new Command ("Help",Command.HELP,0);
    private TextBox t;
    //....this midlet class
    public Commui3()
    {
        dis=Display.getDisplay(this);
        t=new TextBox("Help", "This id help", 100, 0);
        t.addCommand(back);
        f1=new Form ("Form");
        f1.addCommand(exit);
        f1.addCommand(help);
        t.setCommandListener(this);
        f1.setCommandListener(this);
        
    }
    
    public void startApp() {
        dis.setCurrent(f1);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command c, Displayable d)
    {
        if(c.getLabel().equals("Exit"))
        {
            notifyDestroyed();
        }
        else if (c.getLabel().equals("Back"))
        {
            dis.setCurrent(f1);
        }
        else 
        {
            dis.setCurrent(t);
        }
    }
}

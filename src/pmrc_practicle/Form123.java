/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmrc_practicle;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author megha
 */
public class Form123 extends MIDlet implements CommandListener{
private Form f1;
private Form f2;
private Display dis;
private Command fc=new Command("fcmd",Command.SCREEN,0);
private Command sc=new Command("scmd",Command.SCREEN,0);
private Command exit =new Command ("exit",Command.EXIT,0);
    public void startApp() {
        dis=Display.getDisplay(this);
        f1=new Form("Form1");
        f1.append("This is Form 1");
        f1.addCommand(sc);
        f1.addCommand(exit);
        f1.setCommandListener(this);
        f2=new Form("Form2");
        f2.append("This is Form 2");
        f2.addCommand(fc);
        f2.addCommand(exit);
        f2.setCommandListener(this);        
        dis.setCurrent(f1);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction (Command c,Displayable d)
    {
        if((c.getLabel()).equals("exit"))
        {
            notifyDestroyed();
        }
        else if((c.getLabel()).equals("fcmd"))
        {
            dis.getDisplay(this).setCurrent(f1);
        }
        else
        {
            dis.getDisplay(this).setCurrent(f2);
        }
    }
}

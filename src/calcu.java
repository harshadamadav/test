/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author megha
 */
public class calcu extends MIDlet implements CommandListener{

    Command exit=new Command ("exit",Command.EXIT,1);
    Command add=new Command ("add",Command.SCREEN,0);
    Command sub=new Command ("sub",Command.SCREEN,0);
    Command div=new Command ("div",Command.SCREEN,0);
    Command mul=new Command ("mul",Command.SCREEN,0);
    Display dis;
    Form f=new Form ("Calci");
    TextField t1=new TextField("Enre the number:", "", 10, 0);
    TextField t2=new TextField("Enre the number:", "", 10, 0);
    TextField t3=new TextField("Enre the number:", "", 10, 0);
    public void startApp() {
        dis=Display.getDisplay(this);
        f.append(t1);
        f.append(t2);
        f.append(t3);
        f.addCommand(exit);
        f.addCommand(add);
        f.addCommand(sub);
        f.addCommand(mul);
        f.addCommand(div);
        f.setCommandListener(this);
        dis.setCurrent(f);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command c,Displayable d)
    {
        if(c.getLabel().equals("exit"))
        {
            notifyDestroyed();
        }
        else if(c.getLabel().equals("add"))
            {
                int a=Integer.parseInt(t1.getString())+Integer.parseInt(t2.getString());
                t3.setString(""+a);
            }
            else if(c.getLabel().equals("sub"))
            {
                int a=Integer.parseInt(t1.getString())-Integer.parseInt(t2.getString());
                t3.setString(""+a);
            }   
            else if(c.getLabel().equals("mul"))
            {
                int a=Integer.parseInt(t1.getString())*Integer.parseInt(t2.getString());
                t3.setString(""+a);
            }
            else
            {
                int a=Integer.parseInt(t1.getString())/Integer.parseInt(t2.getString());
                t3.setString(""+a);
            }

    }
}

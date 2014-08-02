/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author megha
 */
public class Ques extends MIDlet implements CommandListener{

    Display dis;
    List l1=new List("Color of Apple?",List.EXCLUSIVE);
    List l2=new List("Color of Mango?",List.EXCLUSIVE);
    List l3=new List("Color of Banana?",List.EXCLUSIVE);
    List l4=new List("Color of Strawbery?",List.EXCLUSIVE);
    List l5=new List("Color of grape?",List.EXCLUSIVE);
    Command exit=new Command("exit",Command.EXIT,1);
    Command next=new Command ("next",Command.SCREEN,0);
    
    TextBox t=new TextBox("Marks", "", 10, 0);
    int m,c=1;
    public void startApp() {
        m=0;
        c=1;
        dis=Display.getDisplay(this);
        l1.append("Red", null);
        l1.append("Orange", null);
        l1.append("Black", null);
        l1.append("White", null);
        l1.addCommand(exit);
        l1.addCommand(next);
        l1.setCommandListener(this);
        
        l2.append("Yellow", null);
        l2.append("Orange", null);
        l2.append("Black", null);
        l2.append("White", null);
        l2.addCommand(exit);
        l2.addCommand(next);
        l2.setCommandListener(this);
        
        l3.append("Yellow", null);
        l3.append("Orange", null);
        l3.append("Black", null);
        l3.append("White", null);
        l3.addCommand(exit);
        l3.addCommand(next);
        l3.setCommandListener(this);
        
        l4.append("Red", null);
        l4.append("Orange", null);
        l4.append("Black", null);
        l4.append("White", null);
        l4.addCommand(exit);
        l4.addCommand(next);
        l4.setCommandListener(this);
        
        l5.append("grey", null);
        l5.append("Orange", null);
        l5.append("Black", null);
        l5.append("White", null);
        l5.addCommand(exit);
        l5.addCommand(next);
        l5.setCommandListener(this);
        
        dis.setCurrent(l1);
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
        else
        {
            List s=(List)dis.getCurrent();
            if(s.getSelectedIndex()==0)
            {
                m++;
            }
            switch(this.c)
            {
                case 1:
                    dis.setCurrent(l2);
                    break;
                case 2:
                    dis.setCurrent(l3);
                    break;
                case 3:
                    dis.setCurrent(l4);
                    break;
                case 4:
                    dis.setCurrent(l5);
                    break;
                case 5:
                    t.setString(String.valueOf(m));
                    dis.setCurrent(t);
                    break;
            }
            this.c++;
        }
    }
}

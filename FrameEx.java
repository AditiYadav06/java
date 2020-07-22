import java.awt.*;
import java.applet.*; 
public class FrameEx extends Frame
{
TextField tfield1;
TextField tfield2;
Label lable1;
Button b1;
Button b2;
FrameEx()
{
tfield1=new TextField("Enter Number.");
tfield1.setBounds(100,50,85,20);
tfield2=new TextField("Enter Number.");
tfield2.setBounds(100,100,85,20);
b1=new Button("ADD");
b1.setBounds(75,220,60,40);
b2=new Button("SUBTRACT");
b2.setBounds(150,220,80,40);
lable1=new Label("");
lable1.setBounds(50,240,85,20);
add(b1);
add(b2);
add(tfield1);
add(tfield2);
add(lable1);
setSize(300,300);
setVisible(true);
}
public static void main(String args[])
{ new FrameEx();
}
}
  
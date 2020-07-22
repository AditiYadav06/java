import java.awt.*;
public class Framee extends Frame
{
TextField tf1;
TextField tf2;
Label l1;
Button b;
Button b1;
Framee()
{
tf1=new TextField();
tf1.setBounds(100,50,85,20);
tf2=new TextField();
tf2.setBounds(100,100,85,20);
b=new Button("ADD");
b.setBounds(75,220,60,40);
b1=new Button("SUBTRACT");
b1.setBounds(150,220,80,40);
l1=new Label("");
l1.setBounds(50,240,85,20);
    add(b);
    add(b1);
add(tf1);
add(tf2);
add(l1);
setSize(300,300);
setVisible(true);
}
public static void main(String args[])
{ new Framee();
}
}
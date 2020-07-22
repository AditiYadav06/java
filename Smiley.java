import java.applet.*; 
import java.awt.*; 
  
public class Smiley extends Applet { 
    public void paint(Graphics g) 
    { 
  
        // Oval for face outline 
		g.setColor(Color.YELLOW);
        g.fillOval(80, 70, 150, 150); 

  
        // Ovals for eyes 
        g.setColor(Color.RED); 
        g.fillOval(120, 120, 20, 20); 
        g.fillOval(170, 120, 20, 20); 
  
        // Arc for the smile 
        g.drawArc(130, 180, 50, 20, 180, 180); 

		g.drawLine(150,165,150,150);       

    } 
} 
/* 
<applet code="Smiley.class" width="300" height="300"> 
</applet> 
*/  
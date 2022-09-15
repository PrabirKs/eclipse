package graphics;
import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame 
{
	public DrawCircle() 
	{
		setTitle("Drawing a circle");
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}



@Override
public void paint(Graphics g)
  {
     	Graphics2D g2d = (Graphics2D) g;
	  //  g2d.drawOval(100,100,200,200);
	    g2d.drawRoundRect(40,50,200,100,500,10);
  }
public static void main(String[] args)
   {
      new DrawCircle();
      
   }   
}
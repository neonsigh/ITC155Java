import java.awt.Color;
import java.awt.Graphics;



public class mickeyHouse {

	public static void main(String[] args) {

		
		// create the drawing panel
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		//create ovals
		g.setColor(Color.BLUE);
		g.fillOval(50,25,40,40);
		g.fillOval(130, 25, 40, 40);
		
		//create rectangle
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//create line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 149, 85);
		
	}

}



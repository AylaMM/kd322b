import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Bargraph extends JComponent {
	private int women;
	private int men;
	private float total;
	private float percentage;
//	private int valueUpdater;
	
	int width = getWidth();
	int height = getHeight();
	
	public Bargraph(int women, int men){
		this.women = women;
		this.men = men;
	}
	
	public void updateValues(int women, int men){
		this.women = women;
		this.men = men;
		this.total = this.men + this.women;
		this.repaint();
		width = getWidth();
		height = getHeight();
	}
	
		@Override
		protected void paintComponent (Graphics g) {
			super.paintComponent(g);
			if(women >= 0){
				percentage = (women/total);
				float pixelValue1 = (int)(height*percentage);
				int bar = (int)(height - pixelValue1);
				
				g.setColor(Color.pink);
				g.fillRect(155, bar+20, 50, (int)pixelValue1);
				
				
			}
			if (men >=0){
			    percentage = (men/total);
				float pixelValue2 = (int)(height*percentage);
				int bar = (int)(height - pixelValue2);
				
				g.setColor(Color.green);
				g.fillRect(205, bar+20, 50, (int)pixelValue2);
			}
			if(total>=0){
				g.setColor(Color.black);
				//skriver ut antalet sökanden 
				//g.drawString ("Totalt antal sökanden: " + total, 0, 20);
			}
			
		}
		
		
	}
	

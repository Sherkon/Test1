	import java.awt.Color;
	import java.awt.Container;
	import java.awt.GridLayout;

	import javax.swing.ButtonGroup;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JRadioButton;

public class Oberflaeche extends JFrame {
		Container c;
		JLabel label1, label2, label3, label4;
		JRadioButton cloud, rz;
		
		public Oberflaeche(){
			c = getContentPane();
			this.setTitle("TCO zu den Hosting-Möglichkeiten");
			this.setSize(500, 500);
			this.setLayout(new GridLayout(3,2));
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setBackground(Color.BLACK);
			
			cloud = new JRadioButton("Cloud");
			rz = new JRadioButton("Rechenzentrum");
			ButtonGroup hosting = new ButtonGroup();
			hosting.add(cloud);
			hosting.add(rz);
			
			
			c.add(cloud);
			c.add(rz);
		}
		
		
		public static void main(String[]args){
			Oberflaeche h = new Oberflaeche();
		}
	}


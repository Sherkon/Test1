	import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

	import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Oberflaeche extends JFrame {
		private JLabel label1, label2, label3, label4;
		private JRadioButton cloud, rz;
		
		public Oberflaeche(){
	
			//GridbagLayout
			
			GridBagLayout gridbag = new GridBagLayout();
			GridBagConstraints constraints = new GridBagConstraints();
			
			//Frage 1: Wo soll es gehostet werden?
			JLabel hosting_frage = new JLabel("Wo möchten Sie Afaria installieren?");
			cloud = new JRadioButton("Cloud");
			rz = new JRadioButton("Rechenzentrum");

			ButtonGroup hosting_group = new ButtonGroup();
			hosting_group.add(cloud);
			hosting_group.add(rz);
			
			JLabel hosting_label = new JLabel();
			hosting_label.setLayout(new GridLayout(1,2));
			hosting_label.add(rz);
			hosting_label.add(cloud);
			
			this.add(hosting_frage);
			this.add(hosting_label);
			
			label1 = new JLabel("1");
			label2 = new JLabel("2");
			label3 = new JLabel("3");
			label4 = new JLabel("4");
			
			this.add(label1);
			this.add(label2);
			this.add(label3);
			this.add(label4);

			
			this.setTitle("TCO zu den Hosting-Möglichkeiten");
			this.setSize(1500, 500);
			this.setLayout(gri dbag);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setBackground(Color.BLACK);
		}
		
		
		public static void main(String[]args){
			Oberflaeche h = new Oberflaeche();
		}
	}


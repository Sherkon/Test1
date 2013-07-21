import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;


public class GUI extends JFrame {

    private Toolkit toolkit;

    public GUI() {
        
        initUI();
    }
    
    private void initUI() {

        setTitle("No Sleep");


        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(2,3));
 
        
        JRadioButton c1 = new JRadioButton("Hallo");
        JRadioButton c2 = new JRadioButton("Zwei");
        JRadioButton c3 = new JRadioButton("Hi");
      

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(c1);
        group.add(c2);
        group.add(c3);
        
        JPanel checkboxes = new JPanel();
        checkboxes.setLayout(new GridLayout(1,3));
        checkboxes.add(c1);
        checkboxes.add(c2);
        checkboxes.add(c3);

        panel.add(new JLabel("Hallo"));
        panel.add(checkboxes);
        panel.add(new JLabel("Welt"));
        panel.add(new JButton("Tschüss"));
        
        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel);
        pack();

        toolkit = getToolkit();
        Dimension screensize = toolkit.getScreenSize();
        setLocation((screensize.width - getWidth())/2, 
            (screensize.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	GUI ex = new GUI();
                ex.setVisible(true);
            }
        });

    }
}
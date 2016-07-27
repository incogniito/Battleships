package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShipPlacement extends JFrame {

	private JFrame frame;
	public JLabel shipLabel;
	public JLabel responseLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShipPlacement window = new ShipPlacement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private GUI grid;
	
	/**
	 * Create the application.
	 */
	public ShipPlacement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setSize(319,296);
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		shipLabel = new JLabel("Select a position");
		getContentPane().add(shipLabel, BorderLayout.NORTH);
		
		 responseLabel = new JLabel("");
		getContentPane().add(responseLabel, BorderLayout.SOUTH);
		setVisible(true);
		
		
		
	}

}

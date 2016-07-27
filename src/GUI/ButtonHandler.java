package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonHandler implements ActionListener{

	
	GUI gui;
	private  JButton[][] squares;
	
	public ButtonHandler(JButton[][] squares, GUI gui)
	{
		this.squares = squares;
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				if (source == squares[i][j])
				{
					gui.processClick(i,j);
					return;
				}				
	}
		}
	}
}

	

	


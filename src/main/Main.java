package main;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//JLabel label = new JLabel("Hello World");
		
		//avec un JWindow
		/*JWindow window = new JWindow();
		window.setVisible(true);
		window.getContentPane().add(label);
		window.setSize(500, 500);
		window.pack();
		window.setLocationRelativeTo(null);*/
		
		//avec une JFrame
		JFrame frame = new JFrame("JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().add(label);
		frame.setResizable(true);
		frame.setMinimumSize(new Dimension(500,500));
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//boite de dialogue modal
		//JDialog dialog = new JDialog(frame, "JDialog", false); 
		//boite de dialogue non-modal
		//JDialog dialog = new JDialog(frame, "JDialog", false);
		/*dialog.setSize(100,100);
		dialog.setLocationRelativeTo(frame);
		dialog.setVisible(true);*/
		
		//avec un BorderLayout
		Container pane = frame.getContentPane();
		/*JButton button = new JButton("Nord");
		pane.add(button, BorderLayout.PAGE_START);

		button = new JButton("Centre");
		button.setPreferredSize(new Dimension(200, 100));
		pane.add(button, BorderLayout.CENTER);

		button = new JButton("Ouest");
		pane.add(button, BorderLayout.LINE_START);

		button = new JButton("Sud");
		pane.add(button, BorderLayout.PAGE_END);

		button = new JButton("Est");
		pane.add(button, BorderLayout.LINE_END);*/
		
		//avec un FlowLayout
		/*FlowLayout layout = new FlowLayout();
		pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);*/
		
		//avec un GridLayout
		//GridLayout layout = new GridLayout(4,4);
		
		//avec un BoxLayout
		BoxLayout layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
		
		pane.setLayout(layout);
		pane.add(new JButton("Button 1"));
		pane.add(new JButton("Button 2"));
		pane.add(new JButton("Button 3"));
		/*pane.add(new JButton("Button 4"));
		pane.add(new JButton("Button 5"));
		pane.add(new JButton("Button 6"));
		pane.add(new JButton("Button 7"));
		pane.add(new JButton("Button 8"));
		pane.add(new JButton("Button 9"));
		pane.add(new JButton("Button 10"));
		pane.add(new JButton("Button 11"));
		pane.add(new JButton("Button 12"));
		pane.add(new JButton("Button 13"));
		pane.add(new JButton("Button 14"));
		pane.add(new JButton("Button 15"));
		pane.add(new JButton("Button 16"));*/
		
	}
	
}

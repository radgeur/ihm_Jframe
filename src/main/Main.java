package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		pane.add(button, BorderLayout.PAGE_START);*/
		
		//Q13 : avec un JPanel
		/*JPanel panel = new JPanel();
		panel.add(new JButton("bouton 1"));
		panel.add(new JButton("bouton 2"));
		panel.add(new JButton("bouton 3"));
		pane.add(panel, BorderLayout.PAGE_START);
		
		JButton button = new JButton("Centre");
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
		/*BoxLayout layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.add(Box.createVerticalGlue());*/
		
		
		/*pane.setLayout(layout);
		pane.add(new JButton("Button 1"));
		pane.add(new JButton("Button 2"));
		pane.add(new JButton("Button 3"));
		pane.add(new JButton("Button 4"));
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
		
		//sans layout
		/*pane.setLayout(null);
		Insets insets = pane.getInsets();
		Dimension size;
		JButton button1 = new JButton("Bouton1");
		size = button1.getPreferredSize();
		button1.setBounds(insets.left, insets.top, size.width, size.height);
		JButton button2 = new JButton("Bouton2");
		size = button2.getPreferredSize();
		button2.setBounds(25 + insets.left, 40 + insets.top, size.width, size.height);
		JButton button3 = new JButton("Bouton3");
		size = button3.getPreferredSize();
		button3.setBounds(50 + insets.left, 80 + insets.top, size.width, size.height);
		JButton button4 = new JButton("Bouton4");
		size = button4.getPreferredSize();
		button4.setBounds(75 + insets.left, 120 + insets.top, size.width, size.height);
		JButton button5 = new JButton("Bouton5");
		size = button5.getPreferredSize();
		button5.setBounds(100 + insets.left, 160 + insets.top, size.width, size.height);
		JButton button6 = new JButton("Bouton6");
		size = button6.getPreferredSize();
		button6.setBounds(125 + insets.left, 200 + insets.top, size.width, size.height);
		JButton button7 = new JButton("Bouton7");
		size = button7.getPreferredSize();
		button7.setBounds(150 + insets.left, 240 + insets.top, size.width, size.height);
		JButton button8 = new JButton("Bouton8");
		size = button8.getPreferredSize();
		button8.setBounds(175 + insets.left, 280 + insets.top, size.width, size.height);
		JButton button9 = new JButton("Bouton9");
		size = button9.getPreferredSize();
		button9.setBounds(200 + insets.left, 320 + insets.top, size.width, size.height);
		
		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
		pane.add(button4);
		pane.add(button5);
		pane.add(button6);
		pane.add(button7);
		pane.add(button8);
		pane.add(button9);
		frame.repaint();*/
	}				
 

	
}

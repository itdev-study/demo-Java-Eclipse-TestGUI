//
// Test GUI Project in Eclipse Oxigen
//*
package demo.java.eclipse.testgui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JavaEclipseTestGUI {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaEclipseTestGUI window = new JavaEclipseTestGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JavaEclipseTestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

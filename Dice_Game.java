package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Dice_Game {

	private JFrame frame;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice_Game window = new Dice_Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Dice_Game() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\Java Programs\\Java Programs\\src\\swingProjects\\logo.2d77ed5d.png"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 439, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Roll Dice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rand = new Random();
				
				int random = rand.nextInt((6 - 1) + 1) + 1;
				textField.setText(Integer.toString(random));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(12, 431, 395, 39);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 27));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(74, 71, 272, 97);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}

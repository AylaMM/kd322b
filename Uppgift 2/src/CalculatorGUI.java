import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorGUI extends JFrame {

	private Calculator calc;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		calc = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(23, 22, 287, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.equals();
				int result = calc.getResult();
				textField.setText(String.valueOf(result));
			}
		});
		btnNewButton.setBounds(209, 241, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(2);
				textField.setText("2");
			}
		});
		btnNewButton_1.setBounds(122, 207, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(3);
				textField.setText("3");
			}
		});
		btnNewButton_2.setBounds(221, 207, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(1);
				textField.setText("1");
			}
		});
		btnNewButton_4.setBounds(23, 207, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(4);
				textField.setText("4");
			}
		});
		btnNewButton_5.setBounds(23, 173, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(5);
				textField.setText("5");
			}
		});
		btnNewButton_6.setBounds(122, 173, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(6);
				textField.setText("6");
			}
		});
		btnNewButton_7.setBounds(221, 173, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(7);
				textField.setText("7");
			}
		});
		btnNewButton_8.setBounds(23, 139, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(8);
				textField.setText("8");
			}
		});
		btnNewButton_9.setBounds(122, 139, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(9);
				textField.setText("9");
			}
		});
		btnNewButton_10.setBounds(221, 139, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calc.getOperator();
			calc.plus();
			textField.setText("+");
			}
		});
		btnNewButton_11.setBounds(23, 105, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.minus();
				textField.setText("-");
			}
		});
		btnNewButton_12.setBounds(122, 105, 89, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.mult();
				textField.setText("*");
			}
		});
		btnNewButton_13.setBounds(221, 105, 89, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Clear");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			calc.clear();
			textField.setText("");
			}
		});
		btnNewButton_14.setBounds(23, 71, 89, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("0");
			}
		});
		btnNewButton_3.setBounds(23, 241, 141, 23);
		contentPane.add(btnNewButton_3);
	}
}

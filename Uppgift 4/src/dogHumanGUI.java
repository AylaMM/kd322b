import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class dogHumanGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dogHumanGUI frame = new dogHumanGUI();
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
	
	private Human person;
	private Dog dog;
	
	
	public dogHumanGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((String.valueOf(textField.getText()).length() >= Human.MIN_LENGTH)){
					person = new Human(String.valueOf(textField.getText()));
				}else{
					textArea_1.setText("Name not long enough, dawg.");
					//maddafakkaa
				}
			}
		});
		btnNewButton.setBounds(235, 11, 134, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (person != null){
					dog = new Dog(String.valueOf(textField_1.getText()));
					person.buyDog(dog);
				}else{
					textArea_1.setText("Dawg must have an owner. Pwnd.");
				}
			}
		});
		btnBuyDog.setBounds(235, 45, 134, 23);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(person.getInfo());
			}
		});
		btnPrintInfo.setBounds(235, 79, 134, 23);
		contentPane.add(btnPrintInfo);
		
		textField = new JTextField();
		textField.setBounds(10, 12, 215, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 46, 215, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 148, 414, 43);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Info");
		lblNewLabel.setBounds(25, 123, 46, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setBounds(20, 202, 100, 14);
		contentPane.add(lblErrorMessage);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 219, 414, 31);
		contentPane.add(textArea_1);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.DropMode;


public class BikeStoreGUI extends JFrame {

	private BikeStore bikeStore;
	private JPanel contentPane;
	private JTextArea textArea;
	private JTextField textColor;
	private JTextField textSize;
	private JTextField textPrice;
	private JTextField txtCyklarILager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		bikeStore = new BikeStore();
		bikeStore.addBike("red", "20", "111");
		bikeStore.addBike("blue", "21", "222");
		bikeStore.addBike("poopfärg", "23", "333");
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 40, 414, 174);
		textArea.setText(bikeStore.getAllBikes());
		contentPane.add(textArea);


		JButton btnLggTill = new JButton("L\u00E4gg till cykel");
		btnLggTill.setBackground(UIManager.getColor("Button.darkShadow"));
		btnLggTill.setFont(new Font("Arial", Font.BOLD, 12));
		btnLggTill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textPrice.getText()!= null && textColor != null && textSize != null) {
					bikeStore.addBike(textColor.getText(), textSize.getText(), textPrice.getText());
					textArea.setText(bikeStore.getAllBikes());
				}
			}
		});
		btnLggTill.setBounds(299, 225, 125, 30);
		contentPane.add(btnLggTill);
		
		textColor = new JTextField();
		textColor.setBounds(10, 233, 86, 20);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(107, 233, 86, 20);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(203, 233, 86, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		JLabel lblFrg = new JLabel("F\u00E4rg");
		lblFrg.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFrg.setForeground(Color.WHITE);
		lblFrg.setHorizontalAlignment(SwingConstants.LEFT);
		lblFrg.setBounds(20, 215, 76, 20);
		contentPane.add(lblFrg);
		
		JLabel lblHjuldiameter = new JLabel("Storlek");
		lblHjuldiameter.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHjuldiameter.setForeground(Color.WHITE);
		lblHjuldiameter.setBounds(117, 215, 76, 20);
		contentPane.add(lblHjuldiameter);
		
		JLabel lblPris = new JLabel("Pris");
		lblPris.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPris.setForeground(Color.WHITE);
		lblPris.setBounds(213, 215, 76, 20);
		contentPane.add(lblPris);
		
		txtCyklarILager = new JTextField();
		txtCyklarILager.setBorder(null);
		txtCyklarILager.setForeground(Color.LIGHT_GRAY);
		txtCyklarILager.setBackground(Color.DARK_GRAY);
		txtCyklarILager.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCyklarILager.setEditable(false);
		txtCyklarILager.setHorizontalAlignment(SwingConstants.CENTER);
		txtCyklarILager.setText("C y k l a r     i     l a g e r");
		txtCyklarILager.setBounds(0, 0, 434, 39);
		contentPane.add(txtCyklarILager);
		txtCyklarILager.setColumns(10);
	}
}

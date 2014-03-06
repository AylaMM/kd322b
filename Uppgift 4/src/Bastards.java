import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Bastards extends JFrame {

	private JPanel contentPane;
	private JTextArea fucktards;
	
	private ArrayList<Animal> animalList = new ArrayList<Animal>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bastards frame = new Bastards();
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
	
	public Bastards() {
		
		animalList.add(new Cat(true, 322, 9));
		animalList.add(new wtfDog(true, 9001, true));
		animalList.add(new Snake(false, true));
		animalList.add(new Snake(false, false));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFucktardedPetsThat = new JLabel("Fucktarded pets that everyone hates");
		lblFucktardedPetsThat.setBounds(10, 11, 308, 23);
		contentPane.add(lblFucktardedPetsThat);
		
		fucktards = new JTextArea();
		for (int i = 0; i < animalList.size(); i++){
			fucktards.append(animalList.get(i).getInfo() + "\n \n");
		}
		fucktards.setBounds(10, 34, 583, 289);
		contentPane.add(fucktards);
	}

}

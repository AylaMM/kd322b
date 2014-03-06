import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
getContentPane().setLayout(null);
		
		table = new JTable();
		
		House house1 = new House(1880, 9342938);
		House house2 = new House(1666, 15);
		House house3 = new House(2655, 9001);
		
		House houseArray[] = new House[10];
		houseArray[0] = house1;
		houseArray[1] = house2;
		houseArray[2] = house3;
		
		int zeHouses = House.getNbrHouses();
		
		String houseSpefz[] = new String[zeHouses];
		
		for(int i = 0; i < zeHouses; i++){
			houseSpefz[i] = new String("Byggår: " + houseArray[i].getYear() + ". Storlek: " + houseArray[i].getSize() + " cm2.");
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{houseSpefz[0]},
					{houseSpefz[1]},
					{houseSpefz[2]},
					{"Det finns totalt: " + zeHouses + " hus."},
				},
				new String[] {
					"New column"
				}
			));
			table.setBounds(81, 46, 286, 165);
			getContentPane().add(table);
			System.out.println(House.getNbrHouses());
		}
		
		// 3 st hus med olika storlek och byggår
		// Stoppa in dem i en House-Array med 10 platser
		// Loopa igenom Arrayen, anropa metoderna för alla hus, och kontrollera att de fungerar (som man förväntar sig)
		// Kontrollera i utskrift att metoden getNbrOfHouses fungerar
		// Applikation ska figurmässigt se ut som figur 1
	}
}

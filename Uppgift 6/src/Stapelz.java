import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JComboBox;
import javax.swing.JLabel;


public class Stapelz extends JFrame {

	private JPanel contentPane;
	
	private Bargraph bargraph;
	private Document doc;
	private static final long serialVersionUID = 1L;
	private ArrayList<Program> programsList = new ArrayList<Program>();
//	private JLabel lblNamn;
//	private JLabel lblCode;
	

	/**
	 * Launch the application.
	 */
	
	// Diagrammet minimumvärde 0 maximumvärde totalt antal sökande för programmet
	// Kvinnliga, manliga
	

	/**
	 * Create the frame.
	 */
	
	
	private ArrayList<Program> loadAllPrograms(){
		ArrayList<Program> output = new ArrayList<Program>();
		
		// Hämta alla program
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i < programs.getLength(); i++){
			
			// Gör om varje nod i listan till ett element
			Node node = programs.item(i);
			Element elm = (Element) node;
			
			// Hämta data från elementet
			String name = elm.getElementsByTagName("name").item(0).getTextContent();
			// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
			String code = elm.getElementsByTagName("code").item(0).getTextContent();
			int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
			int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
			
			// Skapa programmet och lägg till i listan
			Program program = new Program(name, code, women, men);
			output.add(program);
		}
		return output;
	}
	
	private static Document openXmlFile(String fileName){
		Document doc = null;
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	
	public Stapelz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		// Variabler:
		doc = openXmlFile("ht2013_antagning.xml");
		programsList = loadAllPrograms();
		
		JLabel lblNewLabel = new JLabel("Detaljer");
		lblNewLabel.setBounds(10, 42, 414, 14);
		contentPane.add(lblNewLabel);
		
		final JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(30, 67, 394, 14);
		contentPane.add(lblNamn);
		
		final JLabel lblCode = new JLabel("Kod:");
		lblCode.setBounds(30, 92, 394, 14);
		contentPane.add(lblCode);
		
		bargraph = new Bargraph(0, 0);
		bargraph.setBounds(10, 117, 414, 192);
		contentPane.add(bargraph);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 414, 20);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener(){
			
			@Override 
			public void actionPerformed(ActionEvent graph){
				int index = comboBox.getSelectedIndex();
				Program prog = programsList.get(index);
				bargraph.updateValues(prog.getWomen(), prog.getMen());
				
				lblNamn.setText("Namn: " + prog.getName());
				lblCode.setText("Kod: " + prog.getCode());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
	
		
	
	}
	

public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stapelz frame = new Stapelz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

//Uppg. 1 - Element i XML-dokumentet för ett programs namn: "name"
//Element i XML-dokumentet för antalet antagna kvinnor: "women"
//Uppg. 2 - ctrl + F "81027"; 3 män
//ctrl + F "Webbutveckling"; Mittuniversitetet och Blekinge Tekniska Högskola

public class XMLGUI extends JFrame {

	private JPanel contentPane;
	private Document doc = openXmlFile("ht2013_antagning.xml");
	private JTextArea txtrFirstElementthe;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	
    
	
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
			String women = elm.getElementsByTagName("women").item(0).getTextContent();
			String men = elm.getElementsByTagName("men").item(0).getTextContent();
			
			// Skapa programmet och lägg till i listan
			Program program = new Program(name, code, Integer.parseInt(women), Integer.parseInt(men));
			output.add(program);
		}
		return output;
	}
	
	/***
	 * Opens the given XML file DOM.
	 * 
	 * @param fileName
	 * 			The filename of the XML file (make sure to copy this to your 
	 * Eclipse project)
	 * @return A Document instance containing the given XML file.
	 */
	
	private Document openXmlFile(String fileName){
		Document doc = null;
		try {
			File fXmlFile = new File("ht2013_antagning.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XMLGUI frame = new XMLGUI();
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
	
	public XMLGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAmountOfPrograms = new JLabel("Amount of programs:  " + loadAllPrograms().size());
		lblAmountOfPrograms.setBounds(10, 36, 383, 27);
		contentPane.add(lblAmountOfPrograms);
		
		txtrFirstElementthe = new JTextArea();
		txtrFirstElementthe.setText("First element (the root): " + doc.getDocumentElement().getNodeName());
		txtrFirstElementthe.setBounds(10, 11, 414, 132);
		contentPane.add(txtrFirstElementthe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 74, 404, 176);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		comboBox.
	}
}

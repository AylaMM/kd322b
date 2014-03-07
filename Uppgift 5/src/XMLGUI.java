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
	private Document doc;
	private JTextArea txtrFirstElementthe;
	private JComboBox comboBox;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	
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
	
	public ArrayList<Program> getProgramsList(){
		programsList = loadAllPrograms();
		return programsList;
	}
	/***
	 * Opens the given XML file DOM.
	 * 
	 * @param fileName
	 * 			The filename of the XML file (make sure to copy this to your 
	 * Eclipse project)
	 * @return A Document instance containing the given XML file.
	 */
	

	
	

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
		
		doc = openXmlFile("ht2013_antagning.xml");
		programsList = loadAllPrograms();
		
		JLabel lblAmountOfPrograms = new JLabel("Amount of programs:  " + loadAllPrograms().size());
		lblAmountOfPrograms.setBounds(10, 36, 383, 27);
		contentPane.add(lblAmountOfPrograms);
		
		txtrFirstElementthe = new JTextArea();
		txtrFirstElementthe.setText("First element (the root): " + doc.getDocumentElement().getNodeName());
		txtrFirstElementthe.setBounds(10, 11, 414, 98);
		contentPane.add(txtrFirstElementthe);
		
		comboBox = new JComboBox();
		comboBox.setBounds(10, 116, 414, 27);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(getProgramsList().toArray()));
	}
}

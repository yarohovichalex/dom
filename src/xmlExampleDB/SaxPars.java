package xmlExampleDB;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;

import bean.Child;
import bean.Father;
import bean.Mother;





public class SaxPars {
	Mother mom = new Mother();
	Father pop = new Father();
	Child child = new Child();
	static MyDom domObj = new MyDom();
	
	public static void main(String[] args) {
		
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		try {
			SAXParser parser = factory.newSAXParser();
			MySax saxp = new MySax();
			
			//String path = SaxPars.class.getClassLoader().getResource("xmlf\family.xml").getPath();
			parser.parse("D:\\family1.xml", saxp);
			System.out.println(saxp.getMama().getName());
			System.out.println(saxp.getPapa().getName());
			
		} catch (ParserConfigurationException | SAXException | IOException e) {			
			e.printStackTrace();
		} 	
// DOM		
//		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
//		f.setValidating(false);
//		DocumentBuilder builder = null;
		DOMParser parser  = new DOMParser();
		try {
			parser.parse("D:\\family1.xml");
		} catch (SAXException | IOException e) {
			
			e.printStackTrace();
		}
		Document doc = parser.getDocument();
		doc.getDocumentElement().normalize();
		 System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
		 
		 NodeList motherList = doc.getElementsByTagName("mother");
		 System.out.println(domObj.motherPars(motherList));
		 
         NodeList fatherList = doc.getElementsByTagName("father");
		 System.out.println(domObj.fatherPars(fatherList));
		 
		 
		 NodeList nodeList = doc.getElementsByTagName("child");
		 System.out.println(domObj.childPars(nodeList));
         
        //     }
       //  }
		
//		Element root = document.getDocumentElement();
//		NodeList nodeList = root.getElementsByTagName("family");
//		//System.out.println("tag name: " + document.getDocumentElement().getNodeName());
//		for (int i = 0; i < 7/*nodeList.getLength()*/; i++) {
//			String tagName =  document.getDocumentElement().getChildNodes().item(i).getNodeName();
//			switch(tagName) {
//			case "mather": 
//				NodeList nodeList1 =  root.getElementsByTagName("mather");
//				for(int j= 0; j < 3; j++) {
//					System.out.println(nodeList1.getChildNodes().item(i).getNodeName());
//				}
//				
//				
//			}
//		}
//		List<Object> list = new ArrayList<>();
					
		
		
				
	}
}

package xmlExampleDB;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import bean.Child;
import bean.Father;
import bean.Gender;
import bean.Mother;

public class MyDom {
	

	public Mother motherPars(NodeList node) {
		Mother mom = new Mother();
		Node motherNode = node.item(0);
        System.out.println();
        System.out.println("Текущий элемент: " + motherNode.getNodeName());
        if (Node.ELEMENT_NODE == motherNode.getNodeType()) {

            Element element = (Element)motherNode;
            mom.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));
            mom.setMaidenName(element.getElementsByTagName("maiden-name").item(0).getTextContent());
            mom.setSurname(element.getElementsByTagName("surname").item(0).getTextContent());
            mom.setName(element.getElementsByTagName("name").item(0).getTextContent());      
            
        }
		
		
		return mom;
	}
	
	public Father fatherPars(NodeList node) {
		Father pop = new Father();
		Node fatherNode = node.item(0);
        System.out.println();
        System.out.println("Текущий элемент: " + fatherNode.getNodeName());
        if (Node.ELEMENT_NODE == fatherNode.getNodeType()) {
        	
            Element element = (Element)fatherNode;
            pop.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));
            pop.setSalary(Integer.parseInt(element.getElementsByTagName("salary").item(0).getTextContent()));
            pop.setSurname(element.getElementsByTagName("surname").item(0).getTextContent());
            pop.setName(element.getElementsByTagName("name").item(0).getTextContent());      
            
        }
		
		
		return pop;
	}
	
	public Child[] childPars(NodeList node) {
		Child child = new Child();
		Child [] chi = new Child [3];
		for(int i = 0; i < node.getLength(); i++) {
			Node childNode = node.item(i);
	        System.out.println("Текущий элемент: " + childNode.getNodeName());
	        if (Node.ELEMENT_NODE == childNode.getNodeType()) {

	            Element element = (Element)childNode;
	            
	            
	            child.setAge(Integer.parseInt(element.getElementsByTagName("age").item(i).getTextContent()));
	            child.setGender(Gender.valueOf(element.getElementsByTagName("gender").item(i).getTextContent()));
	            child.setSurname(element.getElementsByTagName("surname").item(i).getTextContent());
	            child.setName(element.getElementsByTagName("name").item(i).getTextContent());      
	            chi[i] = child;
	            System.out.println(child);
	        }
		}
		
		
		
		return chi;
	}
	
	
}


package ex_01;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class DOMCCreateXMLDemo {
    public static void main(String[] args) throws ParserConfigurationException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docbBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docbBuilder.newDocument();
            Element rootElement =  doc.createElement("company");
            doc.appendChild(rootElement);
            
            Element staff = 
            
        }
       
    }
    
}

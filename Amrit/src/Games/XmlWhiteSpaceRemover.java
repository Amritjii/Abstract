package Games;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XmlWhiteSpaceRemover {

    public static void main(String[] args) {
        try {
            // create a document builder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // parse the XML file
            Document document = builder.parse(new File("E://dimple.xml"));

            // get all the nodes in the XML tree
            NodeList nodes = document.getElementsByTagName("*");

            // remove extra white space characters from the text content of each node
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getFirstChild() != null) {
                    String textContent = node.getFirstChild().getTextContent().trim();
                    if (!textContent.isEmpty()) {
                        node.getFirstChild().setTextContent(textContent.replaceAll("\\s+", " "));
                    }
                }
            }

            // write the modified XML back to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("E://dimpleresult.xml"));
            transformer.transform(source, result);

            System.out.println("Whitespace removal complete.");
        } catch (ParserConfigurationException | IOException | TransformerException | org.xml.sax.SAXException ex) {
            ex.printStackTrace();
        }
    }
}


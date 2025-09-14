import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class MainXML {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        List<Employee> list = ParseMethods.parseXML("data.xml");
        String json = ParseMethods.listToJson(list);
        ParseMethods.writeString(json, "data2.json");
    }

}

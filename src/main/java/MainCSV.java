import java.util.List;


public class MainCSV {
    public static void main(String[] args) {

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";

        List<Employee> list = ParseMethods.parseCSV(columnMapping, fileName);
        System.out.println(list);
        String json = ParseMethods.listToJson(list);
        ParseMethods.writeString(json, "data.json");
    }

}

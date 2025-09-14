import java.util.List;

public class MainJSON {
    public static void main(String[] args) {
        String json = ParseMethods.readString("new_data.json");
        List<Employee> list = ParseMethods.jsonToList(json);

        list.forEach(System.out::println);
    }
}

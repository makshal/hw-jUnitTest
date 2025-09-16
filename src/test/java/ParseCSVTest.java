import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// given_when_then
// methodName_Scenario_ExpectedResult
// should_when

public class ParseCSVTest {

    private ParseMethods parseMethods;

    @BeforeEach
    void setUp() {
        parseMethods = new ParseMethods();
    }

    @Test
    @DisplayName("Получаемый список не пустой")
    void shouldReturnNotNullList() {

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";

        List<Employee> list = parseMethods.parseCSV(columnMapping, fileName);

        Assertions.assertNotNull(list);

    }

    @Test
    @DisplayName("Список на выходе равен списку, с определенными значениями")
    void shouldBeEqualToListOfGivenValues() {

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> expectedList = new ArrayList<>();

        expectedList.add(new Employee(1, "John", "Smith", "USA", 25));
        expectedList.add(new Employee(2, "Inav", "Petrov", "RU", 23));

        List<Employee> list = parseMethods.parseCSV(columnMapping, fileName);

        Assertions.assertEquals(expectedList, list);

    }

    @Test
    @DisplayName("id ожидаемого и акутального сотрудников в списках равны")
    void shouldBeEqualId() {

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";

        List<Employee> expectedList = new ArrayList<>();

        expectedList.add(new Employee(1, "John", "Smith", "USA", 25));
        expectedList.add(new Employee(2, "Inav", "Petrov", "RU", 23));

        List<Employee> list = parseMethods.parseCSV(columnMapping, fileName);

        for (int i = 0; i < expectedList.size(); i++) {
            Employee expected = expectedList.get(i);
            Employee actual = list.get(i);

            Assertions.assertEquals(expected.getId(), actual.getId());
        }
    }
}


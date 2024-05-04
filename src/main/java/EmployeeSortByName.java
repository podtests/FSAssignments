import java.util.Comparator;
import java.util.Map;

public class EmployeeSortByName implements Comparator<Map.Entry<String, Employee>> {


    @Override
    public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}

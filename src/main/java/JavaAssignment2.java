import java.util.*;

public class JavaAssignment2 implements JavaAssignment2I {

    public static void main(String[] args) {
        JavaAssignment2 a2 = new JavaAssignment2();



        //a2.Q1();
        a2.Q2();


    }



    public void Q1() {

        List<String> row1 = new ArrayList<>();
        row1.add("Suraj");
        row1.add("97");

        List<String> row2 = new ArrayList<>();
        row2.add("Zen");
        row2.add("103");

        List<String> row3 = new ArrayList<>();
        row3.add("Derrick");
        row3.add("72");

        List<String> row4 = new ArrayList<>();
        row4.add("Piyush");
        row4.add("108");

        List<String> row5 = new ArrayList<>();
        row5.add("Zen");
        row5.add("54");


        Map<String, List<String>> empMap = new HashMap<>();
        empMap.put("T1",row1);
        empMap.put("T2",row2);
        empMap.put("T3",row3);
        empMap.put("T4",row4);
        empMap.put("T5",row5);

        System.out.println("EmpID | Name | Salary");
        for(Map.Entry<String, List<String>> e : empMap.entrySet()) {
            System.out.print(e.getKey()+" |");
            System.out.print(e.getValue().get(0)+" |");
            System.out.print(e.getValue().get(1)+" |");
            System.out.println();
        }

        //sort the map based on empid;

    }

    public void Q2() {
        Employee e1 = new Employee("T1", "Suraj", 97);
        Employee e2 = new Employee("T2", "Zen", 103);
        Employee e3 = new Employee("T3", "Derrick", 72);
        Employee e4 = new Employee("T4", "Piyush", 108);
        Employee e5 = new Employee("T5", "Zen", 54);

        Map<String, Employee> empMap = new LinkedHashMap<>();
        empMap.put(e1.getEmpId(), e1);
        empMap.put(e2.getEmpId(), e2);
        empMap.put(e3.getEmpId(), e3);
        empMap.put(e4.getEmpId(), e4);
        empMap.put(e5.getEmpId(), e5);

        System.out.println("EmpID | Name | Salary");
        for(Map.Entry<String, Employee> e : empMap.entrySet()){
            System.out.print(e.getKey()+ " | ");
            System.out.print(e.getValue().getName()+ " | ");
            System.out.print(e.getValue().getSalary()+ " | ");
            System.out.println();
        }

        List<Map.Entry<String, Employee>> mapEntries = new ArrayList<>(empMap.entrySet());
        //Below code doesn't work , because mapEntries doesn't implement comparable interface, only those objects which have implemented comparable interface can be provided to below method
        //Collections.sort(mapEntries);
        /*
        System.out.println("EmpID | Name | Salary");
        for(Map.Entry<String, Employee> e : empMap.entrySet()){
            System.out.print(e.getKey()+ " | ");
            System.out.print(e.getValue().getName()+ " | ");
            System.out.print(e.getValue().getSalary()+ " | ");
            System.out.println();
        }
        */


        EmployeeSortByName sort1 = new EmployeeSortByName();

        Collections.sort(mapEntries, sort1);

        System.out.println("----------After Sorting--------------");
        System.out.println("EmpID | Name | Salary");
        for(Map.Entry<String, Employee> e: mapEntries){
            System.out.println(e.getKey()+" | "+ e.getValue().getName()+ " | "+ e.getValue().getSalary());
        }



        System.out.println("--------Checking original Map--After Sorting--------------");
        //check the original map, whether it is getting sorted or not? You will find that it doesn't get sorted.
        System.out.println("EmpID | Name | Salary");
        for(Map.Entry<String, Employee> e : empMap.entrySet()){
            System.out.print(e.getKey()+ " | ");
            System.out.print(e.getValue().getName()+ " | ");
            System.out.print(e.getValue().getSalary()+ " | ");
            System.out.println();
        }

        Map<String, Employee> m1 = new LinkedHashMap<>();
        for(Map.Entry<String, Employee> e: mapEntries){
            m1.put(e.getKey(),e.getValue());
        }


        System.out.println("--------Checking new Map--After Sorting--------------");
        //check the original map, whether it is getting sorted or not? You will find that it doesn't get sorted.
        System.out.println("EmpID | Name | Salary");
        for(Map.Entry<String, Employee> e : m1.entrySet()){
            System.out.print(e.getKey()+ " | ");
            System.out.print(e.getValue().getName()+ " | ");
            System.out.print(e.getValue().getSalary()+ " | ");
            System.out.println();
        }











    }


}

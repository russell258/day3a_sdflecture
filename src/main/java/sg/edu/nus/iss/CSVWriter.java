package sg.edu.nus.iss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {

    public static final String COMMA_DELIMITER=",";
    public static final String NEWLINE_SEPARATOR="\n";
    public static final String FILE_HEADER = "staffNo, fullName, department, role, emailAddress, salary";



    public List<Employee> employees = null;

    public List<Employee> generateEmployees(){
        employees = new ArrayList<>();

        Employee emp1 = new Employee("12344","Bryan", "Bustomer Relation","Relationship manager B", "bryan@visa.com", 10000);
        Employee emp2 = new Employee("12345","Aryan", "Austomer Relation","Relationship manager A", "aryan@visa.com", 20000);
        Employee emp3 = new Employee("12346","Cryan", "Customer Relation","Relationship manager C", "cryan@visa.com", 30000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(FILE_HEADER);
        bw.append("\n");
        for (Employee record:employees){
            bw.append(record.getStaffNo());
            bw.append(COMMA_DELIMITER);
            bw.append(record.getFullName());
            bw.append(COMMA_DELIMITER);
            bw.append(record.getDepartment());
            bw.append(COMMA_DELIMITER);
            bw.append(record.getRole());
            bw.append(COMMA_DELIMITER);
            bw.append(record.getEmailAddress());
            bw.append(COMMA_DELIMITER);
            bw.append(record.getSalary().toString());
            bw.append(NEWLINE_SEPARATOR);
        }

        bw.flush();
        bw.close();
        fw.close();

        //write the FILE_HEADER

        //iterate through employees 1 to 3 

        // flush and close the file writer
    }

}

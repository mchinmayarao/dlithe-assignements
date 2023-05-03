import java.util.*;

public class EmployeeList {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<Employee>(); 
        Scanner in = new Scanner(System.in);

        String name,department;
        char gender,choice;
        float salary;

        do{
            System.out.print("Employee Name: ");
            name = in.nextLine();
            System.out.print("Department: ");
            department = in.nextLine();
            System.out.print("Salary: ");
            salary = in.nextFloat();
            System.out.print("Gender: ");
            gender = in.next().charAt(0);
            Employee e = new Employee(name,department,salary,gender);
            employees.add(e);
            System.out.print("Want to add more[Y/N]? : ");
            choice = in.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');

        System.out.print("Department to be displayed: ");
        department = in.next();
        //displaying employee details from department 
        
        for(Employee emp: employees){
            if(emp.getDepartment().equals(department))
                System.out.println(emp);
           
        }

    }
    
}

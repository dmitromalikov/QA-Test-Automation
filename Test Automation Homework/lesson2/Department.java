import java.util.HashSet;
import java.util.Set;

public class Department {
private String name;
private Set employee = new HashSet();
public Department(String n){
	name = n;
}
public void setName(String newName){
	name = newName;
}
public String getName(){
	return name;
}
public void addEmployee(Employee newEmployee){
	employee.add(newEmployee);
	newEmployee.setDepartment(this);
    }
public Set getEmployee(){
        return employee;
    }
public void removeEmployee(Employee e){
	employee.remove(e);
    }
}
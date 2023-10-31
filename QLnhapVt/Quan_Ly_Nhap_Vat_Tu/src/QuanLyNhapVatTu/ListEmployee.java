package QuanLyNhapVatTu;

import java.util.*;
import java.util.stream.Collectors;

public class ListEmployee {
    private ArrayList<Employee> listEmployee;

    public ListEmployee() {
        listEmployee = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.listEmployee.add(employee);
    }

    public void removeEmployee(Employee employee) {
        listEmployee.remove(employee);
    }

    public void changeEmployee(Employee employee, String newShift, Warehouse newDepartment) {
        employee.setShift(newShift);
        employee.setDepartment(newDepartment);
    }

    public List<Employee> findEmployeeByCode(String code) {
        return this.listEmployee.stream()
                .filter(o -> o.getCode().equalsIgnoreCase(code))
                .collect(Collectors.toList());
    }

    public void Output() {
        this.listEmployee.forEach(o -> o.Output());
    }
/* 
    public static void main(String[] args) {
        ListEmployee employeeList = new ListEmployee();
    
        Employee employee1 = new Employee("John", "Contact1", "e001", "Shift1", null);
        Employee employee2 = new Employee("Alice", "Contact2", "E002", "Shift2", null);
    
        // Thêm nhân viên vào danh sách
        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
    
        System.out.println("hong tin nhan vien truoc khi thay doi:");
        employeeList.Output();
    
        // Thay đổi thông tin nhân viên
        employeeList.changeEmployee(employee1, "NewShift", null);
        System.out.println("\nThong tin nhan vien sau khi thay doi:");
        employeeList.Output();
    
        // Xóa nhân viên
        System.out.println("\nXoa nhan vien co ma " + employee1.getCode());
        employeeList.removeEmployee(employee1);
        employeeList.Output();
    
        // Tìm kiếm nhân viên theo mã
        String codeToFind = "E002";
        List<Employee> foundEmployees = employeeList.findEmployeeByCode(codeToFind);
    
        if (!foundEmployees.isEmpty()) {
            System.out.println("\nNhan vien co ma " + codeToFind + " duoc tim thay:");
            for (Employee foundEmployee : foundEmployees) {
                foundEmployee.Output();
            }
        } else {
            System.out.println("\nKhong tim thay nv co ma " + codeToFind);
        }
    }
    */
    
}

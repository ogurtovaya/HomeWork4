package prev2;

public class Mail {
    public static void main(String[] args) {

        Employee[] employee ={
                new Employee("Ivan", "manager", "fgkjg@mail.ru","12A", 1253.25, 25),
                new Employee("Petr", "accountant", "fgkjg@mail.ru","11A", 1243.25, 25),
                new Employee("Ivan", "manager", "fgkjg@mail.ru","10A", 1263.25, 35),
                new Employee("Sofi", "accountant", "fgkjg@mail.ru","9A", 1353.25, 28),


    };
        PrintAge(employee,1250.01);

    }

    static void PrintAge(Employee[]employees, double salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()>1250.00){
                employees[i].printInfo();
            }

        }
    }
}

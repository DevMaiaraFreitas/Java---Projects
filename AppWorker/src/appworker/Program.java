
package appworker;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Developed by Maiara Cristina de Freitas
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("------------------------");
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("------------------------");
        System.out.println("Enter worker data: ");
        System.out.print("Name : ");
        String workerName = sc.nextLine();
        System.out.print("Level : ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary : ");
        double workerBaseSalary = sc.nextDouble();
        System.out.println("------------------------");
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
        
        System.out.print("how many contracts to this worker? ");
        int n = sc.nextInt();
        System.out.println("------------------------");
        for(int i=1; i<=n;i++){
            System.out.println("Enter contract number "+i+ " data: ");
            System.out.print("Date (DD/MM/YYYY) : ");
            Date contractDate = simpleDate.parse(sc.next());
            System.out.print("Value per hour : ");
            double valueHour = sc.nextDouble();
            System.out.print("Duration (hours) : ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valueHour, hours);
            worker.addContract(contract);
        }
        System.out.println("------------------------");
        System.out.print("Enter month and year to calculate income (MM/YYYY) :");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("------------------------");
        System.out.println("Name :"+ worker.getName());
        System.out.println("Department :"+ worker.getDepartment().getName());
        System.out.println("Income for :"+ monthAndYear+". Income :"+worker.income(year,month));
        
        sc.close();
    }
    
}

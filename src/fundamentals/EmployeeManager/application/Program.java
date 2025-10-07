package fundamentals.EmployeeManager.application;


import fundamentals.EmployeeManager.application.entities.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //aqui instaciei uma nova List generic
        List<Employee> list = new ArrayList<>();

        System.out.println("How many emplooyes will be registred? ");
        int N = sc.nextInt();

        //loop for para ir salvando dados do cliente...
        for (int i = 0; i < N; i++) {
            System.out.println("Emplooye #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            //loop que vai buscar caso já tenha um id igual ao que foi digitado..
            while(position(list, id) != null){
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();

            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            //aqui vou instaciar o employee
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("Enter the employee ID that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if(pos == null){
            System.out.println("This ID does not exist!");
        } else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();

            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");

        //loop for each para listar funcionários
        for (Employee employee : list){
            System.out.println(employee);
        }



        sc.close();

    }
    //metodo de achar a posição que o id informado está
    public static Integer position (List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
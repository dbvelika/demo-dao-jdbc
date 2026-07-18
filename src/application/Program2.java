package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.crateDepartmentDao();

        System.out.println("\n==== TEST 1: department insert ====");
        Department dep = new Department(null, "Food");
        departmentDao.insert(dep);
        System.out.println("Inserted! New id = "+ dep.getId());

        System.out.println("\n==== TEST 2: department update ====");
        dep = departmentDao.findById(1);
        dep.setName("Book");
        departmentDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("\n==== TEST 3: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n==== TEST 4: department delete ====");
        System.out.println("Enter id for delete test:");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");
        for (Department obj : list){
            System.out.println(obj);
        }

        sc.close();

    }
}

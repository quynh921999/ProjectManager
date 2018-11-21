/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagement;

import java.util.Scanner;

/**
 *
 * @author quynh
 */
public class Manager extends User {
    public Manager(int id, String username, String password, String name){
        super(id, username, password, name);
    }
    public Task createTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task info : ");
        System.out.print("idProject = ");
        int idProj = scanner.nextInt();
        
        System.out.print("developerIDs = ");
        String devIds = scanner.nextLine();
        
        System.out.print("testerIDs = ");
        String tesIds = scanner.nextLine();
        
        System.out.print("createdDate = ");
        String creat = scanner.nextLine();
        
        System.out.print("name = ");
        String name = scanner.nextLine();
        
        Task task = new Task(name, idProj, devIds, tesIds, creat, null, "Created");
        return task;
    }
    //give to dev
    public void assignedTask(Task task){
        if (task.getStatus().equals("Created")){
            task.setStatus("Assigned");
        } else {
            System.out.println("Can not change!");
        }
    }
    public void closeTask(Task task){
        if (task.getStatus().equals("Done")){
            task.setStatus("Closed");
        } else {
            System.out.println("Can not change!");
        }
    }
    
}

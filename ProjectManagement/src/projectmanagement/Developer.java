/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagement;

/**
 *
 * @author quynh
 */
public class Developer extends Employee {
    public Developer(int id, String username, String password, String name){
        super(id, username, password, name);
    }
    public void completeTask(Task task){
        if(task.getStatus().equals("Started")){
            task.setStatus("Completed");
        } else {
            System.out.println("Can not change!");
        }
    }
    public void startTask(Task task){
        if(task.getStatus().equals("Assigned") || task.getStatus().equals("Reject")){
            task.setStatus("Started");
        } else {
            System.out.println("Can not change!");
        }
    }
    
}

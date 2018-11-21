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
public class Tester extends Employee{
    public Tester(int id, String username, String password, String name){
        super(id, username, password, name);
    }
    public void doneTask(Task task){
        if (task.getStatus().equals("Completed")){
            task.setStatus("Done");
        } else {
            System.out.println("Can not change!");
        }
    }
    public void rejectTask(Task task){
        if (task.getStatus().equals("Completed")){
            task.setStatus("");
        } else {
            System.out.println("Can not change!");
        }
    }
}

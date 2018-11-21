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
public class Employee extends User {
    private int managerID;
    public Employee(int id, String username, String password, String name){
        super(id, username, password, name);
    }
    public Employee(int id, int manaID, String username, String password, String name){
        super(id, username, password, name);
        this.managerID = manaID;
    }

    /**
     * @return the managerID
     */
    public int getManagerID() {
        return managerID;
    }

    /**
     * @param managerID the managerID to set
     */
    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }
    
}

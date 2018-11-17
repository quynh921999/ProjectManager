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
public class Project {
    private int id;
    private String name;
    private String managerId;
    private String employeeIds;
    public Project(int id, String name, String managerId, String employeeId){
        this.id = id;
        this.name = name;
        this.managerId = managerId;
        this.employeeIds = employeeId;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the managerId
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * @param managerId the managerId to set
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    /**
     * @return the employeeIds
     */
    public String getEmployeeIds() {
        return employeeIds;
    }

    /**
     * @param employeeIds the employeeIds to set
     */
    public void setEmployeeIds(String employeeIds) {
        this.employeeIds = employeeIds;
    }
}

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
public class Task {
    private int id;
    private int projectId;
    private String developerIdS;
    private String testerIds;
    private String createdDate;
    private String endDate;
    private String status;
    private String name;
    public Task(int id, int proj, String develop, String tester, String createDate, String endDate, String status){
        this.id = id;
        this.projectId = proj;
        this.developerIdS = develop;
        this.testerIds = tester;
        this.createdDate = createDate;
        this.endDate = endDate;
        this.status = status;
    }
    public Task(String name, int proj, String develop, String tester, String createDate, String endDate, String status){
        this.name = name;
        this.projectId = proj;
        this.developerIdS = develop;
        this.testerIds = tester;
        this.createdDate = createDate;
        this.endDate = endDate;
        this.status = status;
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
     * @return the projectId
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the developerIdS
     */
    public String getDeveloperIdS() {
        return developerIdS;
    }

    /**
     * @param developerIdS the developerIdS to set
     */
    public void setDeveloperIdS(String developerIdS) {
        this.developerIdS = developerIdS;
    }

    /**
     * @return the testerIds
     */
    public String getTesterIds() {
        return testerIds;
    }

    /**
     * @param testerIds the testerIds to set
     */
    public void setTesterIds(String testerIds) {
        this.testerIds = testerIds;
    }

    /**
     * @return the createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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
    
}

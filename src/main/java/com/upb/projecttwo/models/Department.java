package com.upb.projecttwo.models;


public class Department {
    private String departmentId;
    private String name;
    private String lead;
    
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLead(){
        return lead;
    }

    public void setLead(String lead){
        this.lead = lead;
    }
}


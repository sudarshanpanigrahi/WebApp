package com.lms.Entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="name", length=45, nullable = false)
    private String name;

    @Column(name="email_id",unique = true, length = 128,nullable = true)
    private String emailId;

    @Column(name="mobile",unique = true,length = 10,nullable = true)
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}

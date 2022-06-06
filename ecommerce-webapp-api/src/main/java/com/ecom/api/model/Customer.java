package com.ecom.api.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "cust_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custid;

    @Column(name = "cust_fName", nullable = false)
    private String fName;

    @Column(name = "cust_lName", nullable = false)
    private String lName;

    @Column(name = "cust_mobile", nullable = false)
    private String mobile;

    @Column(name = "cust_shipping", nullable = false)
    private String shipping;

    @Column(name = "cust_billing")
    private String billing;

    @Column(name = "cust_mail", nullable = false, unique = true)
    private String mail;

    @Column(name = "cust_pwd", nullable = false)
    private String password;

    public Customer() {

    }

    public Customer(String fName, String lName, String mobile, String shipping, String billing, String mail, String password) {
        this.fName = fName;
        this.lName = lName;
        this.mobile = mobile;
        this.shipping = shipping;
        this.billing = billing;
        this.mail = mail;
        this.password = password;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

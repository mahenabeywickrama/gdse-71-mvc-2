/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc2.dto;

/**
 *
 * @author mahen
 */
public class CustomerDto{
    
    private String custID;
    private String custTitle;
    private String custName;
    private String dOB;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private int postalCode;

    public CustomerDto(String custID, String custTitle, String custName, String dOB, double salary, String custAddress, String city, String province, int postalCode) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dOB = dOB;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getCustID() {
        return custID;
    }

    public String getCustTitle() {
        return custTitle;
    }

    public String getCustName() {
        return custName;
    }

    public String getdOB() {
        return dOB;
    }

    public double getSalary() {
        return salary;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    
   
    
}

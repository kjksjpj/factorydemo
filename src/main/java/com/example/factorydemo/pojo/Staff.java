package com.example.factorydemo.pojo;
@SuppressWarnings("all")
public class Staff {
    private int staffId;
    private String staffUsername;
    private String staffPassword;
    private String staffNumber;
    private String staffName;
    private String staffSex;
    private String staffBrithday;
    private int staffAge;
    private String staffKind;
    private String staffTel;
    private String staffEntryTime;
    private String staffAddress;
    private float staffSalary;
    private int staffState;
    private int staffTaskId;
    private String staffTaskTitle;

    public Staff() {
    }

    public Staff(int staffId, String staffUsername, String staffPassword, String staffNumber, String staffName, String staffSex, String staffBrithday, int staffAge, String staffKind, String staffTel, String staffEntryTime, String staffAddress, float staffSalary, int staffState, int staffTaskId, String staffTaskTitle) {
        this.staffId = staffId;
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
        this.staffNumber = staffNumber;
        this.staffName = staffName;
        this.staffSex = staffSex;
        this.staffBrithday = staffBrithday;
        this.staffAge = staffAge;
        this.staffKind = staffKind;
        this.staffTel = staffTel;
        this.staffEntryTime = staffEntryTime;
        this.staffAddress = staffAddress;
        this.staffSalary = staffSalary;
        this.staffState = staffState;
        this.staffTaskId = staffTaskId;
        this.staffTaskTitle = staffTaskTitle;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffBrithday() {
        return staffBrithday;
    }

    public void setStaffBrithday(String staffBrithday) {
        this.staffBrithday = staffBrithday;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffKind() {
        return staffKind;
    }

    public void setStaffKind(String staffKind) {
        this.staffKind = staffKind;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getStaffEntryTime() {
        return staffEntryTime;
    }

    public void setStaffEntryTime(String staffEntryTime) {
        this.staffEntryTime = staffEntryTime;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public float getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(float staffSalary) {
        this.staffSalary = staffSalary;
    }

    public int getStaffState() {
        return staffState;
    }

    public void setStaffState(int staffState) {
        this.staffState = staffState;
    }

    public int getStaffTaskId() {
        return staffTaskId;
    }

    public void setStaffTaskId(int staffTaskId) {
        this.staffTaskId = staffTaskId;
    }

    public String getStaffTaskTitle() {
        return staffTaskTitle;
    }

    public void setStaffTaskTitle(String staffTaskTitle) {
        this.staffTaskTitle = staffTaskTitle;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffUsername='" + staffUsername + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                ", staffNumber='" + staffNumber + '\'' +
                ", staffName='" + staffName + '\'' +
                ", staffSex='" + staffSex + '\'' +
                ", staffBrithday='" + staffBrithday + '\'' +
                ", staffAge=" + staffAge +
                ", staffKind='" + staffKind + '\'' +
                ", staffTel='" + staffTel + '\'' +
                ", staffEntryTime='" + staffEntryTime + '\'' +
                ", staffAddress='" + staffAddress + '\'' +
                ", staffSalary=" + staffSalary +
                ", staffState=" + staffState +
                ", staffTaskId=" + staffTaskId +
                ", staffTaskTitle='" + staffTaskTitle + '\'' +
                '}';
    }
}

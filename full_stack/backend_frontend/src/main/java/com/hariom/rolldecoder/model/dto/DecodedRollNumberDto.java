package com.hariom.rolldecoder.model.dto;

public class DecodedRollNumberDto {

    private String rollNumber;
    private int yearOfAdmission;      // e.g. 24 -> displayed as 2024
    private int collegeCode;
    private String collegeName;
    private int branchCode;
    private String branchName;
    private int serialNumber;
    private String admissionType;     // "Regular" or "Lateral"

    public DecodedRollNumberDto() {
    }

    public DecodedRollNumberDto(String rollNumber, int yearOfAdmission, int collegeCode, String collegeName,
                                 int branchCode, String branchName, int serialNumber, String admissionType) {
        this.rollNumber = rollNumber;
        this.yearOfAdmission = yearOfAdmission;
        this.collegeCode = collegeCode;
        this.collegeName = collegeName;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.serialNumber = serialNumber;
        this.admissionType = admissionType;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public int getFullYear() {
        return 2000 + yearOfAdmission;
    }

    public int getCollegeCode() {
        return collegeCode;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getAdmissionType() {
        return admissionType;
    }
}

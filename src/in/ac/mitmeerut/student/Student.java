package in.ac.mitmeerut.student;

public class Student {

    public String rollNumber;
    public int yearOfAdmission;
    public int instituteCode;
    public int branchCode;
    public int serialNumber;
    public char admissionType;

    public Student(String rollNumber) {

        this.rollNumber = rollNumber;

        yearOfAdmission = Integer.parseInt(rollNumber.substring(0, 2));
        instituteCode = Integer.parseInt(rollNumber.substring(2, 6));
        branchCode = Integer.parseInt(rollNumber.substring(6, 9));
        serialNumber = Integer.parseInt(rollNumber.substring(9, 13));

        if (serialNumber >= 9001) {
            admissionType = 'L';
        } else {
            admissionType = 'R';
        }
    }

    public void display() {

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Year of Admission: 20" + yearOfAdmission);
        System.out.println("Institute Code: " + instituteCode);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("Serial Number: " + serialNumber);

        if (admissionType == 'R')
            System.out.println("Admission Type: Regular");
        else
            System.out.println("Admission Type: Lateral");

        System.out.println("---------------------------");
    }
}

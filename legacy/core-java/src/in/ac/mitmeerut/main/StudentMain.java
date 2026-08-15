package in.ac.mitmeerut.main;

import in.ac.mitmeerut.student.Student;
import in.ac.mitmeerut.analytics.Analytics;

public class StudentMain {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide roll numbers as command line arguments.");
            return;
        }

        String[] rollNumbers = args;

        Student[] students = new Student[rollNumbers.length];
        int validCount = 0;

        for (int i = 0; i < rollNumbers.length; i++) {

            if (rollNumbers[i].length() == 13) {
                students[validCount] = new Student(rollNumbers[i]);
                validCount++;
            } else {
                System.out.println("Invalid Roll Number: " + rollNumbers[i]);
            }
        }

        System.out.println("----- Student Details -----");
        for (int i = 0; i < validCount; i++) {
            students[i].display();
        }

        Analytics analytics = new Analytics();

        System.out.println("----- Analytics -----");
        analytics.yearWiseCount(students, validCount);
        analytics.instituteWiseCount(students, validCount);
        analytics.branchWiseCount(students, validCount);
        analytics.admissionTypeCount(students, validCount);
        analytics.highestBranch(students, validCount);
        analytics.findDuplicates(students, validCount);
    }
}

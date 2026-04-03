package in.ac.mitmeerut.analytics;

import in.ac.mitmeerut.student.Student;

public class Analytics {

    public void yearWiseCount(Student[] students, int count) {

        int count2024 = 0;

        for (int i = 0; i < count; i++) {
            if (students[i].yearOfAdmission == 24)
                count2024++;
        }

        System.out.println("Year 2024 Students: " + count2024);
    }

    public void instituteWiseCount(Student[] students, int count) {

        int mitCount = 0;

        for (int i = 0; i < count; i++) {
            if (students[i].instituteCode == 292)
                mitCount++;
        }

        System.out.println("MIT Meerut Students: " + mitCount);
    }

    public void branchWiseCount(Student[] students, int count) {

        int cse = 0, aiml = 0, ds = 0;

        for (int i = 0; i < count; i++) {

            if (students[i].branchCode == 10)
                cse++;
            else if (students[i].branchCode == 153)
                aiml++;
            else if (students[i].branchCode == 154)
                ds++;
        }

        System.out.println("CSE Core Students: " + cse);
        System.out.println("AIML Students: " + aiml);
        System.out.println("Data Science Students: " + ds);
    }

    public void admissionTypeCount(Student[] students, int count) {

        int regular = 0, lateral = 0;

        for (int i = 0; i < count; i++) {

            if (students[i].admissionType == 'R')
                regular++;
            else
                lateral++;
        }

        System.out.println("Regular Students: " + regular);
        System.out.println("Lateral Students: " + lateral);
    }

    public void highestBranch(Student[] students, int count) {

        int cse = 0, aiml = 0, ds = 0;

        for (int i = 0; i < count; i++) {

            if (students[i].branchCode == 10)
                cse++;
            else if (students[i].branchCode == 153)
                aiml++;
            else if (students[i].branchCode == 154)
                ds++;
        }

        int max = Math.max(cse, Math.max(aiml, ds));

        System.out.println("Branch with Highest Admission:");

        if (cse == max)
            System.out.println("CSE Core");
        if (aiml == max)
            System.out.println("AIML");
        if (ds == max)
            System.out.println("Data Science");
    }

    public void findDuplicates(Student[] students, int count) {

        boolean found = false;

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {

                if (students[i].rollNumber.equals(students[j].rollNumber)) {
                    System.out.println("Duplicate Roll Number: " + students[i].rollNumber);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("No Duplicate Roll Numbers Found.");
    }
}

public class Student {
    String name;
    int age;
    int score;

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void checkPass() {
        if (age >= 18) {
            System.out.println("Adult student");
        } else {
            System.out.println("Minor student");
        }
    }

    void checkGrade() {
        if (score >= 0 && score <= 100) {
            int grade;
            if (score >= 90) {
                grade = 1;
            } else if (score >= 80) {
                grade = 2;
            } else if (score >= 70) {
                grade = 3;
            } else if (score >= 60) {
                grade = 4;
            } else {
                grade = 5;
            }
            switch (grade) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                case 5:
                    System.out.println("F");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "John";
        students[0].age = 23;
        students[0].score = 89;

        students[1] = new Student();
        students[1].name = "Erik";
        students[1].age = 21;
        students[1].score = 65;

        students[2] = new Student();
        students[2].name = "Peter";
        students[2].age = 17;
        students[2].score = 90;

        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
            students[i].checkPass();
            students[i].checkGrade();
        }

        Student best = students[0];
        Student lowestGrade = students[0];

        for (int j = 0; j < students.length; j++) {
            if (students[j].score < lowestGrade.score) {
                lowestGrade = students[j];
            } else if (students[j].score > best.score) {
                best = students[j];
            }
        }

        int diff = best.score - lowestGrade.score;

        System.out.print("Best Student ");
        best.printInfo();
        System.out.print("Lowest grade ");
        lowestGrade.printInfo();
        System.out.println("Difference: " + diff);
    }
}

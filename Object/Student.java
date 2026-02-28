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
        Student student = new Student();
        student.name = "John";
        student.age = 23;
        student.score = 79;

        student.printInfo();
        student.checkPass();
        student.checkGrade();

    }

}

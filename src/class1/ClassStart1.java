package class1;

public class ClassStart1 {
    static class Student {

        String name;
        int age;
        int grade;

        public Student(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
//        Student[] students = new Student[3];

        Student student1 = new Student("1번", 22, 1);
        Student student2 = new Student("2번", 32, 2);
        Student student3 = new Student("3번", 42, 3);

        Student[] students = {student1, student2, student3};

//        students[0] = student1;
//        students[1] = student2;
//        students[2] = new Student("3번", 42, 3);


        for (int i = 0; i < 3; i++) {
            System.out.println("students" + (i + 1) + " = " + students[i].name + " " +
                    students[i].age + "세 " + students[i].grade + "등급");
        }

        for (Student s: students) {
            System.out.println(s.name + " " + s.age + "살 " + s.grade + "등급");
        }
    }
}

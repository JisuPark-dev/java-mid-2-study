package mid1.class1;

public class ClassStart2 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 15, 90);

        Student[] students = new Student[]{student1, student2};
        for (Student student : students) {
            System.out.println(student.name+ student.age+ student.grade);

        }


    }
}

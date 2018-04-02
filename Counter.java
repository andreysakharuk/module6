package module6;

public class Counter {
	
    public static void main(String[] args) {

        int numberOfStudents = 5;
        double numberOfExams = 3;

        Student[] students = {
            new Student(3, 4, 5, "Студент_1"),
            new Student(2, 2, 3, "Студент_2"),
            new Student(3, 4, 4, "Студент_3"),
            new Student(3, 3, 4, "Студент_4"),
            new Student(5, 5, 5, "Студент_5")
        };

        Group group = new Group(students);
        Student[] group_1 = group.getGroup();
        for (Student student : group_1) {
            getAverageStudentMark(student, numberOfExams);
        }
        getNumberOfAchiversAndLoosers(group_1, numberOfExams);
        getAverageGroupMark(group_1, numberOfStudents, numberOfExams);
    }


    public static void getAverageStudentMark(Student student, double numberOfExams) {
        int sumOfMarks = student.getMarks();
        double averageMark = Math.round(sumOfMarks / numberOfExams);
        System.out.println("Средняя оценка " + student.getName() + ": " + (int) averageMark);
    }

    public static void getNumberOfAchiversAndLoosers(Student[] groupNew, double numberOfExams) {
        double sumOfMarksAllStudents = 0;
        int numberOfHighAchievers = 0;
        int numberOfDowagers = 0;
        for (Student student : groupNew) {
            int sumOfMarks = student.getMarks();
            double averageMark = Math.round(sumOfMarks / numberOfExams);
            if (averageMark < 3) {
                numberOfDowagers++;
            }
            if (averageMark > 4) {
                numberOfHighAchievers++;
            }
            sumOfMarksAllStudents = sumOfMarksAllStudents + sumOfMarks;
        }
        System.out.println("Количество отличников: " + numberOfHighAchievers);
        System.out.println("Количество двоечников: " + numberOfDowagers);
    }

    public static void getAverageGroupMark(Student[] groupNew, int numberOfStudents, double numberOfExams) {
        double sumOfMarksAllStudents = 0;
        for (Student student : groupNew) {
            int sumOfMarks = student.getMarks();
            sumOfMarksAllStudents = sumOfMarksAllStudents + sumOfMarks;
        }
        System.out
            .println("Средняя оценка в группе: " + Math.round(sumOfMarksAllStudents / (numberOfStudents * numberOfExams)));
	 }
}



import controller.TeacherController;

public class Lesson4 {

    public static void main(String[] args) {
    new TeacherController().creatTeacher("Ivan", "Ivanov");
    new TeacherController().creatTeacher("Petr", "Petrov");
    new TeacherController().sendOnConsole();
    new TeacherController().editTeacher(2, "Oleg", "Petrov");
    new TeacherController().sendOnConsole();

    }
}
package controller;

import java.util.List;

import model.Teacher;
import model.Teachers;
import model.User;
import view.TeacherView;
import view.UserView;

public class TeacherController implements UserController {
    private UserView<Teacher> view = new TeacherView();
    private List<Teacher> t = Teachers.teachers;

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void creatTeacher(String firstName, String lastName) {
        Teacher newTeacher = new Teacher(Teachers.teachers.size() + 1, firstName, lastName);
        Teachers.teachers.add(newTeacher);
        System.out.println("Учитель добавлен " + firstName + " " + lastName);
    }

    public void editTeacher(int id, String firstName, String lastName) {
        System.out.println("Учитель " + Teachers.teachers.get(id - 1).getName() + " "
                + Teachers.teachers.get(id - 1).getLastName() + " Изменен на " + firstName + " " + lastName);
        Teacher tempTeacher = Teachers.teachers.remove(id - 1);
        tempTeacher.setName(firstName);
        tempTeacher.setLastName(lastName);
        Teachers.teachers.add(tempTeacher);
    }

    public void sendOnConsole() {
        view.sendOnConsole(t);
    }

}

package org.example.sem3.cw2;

import org.example.sem3.cw2.modal.Student;

import java.util.ArrayList;
import java.util.List;
//Дан массив объектов: фамилия студента, номер группы, размер стипендии,баллы по 3 предметам.
// Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.

public class ex2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 734, List.of(3, 4, 5));
        Student student2 = new Student("Машкова", 3, 234, List.of(3, 4, 5));
        Student student3 = new Student("Котлова", 2, 234, List.of(3, 4, 5));
        Student student4 = new Student("Михин", 5, 234, List.of(3, 4, 5));

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        for (Student el : listStudent) {
            double sum = 0;
            for (double es : el.getEvaluations()) {
                sum += es;
            }
            if (el.getSurname().endsWith("ова") && sum % 2 == 0) {
                System.out.println(el.getMoney());
            }

        }
    }
}

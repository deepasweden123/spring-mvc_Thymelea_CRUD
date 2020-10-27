package se.lexicon.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexicon.fullstack.dto.StudentDto;
import se.lexicon.fullstack.entity.Student;
import se.lexicon.fullstack.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/list")
    public String showStudentList(Model model) {
        List<Student> studentList = (List<Student>) studentRepository.findAll();
        List<StudentDto> studentDTOs = studentList.stream().map(student -> new StudentDto(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getCourse(),
                student.getRegisterDate())).collect(Collectors.toList());
        model.addAttribute("students", studentDTOs);
        return "student_control";
    }


    @GetMapping("/find/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {
        System.out.println("id = " + id);
        Student student = studentRepository.findById(id).get();
        StudentDto dto = new StudentDto(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getCourse(),
                student.getRegisterDate()
        );
        model.addAttribute("dto",dto);
        return "student_view";
    }

}

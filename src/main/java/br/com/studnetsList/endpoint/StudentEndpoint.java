package br.com.studnetsList.endpoint;

import br.com.studnetsList.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

    @GetMapping("/list")
    public List<Student> listAll() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Jose"));
        return list;
    }
}

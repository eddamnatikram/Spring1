package ma.projet.inscription.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import ma.projet.inscription.Dao.IDao;
import ma.projet.inscription.entity.Student;
import ma.projet.inscription.repository.StudentRepository;

@Service
public class StudentService implements IDao<Student> {

    @Autowired
    private StudentRepository studentDao;

    public void createStudent(Student student) {
        studentDao.save(student);
    }

    

    public void deleteStudent(Student student) {
        studentDao.delete(student);
    }

    public Student findStudentById(Long id) {
    	 Optional<Student> student = studentDao.findById(id);
         return student.orElse(null);    }

}

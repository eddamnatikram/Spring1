package ma.projet.inscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.inscription.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}

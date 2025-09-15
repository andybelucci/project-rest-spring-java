package br.com.anderson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.data.dto.v1.PersonDTO;
import br.com.anderson.data.v2.PersonDTOV2;
import br.com.anderson.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Object save(PersonDTOV2 entity);

    Object save(PersonDTO entity);

}

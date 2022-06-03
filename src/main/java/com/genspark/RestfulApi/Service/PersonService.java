package com.genspark.RestfulApi.Service;

import com.genspark.RestfulApi.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonService extends CrudRepository<Person, Long> {

}

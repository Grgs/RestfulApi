package com.genspark.RestfulApi.Service;

import com.genspark.RestfulApi.Model.NumberName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberNameService extends CrudRepository<NumberName, Long> {
    Iterable<NumberName> findByName(String name);
    Iterable<NumberName> findByNumber(int number);

}

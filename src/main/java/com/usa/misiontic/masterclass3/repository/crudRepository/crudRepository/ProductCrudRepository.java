package com.usa.misiontic.masterclass3.repository.crudRepository.crudRepository;

import com.usa.misiontic.masterclass3.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}

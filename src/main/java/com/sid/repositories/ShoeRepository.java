package com.sid.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sid.entities.Shoe;

@Repository
public interface ShoeRepository extends MongoRepository<Shoe, String> {

	List<Shoe> findByBrandEquals(@Param("brand") String brand);
	List<Shoe> findByModelEquals(@Param("model") String model);
	Boolean findByCodeExists(@Param("code") String code);
	Shoe findByCodeEquals(@Param("code") String code);
}

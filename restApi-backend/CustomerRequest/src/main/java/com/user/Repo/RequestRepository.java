package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.RequestEntity;
@Repository
public interface RequestRepository extends JpaRepository<RequestEntity, Integer>{

	RequestEntity findById(int id);

	//RequestEntity getById(int id);


}

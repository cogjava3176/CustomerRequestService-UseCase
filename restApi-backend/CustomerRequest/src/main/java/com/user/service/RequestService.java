package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Repo.RequestRepository;
import com.user.entity.RequestEntity;

@Service

public class RequestService {

	@Autowired
	RequestRepository repository;

	public RequestEntity save(RequestEntity request) {
		return repository.save(request);
	}

	public List<RequestEntity> saveRequests(List<RequestEntity> requests) {
		return repository.saveAll(requests);
	}

	public List<RequestEntity> getRequest() {
		return repository.findAll();
	}

	public RequestEntity getRequestById(int id) {
		return repository.getById(id);
	}

	public String deleteRequestt(int id) {
		repository.deleteById(id);
		return "request removed!!" + id;

	
	}

	public RequestEntity updateRequest(RequestEntity request) {
		RequestEntity existingRequest = repository.findById(request.getId());
				existingRequest.setCreatedBy(request.getCreatedBy());
				existingRequest.setDiscription(request.getDescription());
				existingRequest.setRequestId(request.getRequestId());
				return repository.save(existingRequest);
		 
	}
	
	
	
	public Iterable< RequestEntity> getRequest1() {
		Iterable< RequestEntity> request = repository.findAll();
		if (null != request ) {
			return request ;

		} else {
			throw new IllegalArgumentException("No request found!");
		}
	}
}

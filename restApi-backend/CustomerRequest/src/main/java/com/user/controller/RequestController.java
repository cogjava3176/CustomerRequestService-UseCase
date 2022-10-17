package com.user.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.RequestEntity;
import com.user.service.RequestService;

import lombok.extern.slf4j.Slf4j;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/user")
public class RequestController {
	
	@Autowired
	RequestService service;
	
	@PostMapping("/addRequest")
	public RequestEntity addRequest(@RequestBody RequestEntity request) {
		return service.save(request);
		
}
	
	@GetMapping("/allRequest")	
	public List<RequestEntity>findAllRequest(){
		return service.getRequest();
	}
	
	@GetMapping("/request/{id}")	
	public RequestEntity findRequestById(@PathVariable int id){
		return service.getRequestById(id);
	}

	
	@DeleteMapping("/delete/{id}")
	public String deleteRequest (@PathVariable int id){
		return service.deleteRequestt(id);
	}
	@PutMapping("/update/{id}")
	public RequestEntity updateRequest(@RequestBody RequestEntity request,@PathVariable Integer id) {
		return service.updateRequest(request);
	}
	
	
	
}
//@PostMapping("/addRequests")
//public List<RequestEntity> addRequests(@RequestBody List<RequestEntity> requests) {
//	return service.saveRequests(requests);
//
	
	
	
//	
//    @GetMapping("/search")
//
//    public List<RequestEntity> getRequest1(@RequestParam(value = "requestId", required = false) String requestId,
//                                   @RequestParam(value = "createdBy", required = false) String createdBy){
//        log.debug("inside getRequest");
//        List<RequestEntity> requestList = Streamable.of(service.getRequest1()).toList();
//        List<RequestEntity> sortedList = null;
//        if (null != requestList) {
//            sortedList = requestList.stream()
//                                 .filter(b -> {
//                                     if (requestId == null)
//                                         return true;
//                                     return b.getRequestId().toString().equalsIgnoreCase(requestId);
//                                 })
//                                 .filter(b -> {
//                                     if (createdBy == null)
//                                         return true;
//                                     return b.getCreatedBy().equalsIgnoreCase(createdBy);
//                                 })
//                             .collect(Collectors.toList());
//        }
//
//        return sortedList;
//    }

package com.user.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="request")
public class RequestEntity {
	@Id
	@GeneratedValue
	
	private int id;
	

	@NotBlank(message = "requestId cannot be blank#######")
	private String requestId;
	
	@NotBlank(message = "createdBy cannot be blank#######")
	private String createdBy;

	@NotBlank(message = "description cannot be blank#######")
	private String description;

	private boolean status;
	
	@NotBlank(message = "date cannot be blank#######")
	private  LocalDate date;

	@Enumerated(EnumType.STRING)
	private RequestType type;

	public RequestEntity() {
		super();
	}

	public RequestEntity(int id, @NotBlank(message = "requestId cannot be blank#######") String requestId,
			@NotBlank(message = "createdBy cannot be blank#######") String createdBy,
			@NotBlank(message = "description cannot be blank#######") String description, boolean status,
			@NotBlank(message = "date cannot be blank#######") LocalDate date, RequestType type) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.createdBy = createdBy;
		this.description = description;
		this.status = status;
		this.date = date;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDiscription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public RequestType getType() {
		return type;
	}

	public void setType(RequestType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RequestEntity [id=" + id + ", requestId=" + requestId + ", createdBy=" + createdBy + ", discription="
				+ description + ", status=" + status + ", date=" + date + ", type=" + type + "]";
	}

	
	
}

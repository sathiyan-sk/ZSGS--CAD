package com.lifelineconnect.data.dto;

public class Complaint {
	 public Integer complaintId;
	    public Integer userId;
	    public String subject;
	    public String message;
	    public String category;
	    public String status;
	    public String submittedDate;
	    public String responseMessage;
	    
	    
		public Integer getComplaintId() {
			return complaintId;
		}
		public void setComplaintId(Integer complaintId) {
			this.complaintId = complaintId;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getSubmittedDate() {
			return submittedDate;
		}
		public void setSubmittedDate(String submittedDate) {
			this.submittedDate = submittedDate;
		}
		public String getResponseMessage() {
			return responseMessage;
		}
		public void setResponseMessage(String responseMessage) {
			this.responseMessage = responseMessage;
		}
	    
	    
	    
}

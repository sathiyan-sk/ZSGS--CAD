package com.lifelineconnect.data.dto;

public class Request {
	public Integer requestId;
    public String requesterName;
    public String contactNumber;
    public String bloodGroup;
    public Integer requiredUnits;
    public String requestDate;
    public String status; // e.g., Approved, Rejected, Pending
    public String reason; // optional message
}

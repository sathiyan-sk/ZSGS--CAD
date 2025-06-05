package com.lifelineconnect.data.dto;
public class Donation {
    public Integer donationId;
    public Integer donorId;
    public String donationDate;
    public String bloodGroup;
    public String quantity; // in ml
    public String location;
    public String status;   // e.g., Completed, Pending, Rejected
}

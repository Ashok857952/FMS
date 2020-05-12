package com.capstone.FMS.FeedbackManagementSystem.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("events_list")
@Data
public class EventList {
	@Id
	private int id;
	private String event_id;
	private String month;
	private String base_location;
	private String beneficiary_name;
	private String council_name;
	private String event_name;
	private Date event_date;
	private String venue_address;
	private int total_volunteers;
	private int total_volunteer_hours;
	private int travel_hours;
	private String business_unit;
	private String event_status;
	
	public EventList(int id, String event_id, String month, String base_location, String beneficiary_name,
			String council_name, String event_name, Date event_date, String venue_address, int total_volunteers,
			int total_volunteer_hours, int travel_hours, String business_unit, String event_status) {
		this.id = id;
		this.event_id = event_id;
		this.month = month;
		this.base_location = base_location;
		this.beneficiary_name = beneficiary_name;
		this.council_name = council_name;
		this.event_name = event_name;
		this.event_date = event_date;
		this.venue_address = venue_address;
		this.total_volunteers = total_volunteers;
		this.total_volunteer_hours = total_volunteer_hours;
		this.travel_hours = travel_hours;
		this.business_unit = business_unit;
		this.event_status = event_status;
	}
	public EventList() {
		
	}
	@Override
	public String toString() {
		return "EventList [id=" + id + ", event_id=" + event_id + ", month=" + month + ", base_location="
				+ base_location + ", beneficiary_name=" + beneficiary_name + ", council_name=" + council_name
				+ ", event_name=" + event_name + ", event_date=" + event_date + ", venue_address=" + venue_address
				+ ", total_volunteers=" + total_volunteers + ", total_volunteer_hours=" + total_volunteer_hours
				+ ", travel_hours=" + travel_hours + ", business_unit=" + business_unit + ", event_status="
				+ event_status + "]";
	}
	
	
	
}

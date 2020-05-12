package com.capstone.FMS.FeedbackManagementSystem.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.FMS.FeedbackManagementSystem.Model.EventList;

@Repository
public interface EventListRepository extends ReactiveCrudRepository<EventList, Integer>{

}

package com.Entry.hotelentry.reprository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Entry.hotelentry.model.Hotel;

public interface hotelRepro extends MongoRepository<Hotel , String> {

}

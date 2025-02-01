package com.ms.rating.services;

import com.ms.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    // create
    Rating create(Rating rating);

    // get all ratings
    List<Rating> getAllRatings();

    // get all by userId
    List<Rating> getAllByUserId(String userId);

    // get all by hotelId
    List<Rating> getAllByHotelId(String hotelId);
}

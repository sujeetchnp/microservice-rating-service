package com.ms.rating.controllers;

import com.ms.rating.entities.Rating;
import com.ms.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    // create rating
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    // get all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    // get all by userId
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getAllByUserId(userId));
    }

    // get all by hotelId
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getAllByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getAllByHotelId(hotelId));
    }
}

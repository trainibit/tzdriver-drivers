package com.trainibit.tzdriver_drivers.controller;

import com.trainibit.tzdriver_drivers.request.ReviewRequest;
import com.trainibit.tzdriver_drivers.response.ReviewResponse;
import com.trainibit.tzdriver_drivers.service.ReviewService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/reviews")
@Validated
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public ResponseEntity<List<ReviewResponse>> getStates(){
        return ResponseEntity.ok(reviewService.findAll());
    }

    @PostMapping
    public ResponseEntity<ReviewResponse> postState(@Valid @RequestBody ReviewRequest reviewRequest) {
        System.out.println(reviewRequest.toString());
        return ResponseEntity.ok( reviewService.postState(reviewRequest) );
    }

    @GetMapping("/{uuid}")
    public ReviewResponse getStateById(@PathVariable UUID uuid){
        return reviewService.findById(uuid);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity< ReviewResponse > putState(@PathVariable UUID uuid, @RequestBody ReviewRequest reviewRequest){
        return ResponseEntity.ok(reviewService.putById(uuid, reviewRequest));
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<ReviewResponse> deleteStateById(@PathVariable UUID uuid){
        return ResponseEntity.ok(reviewService.deleteById(uuid));
    }
}

package com.trainibit.tzdriver_drivers.service;

import com.trainibit.tzdriver_drivers.request.ReviewRequest;
import com.trainibit.tzdriver_drivers.response.ReviewResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ReviewService {
    List<ReviewResponse> findAll();

    ReviewResponse findById(UUID uuid);

    ReviewResponse postState(ReviewRequest reviewRequest);

    ReviewResponse deleteById(UUID uuid);

    ReviewResponse putById(UUID uuid, ReviewRequest reviewRequest);
}

package com.trainibit.tzdriver_drivers.mapper;

import com.trainibit.tzdriver_drivers.entity.Review;
import com.trainibit.tzdriver_drivers.request.ReviewRequest;
import com.trainibit.tzdriver_drivers.response.ReviewResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {}, implementationName = "ReviewMapperImpl")
public interface ReviewMapper {
    ReviewResponse mapEntityToResponseReview(Review review);
    Review mapRequestToEntityReview(ReviewRequest reviewRequest);
    List<ReviewResponse> mapListEntityToListResponseReview(List<Review> reviews);
}

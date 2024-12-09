package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.entity.Review;
import com.trainibit.tzdriver_drivers.mapper.ReviewMapper;
import com.trainibit.tzdriver_drivers.repository.ReviewRepository;
import com.trainibit.tzdriver_drivers.request.ReviewRequest;
import com.trainibit.tzdriver_drivers.response.ReviewResponse;
import com.trainibit.tzdriver_drivers.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@ComponentScan
@Service
public class ReviewServiceImp implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private @Qualifier("reviewMapperImpl") ReviewMapper reviewMapper;

    @Override
    public List<ReviewResponse> findAll() {
        if (reviewRepository.findByActiveTrue().isEmpty()) {
            throw new NoSuchElementException("Error, No se encontraron calificaciones (reviews) con active=true");
        }else{
            return reviewMapper.mapListEntityToListResponseReview(reviewRepository.findByActiveTrue()) ;
        }
    }

    @Override
    public ReviewResponse findById(UUID uuid) {
        //return reviewMapper.mapEntityToResponseReview(reviewRepository.findByUuidAndActiveTrue(uuid).orElseThrow(() -> new NoSuchElementException("Error al buscar calificacion (review) con ID: " + uuid){}));
        return null;
    }

    @Override
    public ReviewResponse postState(ReviewRequest reviewRequest) {
        System.out.println(reviewRequest.toString());
        Review review = reviewMapper.mapRequestToEntityReview(reviewRequest);
        review.setUuid(UUID.randomUUID());
        review.setIdDriver(1l);
        Review reviewSaved = reviewRepository.save(review);
        return reviewMapper.mapEntityToResponseReview(reviewSaved);
    }

    @Override
    public ReviewResponse deleteById(UUID uuid) {
        return null;
    }

    @Override
    public ReviewResponse putById(UUID uuid, ReviewRequest reviewRequest) {
        return null;
    }
}

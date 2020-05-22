package com.ms.ratingsdataservice.resource;


import com.ms.ratingsdataservice.model.Rating;
import com.ms.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId")  String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId")  String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating("100",1),
                new Rating("200",2),
                new Rating("300",3)
        );

        UserRating userRatings =  new UserRating();
        userRatings.setRatings(ratings);

        return userRatings;
    }
}

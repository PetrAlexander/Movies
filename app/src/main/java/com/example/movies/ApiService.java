package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=N0DA3RQ-A4QMY3D-GS0VWAP-M0PV5MP&field=rating.kp&search=8-10&softField=votes.kp&sortType=-1&limit=50")
    Single<MovieResponse> loadMovies(@Query("page") int page);
    @GET("movie?token=N0DA3RQ-A4QMY3D-GS0VWAP-M0PV5MP&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);
    @GET("review?token=N0DA3RQ-A4QMY3D-GS0VWAP-M0PV5MP&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}

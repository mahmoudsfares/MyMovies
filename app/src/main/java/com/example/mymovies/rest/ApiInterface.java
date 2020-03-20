package com.example.mymovies.rest;


import com.example.mymovies.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/*
This interface offers a blueprint for each data set you want returned, it provides keys for the values
that you provide in the called method.
 */

// the part of the link after the BASE_URL and before the ?api_key
// in the example below, the part ###THIS_PART###
public interface ApiInterface {
    // EXAMPLE: https://api.themoviedb.org/3/###THIS_PART###?api_key=53265ddd3b650dc47ec03e250ad91b90
    @GET("movie/top_rated")
    // by passing the key, the passed key will be preceded by the string "api_key"
    // both will come after ###THIS_PART###
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    // here the part {id} will be replaced by the passed id and a "/" character, then the api key attr and string
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}

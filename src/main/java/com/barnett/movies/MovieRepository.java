package com.barnett.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.barnett.movies.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}

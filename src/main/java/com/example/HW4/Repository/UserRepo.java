package com.example.HW4.Repository;

import com.example.HW4.Model.User;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
    boolean existsByEmail(String s);

    // User getProfile();
}
//User user = new User( "Ehsan", "Kabir", "kabir40ehsan@gmail.com",  "111000");
       // return user;



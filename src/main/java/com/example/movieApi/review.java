package com.example.movieApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

@Document(collection ="review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class review {
    @Id
    private ObjectId id;
    private String reviewBody;
    public review(String reviewBody){
        this.reviewBody = reviewBody;
    }
}

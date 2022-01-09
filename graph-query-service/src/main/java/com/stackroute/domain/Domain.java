package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

//@NodeEntity to indicate that this class is directly mapped to a node in Neo4j
@NodeEntity

//With @Data, Lombok will generate getter and setter methods, toString methods, Equal & Hashcode methods
@Data

//@NoArgsConstructor will add constructor with no arguments
@NoArgsConstructor

//@AllArgsConstructor will add constructor with all properties in the class
@AllArgsConstructor

public class Domain {

//    @Id annotation make id variable as Primary key

    @Id

//    @GeneratedValue populates with a value generated by the database
    @GeneratedValue
    private Long domainId;
    private String domainName;
}

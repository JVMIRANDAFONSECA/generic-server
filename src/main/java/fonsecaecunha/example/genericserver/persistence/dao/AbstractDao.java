package fonsecaecunha.example.genericserver.persistence.dao;

import fonsecaecunha.example.genericserver.persistence.model.AbstractModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Generic dao interface, implements <a href="https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html">JpaRepository</a>y
 * for an {@see AbstractModel} with Integer as primary key
 */
@Repository
public interface AbstractDao extends JpaRepository<AbstractModel, Integer> {
 
    

}
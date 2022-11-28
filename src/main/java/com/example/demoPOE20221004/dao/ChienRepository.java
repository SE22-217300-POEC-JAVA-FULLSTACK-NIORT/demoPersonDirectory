package com.example.demoPOE20221004.dao;

import com.example.demoPOE20221004.model.Chien;
import com.example.demoPOE20221004.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChienRepository extends JpaRepository<Chien, Long> {

}
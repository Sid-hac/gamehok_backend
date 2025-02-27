package com.example.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tournament;

@Repository
public interface TournamentDao extends JpaRepository<Tournament, Integer> {


}

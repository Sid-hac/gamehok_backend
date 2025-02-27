package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Tournament;
import com.example.Dao.TournamentDao;

@Service
public class TournamentService {

    @Autowired
    TournamentDao tournamentDao;

    public List<Tournament> getAllTournaments() {
        
        return tournamentDao.findAll();
    }

    public Optional<Tournament> getTournamentById(Integer id) {
        return tournamentDao.findById(id);
    }
    

    
    
}

package org.example.service;

import org.example.entity.Sportsman;
import org.example.repo.ResultRepository;
import org.example.repo.SportsmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SportsmanServiceIMPL implements SportsmanService {

    private final SportsmanRepository sportsmanRepository; // репозиторий

    @Autowired // Добавление бина инстализация
    public SportsmanServiceIMPL(SportsmanRepository sportsmanRepository) {
        this.sportsmanRepository = sportsmanRepository;
    }

    @Override
    public List<String> findBySportsman_nameOrderByPersonal_record() {
        return sportsmanRepository.findBySportsman_nameOrderByPersonal_record();
    }

    @Override
    public List<Sportsman> findAllBySportsmanOrderByPersonal_recordEqualsByWorld_record() {
        return sportsmanRepository.findAllBySportsmanOrderByPersonal_recordEqualsByWorld_record();
    }

    @Override
    public Integer findByMinRankBySportsmanByPersonal_recordEqualsWorld_record() {
        return sportsmanRepository.findByMinRankBySportsmanByPersonal_recordEqualsWorld_record();
    }

    @Override
    public List<Sportsman> findSportsmanByMaxCompetition() {
        return sportsmanRepository.findSportsmanByMaxCompetition();
    }
}

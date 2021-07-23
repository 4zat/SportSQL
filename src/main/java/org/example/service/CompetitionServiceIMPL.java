package org.example.service;

import org.example.entity.Competition;
import org.example.repo.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CompetitionServiceIMPL implements CompetitionService {
    private final CompetitionRepository competitionRepository; // репозиторий

    @Autowired // Добавление бина инстализация
    public CompetitionServiceIMPL(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

}

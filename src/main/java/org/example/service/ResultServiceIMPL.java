package org.example.service;

import org.example.entity.Competition;
import org.example.entity.Result;
import org.example.repo.CompetitionRepository;
import org.example.repo.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ResultServiceIMPL implements ResultService {

    private final ResultRepository resultRepository; // репозиторий

    @Autowired // Добавление бина инстализация
    public ResultServiceIMPL(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }


    @Override
    public List<LocalDate> findByHold_dateCOrderByCity() {
        return resultRepository.findByHold_dateCOrderByCity();
    }

    @Override
    public Integer findByMinResultOrderByCity() {
        return resultRepository.findByMinResultOrderByCity();
    }

    @Override
    public Double findByResultAvgSportsman_id() {
        return resultRepository.findByResultAvgSportsman_id();
    }

    @Override
    public LocalDate findByHold_dateOrderByCityAndResultAvg() {
        return resultRepository.findByHold_dateOrderByCityAndResultAvg();
    }
}

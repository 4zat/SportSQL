package org.example.service;

import org.example.entity.Sportsman;

import java.time.LocalDate;
import java.util.List;

public interface SportsmanService {

    List<String> findBySportsman_nameOrderByPersonal_record();

    List<Sportsman> findAllBySportsmanOrderByPersonal_recordEqualsByWorld_record();

    Integer findByMinRankBySportsmanByPersonal_recordEqualsWorld_record();

    List<Sportsman> findSportsmanByMaxCompetition();

}

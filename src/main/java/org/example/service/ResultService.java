package org.example.service;

import org.example.entity.Competition;
import org.example.entity.Result;

import java.time.LocalDate;
import java.util.List;

public interface ResultService {

//    Integer findIdByResultId(int competitionId);
//
//    Integer findSportsmanIdByResultId(int competitionId);
//
//    Integer findResultByResultId(int competitionId);
//
//    String findCityByResultId(int competitionId);
//
//    LocalDate findHoldDateByResultId(int competitionId);
//
//    List<Result> findAllBySportsmanId();
    List<LocalDate> findByHold_dateCOrderByCity();

    Integer findByMinResultOrderByCity();

    Double findByResultAvgSportsman_id();

    LocalDate findByHold_dateOrderByCityAndResultAvg();
}

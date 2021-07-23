package org.example.controllers;

import org.example.entity.Sportsman;
import org.example.service.CompetitionService;
import org.example.service.ResultService;
import org.example.service.SportsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {

    private final CompetitionService competitionService;
    private final ResultService resultService;
    private final SportsmanService sportsmanService;

    @Autowired
    public AppController(CompetitionService competitionService, ResultService resultService,
                         SportsmanService sportsmanService) {
        this.competitionService = competitionService;
        this.resultService = resultService;
        this.sportsmanService = sportsmanService;
    }



    @GetMapping("/test1")
    @ResponseBody
    List<String> findBySportsman_nameOrderByPersonal_record() {
        return sportsmanService.findBySportsman_nameOrderByPersonal_record();
    }

    @GetMapping("/test2")
    @ResponseBody
    List<LocalDate> findByHold_dateCOrderByCity() {
        return resultService.findByHold_dateCOrderByCity();
    }

    @GetMapping("/test3")
    @ResponseBody
    Integer findByMinResultOrderByCity() {
        return resultService.findByMinResultOrderByCity();
    }

    @GetMapping("/test4")
    @ResponseBody
    Double findByResultAvgSportsman_id() {
        return resultService.findByResultAvgSportsman_id();
    }

    @GetMapping("/test5")
    @ResponseBody
    LocalDate findByHold_dateOrderByCityAndResultAvg() {
        return resultService.findByHold_dateOrderByCityAndResultAvg();
    }

    @GetMapping("/test6")
    @ResponseBody
    List<Sportsman> findAllBySportsmanOrderByPersonal_recordEqualsByWorld_record() {
        return sportsmanService.findAllBySportsmanOrderByPersonal_recordEqualsByWorld_record();
    }

    @GetMapping("/test7")
    @ResponseBody
    Integer findByMinRankBySportsmanByPersonal_recordEqualsWorld_record() {
        return sportsmanService.findByMinRankBySportsmanByPersonal_recordEqualsWorld_record();
    }

    @GetMapping("/test8")
    @ResponseBody
    List<Sportsman> findSportsmanByMaxCompetition() {
        return sportsmanService.findSportsmanByMaxCompetition();
    }
}

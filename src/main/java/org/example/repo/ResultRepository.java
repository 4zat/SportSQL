package org.example.repo;


import org.example.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {


    @Query("select hold_date from Result where city like 'M%'")
    List<LocalDate> findByHold_dateCOrderByCity();

    @Query("select min(result) from Result where city = 'Moscow'")
    Integer findByMinResultOrderByCity();

    @Query("select avg(result) from Result")
    Double findByResultAvgSportsman_id();

    @Query("select r.hold_date from Result r where r.city = 'Moscow' and r.result < (select avg(r1.result) from Result r1)")
    LocalDate findByHold_dateOrderByCityAndResultAvg();

}

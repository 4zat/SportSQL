package org.example.repo;

import org.example.entity.Sportsman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportsmanRepository extends JpaRepository<Sportsman, Long> {

    @Query("select c.sportsman_name from Sportsman c where c.personal_record <> 25")
    List<String> findBySportsman_nameOrderByPersonal_record();

    @Query("select s from Sportsman s, Competition c where s.personal_record = c.world_record")
    List<Sportsman> findAllBySportsmanOrderByPersonal_recordEqualsByWorld_record();

    @Query("select min(s.rank) from Sportsman s, Competition c where\n" +
            "s.personal_record = c.world_record")
    Integer findByMinRankBySportsmanByPersonal_recordEqualsWorld_record();

    @Query(value = "select s.* from sportsman s right join result r on s.sportsman_id = r.sportsman_id\n" +
            "where s.country = (select country from sportsman s1 right join result r1 on s1.sportsman_id = r1.sportsman_id\n" +
            "group by country order by count(s1.sportsman_id) desc limit 1)", nativeQuery = true)
    List<Sportsman> findSportsmanByMaxCompetition();
}

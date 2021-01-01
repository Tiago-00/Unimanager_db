package pt.iade.unimanager_db.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pt.iade.unimanager_db.models.Unit;

public interface UnitRepository extends CrudRepository<Unit, Integer> {

    Iterable<Unit> findByName(String name);
    Iterable<Unit> findByNameLike(String name);
    Iterable<Unit> findByCreditsBetween
                                (int min,int max);
    Iterable<Unit> findByNameLikeAndByCreditsBetween
                (String name,int min,int max);

@Query(value=QueryFindUnitPlans, nativeQuery=true)
    Iterable<UnitPlanView> findAllUnitPlans();

@Query(value = QueryFindUnitPlans +" Where u.dis_id=:id", nativeQuery = true)
    Iterable<UnitPlanView> findUnitPlansById(@Param("id") int id);
                
@Query( value = QueryFindUnitPlans +" Where u.dis_id=:idUnit and c.cur_id=:idCourse", nativeQuery = true)
        Optional<UnitPlanView> findUnitPlanByUnitAndCourse(
            @Param("idUnit") int idUnit,
            @Param("idCourse") int idCourse);
        }
 
}


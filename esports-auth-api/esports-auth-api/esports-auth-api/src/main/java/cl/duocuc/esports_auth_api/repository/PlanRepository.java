package cl.duocuc.esports_auth_api.repository;

import cl.duocuc.esports_auth_api.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

}
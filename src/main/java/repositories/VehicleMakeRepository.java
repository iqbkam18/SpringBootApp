package repositories;

import models.Client;
import models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}

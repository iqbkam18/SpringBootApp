package repositories;

import models.Client;
import models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}

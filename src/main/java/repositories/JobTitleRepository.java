package repositories;

import models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobTitleRepository extends JpaRepository<JobTitleRepository, Integer> {

}

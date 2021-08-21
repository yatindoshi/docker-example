package doshi.yatin.dockerexample.Repository;

import doshi.yatin.dockerexample.domain.Docker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerRepository extends JpaRepository<Docker, Integer> {
}

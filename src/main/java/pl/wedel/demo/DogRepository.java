package pl.wedel.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}

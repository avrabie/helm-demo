package xyz.optimized.demohelm.repo;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import xyz.optimized.demohelm.data.Customer;

@Repository
public interface CustomerRepo extends ReactiveCrudRepository<Customer, Long> {
    @Query("SELECT * FROM customer WHERE last_name = :lastname")
    Flux<Customer> findByLastName(String lastName);

}

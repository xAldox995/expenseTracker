package marco_aldo_project.expenseTracker.repository;

import marco_aldo_project.expenseTracker.entities.Conto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContoRepository extends JpaRepository<Conto, UUID> {
}

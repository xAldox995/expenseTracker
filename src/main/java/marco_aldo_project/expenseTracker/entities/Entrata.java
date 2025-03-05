package marco_aldo_project.expenseTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "entrate")
@Getter
@Setter
public class Entrata extends Transazione {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    public Entrata(double importo, String decrizione) {
        super(importo, decrizione);
    }
}

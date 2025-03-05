package marco_aldo_project.expenseTracker.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@Getter
@Setter
public class Entrata extends Transazione {

    public Entrata(double importo, String decrizione) {
        super(importo, decrizione);
    }
}

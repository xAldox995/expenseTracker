package marco_aldo_project.expenseTracker.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "transazioni")
@Getter
@Setter
public abstract class Transazione {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private double importo;
    private String decrizione;
    @Column(name = "data_transazione")
    private LocalDateTime dataTransazione;

    public Transazione(double importo, String decrizione) {
        this.importo = importo;
        this.decrizione = decrizione;
        this.dataTransazione = LocalDateTime.now();
    }
}


package marco_aldo_project.expenseTracker.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
@Getter
@Setter
public abstract class Transazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "id_conto")
    private Conto conto;
    private double importo;
    private String decrizione;
    private LocalDateTime dataTransazione;

    public Transazione(double importo, String decrizione, Conto conto) {
        this.importo = importo;
        this.decrizione = decrizione;
        this.conto = conto;
        this.dataTransazione = LocalDateTime.now();
    }
}


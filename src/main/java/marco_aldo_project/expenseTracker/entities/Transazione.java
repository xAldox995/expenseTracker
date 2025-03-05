package marco_aldo_project.expenseTracker.entities;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import java.time.LocalDateTime;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Transazione {

    private double importo;
    private String decrizione;
    private LocalDateTime dataTransazione;

    public Transazione(double importo, String decrizione) {
        this.importo = importo;
        this.decrizione = decrizione;
        this.dataTransazione = LocalDateTime.now();
    }
}


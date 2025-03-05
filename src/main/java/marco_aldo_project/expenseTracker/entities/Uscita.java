package marco_aldo_project.expenseTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import marco_aldo_project.expenseTracker.enums.TipoSpesa;

@Entity
@Table(name = "uscite")
@NoArgsConstructor
@Getter
@Setter
public class Uscita extends Transazione{
    private TipoSpesa tipoSpesa;


    public Uscita(double importo, String decrizione, TipoSpesa tipoSpesa, Conto conto) {
        super(importo, decrizione, conto);
        this.tipoSpesa = tipoSpesa;
    }
}

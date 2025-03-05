package marco_aldo_project.expenseTracker.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "salvadanai")
@Getter
@Setter
@NoArgsConstructor
public class Salvadanaio {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome_salvadanaio;
    private double saldo;
    @ManyToOne
    @JoinColumn(name = "id_conto")
    private Conto conto;
    @ManyToMany
    @JoinTable(
            name = "salvadanai_uscite",
            joinColumns = @JoinColumn(name = "id_salvadanaio"),
            inverseJoinColumns = @JoinColumn(name= "id_uscita")
    )
    private List<Uscita> lista_risparmio;

    public Salvadanaio(String nome_salvadanaio, double saldo, Conto conto, List<Uscita> lista_risparmio) {
        this.nome_salvadanaio = nome_salvadanaio;
        this.saldo = saldo;
        this.conto = conto;
        this.lista_risparmio = lista_risparmio;
    }
}

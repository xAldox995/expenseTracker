package marco_aldo_project.expenseTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "conti")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Conto {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private double saldo;
    @OneToOne(mappedBy = "conto")
    private Users users;

    public Conto(double saldo, Users users) {
        this.saldo = saldo;
        this.users = users;
    }
}

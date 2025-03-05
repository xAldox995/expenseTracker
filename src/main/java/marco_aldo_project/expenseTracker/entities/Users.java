package marco_aldo_project.expenseTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import marco_aldo_project.expenseTracker.enums.Ruolo;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Ruolo ruolo;
    private String nome;
    private String cognome;
    @OneToOne
    @JoinColumn(name = "conto_id")
    private Conto conto;

    public Users(String email, String password, Ruolo ruolo, String nome, String cognome, Conto conto) {
        this.email = email;
        this.password = password;
        this.ruolo = ruolo;
        this.nome = nome;
        this.cognome = cognome;
        this.conto = conto;
    }
}

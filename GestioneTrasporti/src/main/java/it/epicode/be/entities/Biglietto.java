package it.epicode.be.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "biglietti")
public class Biglietto extends DocumentoViaggio {


    public Biglietto() {
    }

    public Biglietto(LocalDate dataEmissione, double prezzo, Emettitore emettitore, Utente utente) {
        super(dataEmissione, prezzo, emettitore, utente);
    }


}

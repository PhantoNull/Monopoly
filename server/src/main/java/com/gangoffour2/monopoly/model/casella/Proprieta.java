package com.gangoffour2.monopoly.model.casella;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gangoffour2.monopoly.model.Giocatore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public abstract class Proprieta extends Casella {
    protected int costoBase;
    protected int ipoteca;
    protected int rendita;
    @JsonIgnore
    protected Giocatore proprietario;


    protected Proprieta() {
    }

    public abstract int calcolaAffitto();


}

package com.gangoffour2.monopoly.stati.partita;

import com.gangoffour2.monopoly.azioni.giocatore.Ipoteca;
import com.gangoffour2.monopoly.model.Giocatore;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AttesaFallimento extends StatoPartita{

    //sono positivi
    private int soldiDaPagare;

    @Override
    public void acceptRiprendi(StatoPartita statoPartita) {
        statoPartita.riprendi(this);
    }

    @Override
    public void esegui() {
        partita.attendiAzione();
    }

    void checkFallimento() {
        Giocatore giocatore = partita.getTurnoCorrente().getGiocatore();
        if(giocatore.getConto() > soldiDaPagare){
            partita.setStato(LancioDadi.builder().build());
            partita.continuaTurno();
        }
    }

    @Override
    public void onAzioneGiocatore(Ipoteca ipoteca) {
        partita.getTurnoCorrente().getGiocatore().getCasellaCorrente().onAzioneGiocatore(ipoteca);
        checkFallimento();
    }
}
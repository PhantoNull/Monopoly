package com.gangoffour2.monopoly.stati.partita;

import com.gangoffour2.monopoly.azioni.casella.RichiediAcquisto;
import com.gangoffour2.monopoly.azioni.giocatore.Ipoteca;
import com.gangoffour2.monopoly.azioni.giocatore.LanciaDadi;
import lombok.Builder;

@Builder
public class LancioDadi extends StatoPartita {

    @Override
    public void onAzioneGiocatore(Ipoteca ipoteca){

    }

    @Override
    public void onAzioneGiocatore(LanciaDadi lanciaDadi){

    }


    @Override
    public void onAzioneCasella(RichiediAcquisto richiediAcquisto){
        partita.setStato(AttesaAcquisto.builder().build());
    }


}
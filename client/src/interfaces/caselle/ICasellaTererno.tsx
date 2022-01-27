import {IAlbergo, ICasa} from "../IEdificio";
import {ICasellaProprieta} from "./ICasellaProprieta";

export enum Colore {
    ROSSO = "red",
    BLU = "blue",
    AZZURRO = "light-blue",
    GIALLO = "yellow",
    ARANCIONE = "orange",
    MARRONE = "brown",
    VIOLA = "purple",
    VERDE = "green"
}

export interface ICasellaTerreno extends ICasellaProprieta{
    type: "Terreno",
    affitti: number[],
    colore: Colore,
    costoAlbergo: number,
    costoCasa: number,
    albergo: IAlbergo | null,
    listaCase: ICasa[] | null,
}

export default ICasellaTerreno;
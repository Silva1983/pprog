
package org.dei.tp4.figuras_equals;

public abstract class Figura  {

    private String cor;

    private static final String COR_POR_OMISSAO = "cinzento";

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
        cor=COR_POR_OMISSAO;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Cor: %s", cor);
    }
    
//    @Override
//    public boolean equals(Object outroObjeto) {
//        if (this == outroObjeto) { // if está na mesma referência
//            return true;
//        }
//        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) { // parâmetro null ou ser instância da mesma classe
//            return false;
//        }
//        Figura outraFigura = (Figura) outroObjeto; // downcasting (transformar Object em Figura)
//        return this.cor.equalsIgnoreCase(outraFigura.cor);
//    }
    
    public abstract double calcularArea();
}


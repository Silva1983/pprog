
package org.dei.tp5.automovelcomproprietario;

import org.dei.biblioteca.Pessoa;

public class Automovel {

    private String marca;
    private Pessoa proprietario;

    //não há pessoa por omissao, não faz sentido
    private static final String MARCA_POR_OMISSAO = "sem marca"; 
    //private static final Pessoa PESSOA_POR_OMISSAO = new Pessoa();
    
    public Automovel(String marca, Pessoa proprietario) {
        this.marca = marca;
        this.proprietario = proprietario;
    }

    public Automovel() {
        marca = MARCA_POR_OMISSAO;
        proprietario = new Pessoa();
    }

    public String getMarca() {
        return marca;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return String.format("Automóvel:%n Marca=%s Proprietário=%s", 
                marca, proprietario);
    }
}


package pprog.tp3.model;

import java.util.Objects;

/**
 *
 * @author paulomaio (editado)
 */
public class Servico {

    private String m_strId;
    private String m_strDescricaoBreve;
    private String m_strDescricaoCompleta;
    private double m_dCustoHora;
    private Categoria m_oCategoria;

    private static final String ID_POR_OMISSAO = "sem ID";
    private static final String DESCRICAOBREVE_POR_OMISSAO = "sem descrição breve";
    private static final String DESCRICAOCOMPLETA_POR_OMISSAO = "sem dscrição completa";
    private static final double CUSTOHORA_POR_OMISSAO = 0;

    public Servico() {
        m_strId = ID_POR_OMISSAO;
        m_strDescricaoBreve = DESCRICAOBREVE_POR_OMISSAO;
        m_strDescricaoCompleta = DESCRICAOCOMPLETA_POR_OMISSAO;
        m_dCustoHora = CUSTOHORA_POR_OMISSAO;
        m_oCategoria = new Categoria();
    }

    public Servico(String strId, String strDescricaoBreve, String strDescricaoCompleta, double dCustoHora, Categoria oCategoria) {
        if ((strId == null) || (strDescricaoBreve == null) || (strDescricaoCompleta == null)
                || (dCustoHora < 0) || (oCategoria == null)
                || (strId.isEmpty()) || (strDescricaoBreve.isEmpty()) || (strDescricaoCompleta.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.m_strId = strId;
        this.m_strDescricaoBreve = strDescricaoBreve;
        this.m_strDescricaoCompleta = strDescricaoCompleta;
        this.m_dCustoHora = dCustoHora;
        this.m_oCategoria = oCategoria;
    }

    public boolean hasId(String strId) {
        return this.m_strId.equalsIgnoreCase(strId);
    }

    public String getM_strId() {
        return m_strId;
    }

    public void setM_strId(String m_strId) {
        this.m_strId = m_strId;
    }

    public String getM_strDescricaoBreve() {
        return m_strDescricaoBreve;
    }

    public void setM_strDescricaoBreve(String m_strDescricaoBreve) {
        this.m_strDescricaoBreve = m_strDescricaoBreve;
    }

    public String getM_strDescricaoCompleta() {
        return m_strDescricaoCompleta;
    }

    public void setM_strDescricaoCompleta(String m_strDescricaoCompleta) {
        this.m_strDescricaoCompleta = m_strDescricaoCompleta;
    }

    public double getM_dCustoHora() {
        return m_dCustoHora;
    }

    public void setM_dCustoHora(double m_dCustoHora) {
        this.m_dCustoHora = m_dCustoHora;
    }

    public Categoria getM_oCategoria() {
        return m_oCategoria;
    }

    public void setM_oCategoria(Categoria m_oCategoria) {
        this.m_oCategoria = m_oCategoria;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.m_strId);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        // Inspirado em https://www.sitepoint.com/implement-javas-equals-method-correctly/

        // self check
        if (this == o) {
            return true;
        }
        // null check
        if (o == null) {
            return false;
        }
        // type check and cast
        if (getClass() != o.getClass()) {
            return false;
        }
        // field comparison
        Servico obj = (Servico) o;
        return (Objects.equals(m_strId, obj.m_strId));
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %.2f - Categoria: %s", this.m_strId, this.m_strDescricaoBreve, this.m_strDescricaoCompleta, this.m_dCustoHora, this.m_oCategoria.toString());
    }

}

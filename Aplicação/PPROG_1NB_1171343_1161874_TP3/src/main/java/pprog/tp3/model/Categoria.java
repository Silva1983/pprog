package pprog.tp3.model;

import java.util.Objects;

/**
 *
 * @author paulomaio (editado)
 */
public class Categoria {

    private String m_strCodigo;
    private String m_strDescricao;
    
    private static final String CODIGO_POR_OMISSAO = "sem código";
    private static final String DESCRICAO_POR_OMISSAO = "sem código";
    
    public Categoria() {
        m_strCodigo = CODIGO_POR_OMISSAO;
        m_strDescricao = DESCRICAO_POR_OMISSAO;
    }

    public Categoria(String strCodigo, String strDescricao) {
        if ((strCodigo == null) || (strDescricao == null)
                || (strCodigo.isEmpty()) || (strDescricao.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.m_strCodigo = strCodigo;
        this.m_strDescricao = strDescricao;
    }

    public boolean hasId(String strId) {
        return this.m_strCodigo.equalsIgnoreCase(strId);
    }

    public String getCodigo() {
        return this.m_strCodigo;
    }

    public void setCodigo(String m_strCodigo) {
        this.m_strCodigo = m_strCodigo;
    }

    public String getDescricao() {
        return m_strDescricao;
    }

    public void setDescricao(String m_strDescricao) {
        this.m_strDescricao = m_strDescricao;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.m_strCodigo);
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
        Categoria obj = (Categoria) o;
        return (Objects.equals(m_strCodigo, obj.m_strCodigo));
    }

    @Override
    public String toString() {
        return String.format("%s - %s ", this.m_strCodigo, this.m_strDescricao);
    }

}

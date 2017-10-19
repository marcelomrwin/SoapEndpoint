
package br.com.redhat.service.corp.protocolo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java de protocolo complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="protocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolo", propOrder = { "ano", "codigo", "dataCriacao", "oid", "origem", "tipo" })
public class Protocolo {

    protected Integer ano;
    protected Integer codigo;
    protected Date dataCriacao;
    protected String oid;
    protected String origem;
    protected String tipo;

    /**
     * Obtém o valor da propriedade ano.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getAno() {
	return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setAno(Integer value) {
	this.ano = value;
    }

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getCodigo() {
	return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setCodigo(Integer value) {
	this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacao.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public Date getDataCriacao() {
	return dataCriacao;
    }

    /**
     * Define o valor da propriedade dataCriacao.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDataCriacao(Date value) {
	this.dataCriacao = value;
    }

    /**
     * Obtém o valor da propriedade oid.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOid() {
	return oid;
    }

    /**
     * Define o valor da propriedade oid.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOid(String value) {
	this.oid = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrigem() {
	return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOrigem(String value) {
	this.origem = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTipo() {
	return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTipo(String value) {
	this.tipo = value;
    }

}

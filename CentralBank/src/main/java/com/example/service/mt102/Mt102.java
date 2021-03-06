//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 

package com.example.service.mt102;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creditorSwift" type="{http://service.example.com/mt102}T_SWIFT"/>
 *         &lt;element name="creditorAccountNumber" type="{http://service.example.com/mt102}T_accountNumber"/>
 *         &lt;element name="debtorSwift" type="{http://service.example.com/mt102}T_SWIFT"/>
 *         &lt;element name="debtorAccountNumber" type="{http://service.example.com/mt102}T_accountNumber"/>
 *         &lt;element name="total">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateOfValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateOfPayment" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://service.example.com/mt102}singlePayment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageId",
    "creditorSwift",
    "creditorAccountNumber",
    "debtorSwift",
    "debtorAccountNumber",
    "total",
    "currency",
    "dateOfValue",
    "dateOfPayment",
    "singlePayment"
})
@XmlRootElement(name = "mt102")
public class Mt102 {

	@XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String creditorSwift;
    @XmlElement(required = true)
    protected String creditorAccountNumber;
    @XmlElement(required = true)
    protected String debtorSwift;
    @XmlElement(required = true)
    protected String debtorAccountNumber;
    @XmlElement(required = true)
    protected BigDecimal total;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfPayment;
    @XmlElement(required = true)
    protected List<SinglePayment> singlePayment;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the creditorSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorSwift() {
        return creditorSwift;
    }

    /**
     * Sets the value of the creditorSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorSwift(String value) {
        this.creditorSwift = value;
    }

    /**
     * Gets the value of the creditorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorAccountNumber() {
        return creditorAccountNumber;
    }

    /**
     * Sets the value of the creditorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorAccountNumber(String value) {
        this.creditorAccountNumber = value;
    }

    /**
     * Gets the value of the debtorSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorSwift() {
        return debtorSwift;
    }

    /**
     * Sets the value of the debtorSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorSwift(String value) {
        this.debtorSwift = value;
    }

    /**
     * Gets the value of the debtorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorAccountNumber() {
        return debtorAccountNumber;
    }

    /**
     * Sets the value of the debtorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorAccountNumber(String value) {
        this.debtorAccountNumber = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dateOfValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfValue() {
        return dateOfValue;
    }

    /**
     * Sets the value of the dateOfValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfValue(XMLGregorianCalendar value) {
        this.dateOfValue = value;
    }

    /**
     * Gets the value of the dateOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfPayment() {
        return dateOfPayment;
    }

    /**
     * Sets the value of the dateOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfPayment(XMLGregorianCalendar value) {
        this.dateOfPayment = value;
    }

    /**
     * Gets the value of the singlePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singlePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSinglePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SinglePayment }
     * 
     * 
     */
    public List<SinglePayment> getSinglePayment() {
        if (singlePayment == null) {
            singlePayment = new ArrayList<SinglePayment>();
        }
        return this.singlePayment;
    }
    
    public void setSinglePayment(List<SinglePayment> singlePayment) {
		this.singlePayment = singlePayment;
	}

}

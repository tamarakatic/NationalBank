//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.10 at 11:37:39 PM CEST 
//


package com.example.service.mt103;

import java.math.BigDecimal;
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
 *         &lt;element name="creditorsBank" type="{http://service.example.com/mt103}T_bankData"/>
 *         &lt;element name="debtorsBank" type="{http://service.example.com/mt103}T_bankData"/>
 *         &lt;element name="creditor" type="{http://service.example.com/mt103}T_companyData"/>
 *         &lt;element name="debtor" type="{http://service.example.com/mt103}T_companyData"/>
 *         &lt;element name="paymentPurpose" type="{http://service.example.com/mt103}T_string255"/>
 *         &lt;element name="dateOfValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateOfPayment" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="total">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="17"/>
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
    "creditorsBank",
    "debtorsBank",
    "creditor",
    "debtor",
    "paymentPurpose",
    "dateOfValue",
    "dateOfPayment",
    "total",
    "currency"
})
@XmlRootElement(name = "mt103")
public class Mt103 {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected TBankData creditorsBank;
    @XmlElement(required = true)
    protected TBankData debtorsBank;
    @XmlElement(required = true)
    protected TCompanyData creditor;
    @XmlElement(required = true)
    protected TCompanyData debtor;
    @XmlElement(required = true)
    protected String paymentPurpose;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfPayment;
    @XmlElement(required = true)
    protected BigDecimal total;
    @XmlElement(required = true)
    protected String currency;

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
     * Gets the value of the creditorsBank property.
     * 
     * @return
     *     possible object is
     *     {@link TBankData }
     *     
     */
    public TBankData getCreditorsBank() {
        return creditorsBank;
    }

    /**
     * Sets the value of the creditorsBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBankData }
     *     
     */
    public void setCreditorsBank(TBankData value) {
        this.creditorsBank = value;
    }

    /**
     * Gets the value of the debtorsBank property.
     * 
     * @return
     *     possible object is
     *     {@link TBankData }
     *     
     */
    public TBankData getDebtorsBank() {
        return debtorsBank;
    }

    /**
     * Sets the value of the debtorsBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBankData }
     *     
     */
    public void setDebtorsBank(TBankData value) {
        this.debtorsBank = value;
    }

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link TCompanyData }
     *     
     */
    public TCompanyData getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCompanyData }
     *     
     */
    public void setCreditor(TCompanyData value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the debtor property.
     * 
     * @return
     *     possible object is
     *     {@link TCompanyData }
     *     
     */
    public TCompanyData getDebtor() {
        return debtor;
    }

    /**
     * Sets the value of the debtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCompanyData }
     *     
     */
    public void setDebtor(TCompanyData value) {
        this.debtor = value;
    }

    /**
     * Gets the value of the paymentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    /**
     * Sets the value of the paymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPurpose(String value) {
        this.paymentPurpose = value;
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

}

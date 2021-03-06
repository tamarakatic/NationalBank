package com.example.service.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import com.example.Company.service.XMLsecurity.EncryptedStringXmlAdapter;


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
 *         &lt;element name="buyerName" type="{http://service.example.com/invoice}string255"/>
 *         &lt;element name="buyerAddress" type="{http://service.example.com/invoice}string255"/>
 *         &lt;element name="buyerPIB" type="{http://service.example.com/invoice}PIB"/>
 *         &lt;element name="supplierName" type="{http://service.example.com/invoice}string255"/>
 *         &lt;element name="supplierAddress" type="{http://service.example.com/invoice}string255"/>
 *         &lt;element name="supplierPIB" type="{http://service.example.com/invoice}PIB"/>
 *         &lt;element name="accountNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateOfInvoice" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="merchandiseValue" type="{http://service.example.com/invoice}decimal152"/>
 *         &lt;element name="servicesValue" type="{http://service.example.com/invoice}decimal152"/>
 *         &lt;element name="totalValue" type="{http://service.example.com/invoice}decimal152"/>
 *         &lt;element name="totalDiscount" type="{http://service.example.com/invoice}decimal152"/>
 *         &lt;element name="totalTax" type="{http://service.example.com/invoice}decimal152"/>
 *         &lt;element name="totalDue" type="{http://service.example.com/invoice}decimal152"/>
 *         &lt;element name="currency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="billingAccountNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="18"/>
 *               &lt;pattern value="\d{3}-\d{13}-\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateOfValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="invoiceItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="number">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;totalDigits value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="amount">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="12"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="measurementUnit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="unitPrice">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="12"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" type="{http://service.example.com/invoice}decimal122"/>
 *                   &lt;element name="discountPercent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="7"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="discountTotal" type="{http://service.example.com/invoice}decimal122"/>
 *                   &lt;element name="subtractedDiscount" type="{http://service.example.com/invoice}decimal122"/>
 *                   &lt;element name="taxTotal" type="{http://service.example.com/invoice}decimal122"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "buyerName",
    "buyerAddress",
    "buyerPIB",
    "supplierName",
    "supplierAddress",
    "supplierPIB",
    "accountNumber",
    "dateOfInvoice",
    "merchandiseValue",
    "servicesValue",
    "totalValue",
    "totalDiscount",
    "totalTax",
    "totalDue",
    "currency",
    "billingAccountNumber",
    "dateOfValue",
    "invoiceItem"
})
@XmlRootElement(name = "invoice")
public class Invoice {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String buyerName;
    @XmlElement(required = true)
    protected String buyerAddress;
    @XmlElement(required = true)
    protected String buyerPIB;
    @XmlElement(required = true)
    protected String supplierName;
    @XmlElement(required = true)
    protected String supplierAddress;
    @XmlElement(required = true)
    protected String supplierPIB;
    protected int accountNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfInvoice;
    @XmlElement(required = true)
    protected BigDecimal merchandiseValue;
    @XmlElement(required = true)
    protected BigDecimal servicesValue;
    @XmlElement(required = true)
    protected BigDecimal totalValue;
    @XmlElement(required = true)
    protected BigDecimal totalDiscount;
    @XmlElement(required = true)
    protected BigDecimal totalTax;
    @XmlElement(required = true)
    protected BigDecimal totalDue;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String billingAccountNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfValue;
    @XmlElement(required = true)
    protected List<Invoice.InvoiceItem> invoiceItem;

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
     * Gets the value of the buyerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * Sets the value of the buyerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerName(String value) {
        this.buyerName = value;
    }

    /**
     * Gets the value of the buyerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * Sets the value of the buyerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerAddress(String value) {
        this.buyerAddress = value;
    }

    /**
     * Gets the value of the buyerPIB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPIB() {
        return buyerPIB;
    }

    /**
     * Sets the value of the buyerPIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPIB(String value) {
        this.buyerPIB = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the supplierAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * Sets the value of the supplierAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAddress(String value) {
        this.supplierAddress = value;
    }

    /**
     * Gets the value of the supplierPIB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPIB() {
        return supplierPIB;
    }

    /**
     * Sets the value of the supplierPIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPIB(String value) {
        this.supplierPIB = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the dateOfInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfInvoice() {
        return dateOfInvoice;
    }

    /**
     * Sets the value of the dateOfInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfInvoice(XMLGregorianCalendar value) {
        this.dateOfInvoice = value;
    }

    /**
     * Gets the value of the merchandiseValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchandiseValue() {
        return merchandiseValue;
    }

    /**
     * Sets the value of the merchandiseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchandiseValue(BigDecimal value) {
        this.merchandiseValue = value;
    }

    /**
     * Gets the value of the servicesValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicesValue() {
        return servicesValue;
    }

    /**
     * Sets the value of the servicesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicesValue(BigDecimal value) {
        this.servicesValue = value;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValue(BigDecimal value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscount(BigDecimal value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the totalDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDue() {
        return totalDue;
    }

    /**
     * Sets the value of the totalDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDue(BigDecimal value) {
        this.totalDue = value;
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
     * Gets the value of the billingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountNumber(String value) {
        this.billingAccountNumber = value;
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
     * Gets the value of the invoiceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice.InvoiceItem }
     * 
     * 
     */
    public List<Invoice.InvoiceItem> getInvoiceItem() {
        if (invoiceItem == null) {
            invoiceItem = new ArrayList<Invoice.InvoiceItem>();
        }
        return this.invoiceItem;
    }


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
     *         &lt;element name="number">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;totalDigits value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="amount">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="12"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="measurementUnit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="unitPrice">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="12"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value" type="{http://service.example.com/invoice}decimal122"/>
     *         &lt;element name="discountPercent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="7"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="discountTotal" type="{http://service.example.com/invoice}decimal122"/>
     *         &lt;element name="subtractedDiscount" type="{http://service.example.com/invoice}decimal122"/>
     *         &lt;element name="taxTotal" type="{http://service.example.com/invoice}decimal122"/>
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
        "number",
        "name",
        "amount",
        "measurementUnit",
        "unitPrice",
        "value",
        "discountPercent",
        "discountTotal",
        "subtractedDiscount",
        "taxTotal",
        "kind"
    })
    public static class InvoiceItem {

    	@XmlElement(required = true)
        protected int number;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected BigDecimal amount;
        @XmlElement(required = true)
        protected String measurementUnit;
        @XmlElement(required = true)
        protected BigDecimal unitPrice;
        @XmlElement(required = true)
        protected BigDecimal value;
        @XmlElement(required = true)
        protected BigDecimal discountPercent;
        @XmlElement(required = true)
        protected BigDecimal discountTotal;
        @XmlElement(required = true)
        protected BigDecimal subtractedDiscount;
        @XmlElement(required = true)
        protected BigDecimal taxTotal;
        @XmlElement(required = true)
        protected String kind;


		/**
         * Gets the value of the number property.
         * 
         */
        public int getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         */
        public void setNumber(int value) {
            this.number = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the measurementUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasurementUnit() {
            return measurementUnit;
        }

        /**
         * Sets the value of the measurementUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasurementUnit(String value) {
            this.measurementUnit = value;
        }

        /**
         * Gets the value of the unitPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitPrice() {
            return unitPrice;
        }

        /**
         * Sets the value of the unitPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitPrice(BigDecimal value) {
            this.unitPrice = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the discountPercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDiscountPercent() {
            return discountPercent;
        }

        /**
         * Sets the value of the discountPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDiscountPercent(BigDecimal value) {
            this.discountPercent = value;
        }

        /**
         * Gets the value of the discountTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDiscountTotal() {
            return discountTotal;
        }

        /**
         * Sets the value of the discountTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDiscountTotal(BigDecimal value) {
            this.discountTotal = value;
        }

        /**
         * Gets the value of the subtractedDiscount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSubtractedDiscount() {
            return subtractedDiscount;
        }

        /**
         * Sets the value of the subtractedDiscount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSubtractedDiscount(BigDecimal value) {
            this.subtractedDiscount = value;
        }

        /**
         * Gets the value of the taxTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTaxTotal() {
            return taxTotal;
        }

        /**
         * Sets the value of the taxTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTaxTotal(BigDecimal value) {
            this.taxTotal = value;
        }
        
        public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 11:24:19 AM ICT 
//


package org.opencps.api.employee.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="employeeJobPosId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workingUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workingUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leader" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jobPosId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="jobPosTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainJobPos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "employeeJobPosId",
    "workingUnitId",
    "workingUnitName",
    "leader",
    "jobPosId",
    "jobPosTitle",
    "mainJobPos"
})
@XmlRootElement(name = "EmployeeJobposModel")
public class EmployeeJobposModel {

    protected Long employeeJobPosId;
    protected Long workingUnitId;
    protected String workingUnitName;
    protected Integer leader;
    protected Long jobPosId;
    protected String jobPosTitle;
    protected Boolean mainJobPos;

    /**
     * Gets the value of the employeeJobPosId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeJobPosId() {
        return employeeJobPosId;
    }

    /**
     * Sets the value of the employeeJobPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeJobPosId(Long value) {
        this.employeeJobPosId = value;
    }

    /**
     * Gets the value of the workingUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkingUnitId() {
        return workingUnitId;
    }

    /**
     * Sets the value of the workingUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkingUnitId(Long value) {
        this.workingUnitId = value;
    }

    /**
     * Gets the value of the workingUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingUnitName() {
        return workingUnitName;
    }

    /**
     * Sets the value of the workingUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingUnitName(String value) {
        this.workingUnitName = value;
    }

    /**
     * Gets the value of the leader property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeader() {
        return leader;
    }

    /**
     * Sets the value of the leader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeader(Integer value) {
        this.leader = value;
    }

    /**
     * Gets the value of the jobPosId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJobPosId() {
        return jobPosId;
    }

    /**
     * Sets the value of the jobPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJobPosId(Long value) {
        this.jobPosId = value;
    }

    /**
     * Gets the value of the jobPosTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPosTitle() {
        return jobPosTitle;
    }

    /**
     * Sets the value of the jobPosTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPosTitle(String value) {
        this.jobPosTitle = value;
    }

    /**
     * Gets the value of the mainJobPos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainJobPos() {
        return mainJobPos;
    }

    /**
     * Sets the value of the mainJobPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainJobPos(Boolean value) {
        this.mainJobPos = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 01:47:44 PM ICT 
//


package org.opencps.api.employee.model;

import javax.ws.rs.FormParam;
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
 *         &lt;element name="workingUnitId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="jobPosId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mainJobPos" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "workingUnitId",
    "jobPosId",
    "mainJobPos"
})
@XmlRootElement(name = "EmployeeJobposInputModel")
public class EmployeeJobposInputModel {

	@FormParam(value = "workingUnitId")
    protected long workingUnitId;
	@FormParam(value = "jobPosId")
    protected long jobPosId;
	@FormParam(value = "mainJobPos")
    protected String mainJobPos;

    /**
     * Gets the value of the workingUnitId property.
     * 
     */
    public long getWorkingUnitId() {
        return workingUnitId;
    }

    /**
     * Sets the value of the workingUnitId property.
     * 
     */
    public void setWorkingUnitId(long value) {
        this.workingUnitId = value;
    }

    /**
     * Gets the value of the jobPosId property.
     * 
     */
    public long getJobPosId() {
        return jobPosId;
    }

    /**
     * Sets the value of the jobPosId property.
     * 
     */
    public void setJobPosId(long value) {
        this.jobPosId = value;
    }

    /**
     * Gets the value of the mainJobPos property.
     * 
     */
    public String getMainJobPos() {
        return mainJobPos;
    }

    /**
     * Sets the value of the mainJobPos property.
     * 
     */
    public void setMainJobPos(String value) {
        this.mainJobPos = value;
    }

}

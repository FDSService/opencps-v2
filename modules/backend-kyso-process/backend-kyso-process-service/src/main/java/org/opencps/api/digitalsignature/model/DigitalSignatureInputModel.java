//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.12.07 at 10:58:13 AM ICT 
//

package org.opencps.api.digitalsignature.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
* <p>Java class for DeliverableTypeInputModel complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType name="DeliverableTypeInputModel">
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="signFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalSignatureInputModel", propOrder = {
 "sign",
 "signFieldName",
 "fileName",
 "strIdArr",
 "fileEntryId",
 "emailUser"
})
public class DigitalSignatureInputModel {

	@FormParam(value = "sign")
	protected String sign;
	@FormParam(value = "signFieldName")
	protected String signFieldName;
	@FormParam(value = "fileName")
	protected String fileName;
	@FormParam(value = "strIdArr")
	protected String strIdArr;
	@FormParam(value = "fileEntryId")
	protected String fileEntryId;
	@FormParam(value = "emailUser")
	protected String emailUser;

	 /**
	  * Gets the value of the deliverableType property.
	  * 
	  * @return
	  *     possible object is
	  *     {@link String }
	  *     
	  */
	public String getSign() {
		return sign;
	}
	
	/**
	 * Sets the value of the deliverableType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	/**
	 * Gets the value of the deliverableType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getSignFieldName() {
		return signFieldName;
	}
	
	/**
	 * Sets the value of the deliverableType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setSignFieldName(String signFieldName) {
		this.signFieldName = signFieldName;
	}
	
	/**
	 * Gets the value of the deliverableType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getFileName() {
		return fileName;
	}
	
	/**
	 * Sets the value of the deliverableType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStrIdArr() {
		return strIdArr;
	}

	public void setStrIdArr(String strIdArr) {
		this.strIdArr = strIdArr;
	}

	public String getFileEntryId() {
		return fileEntryId;
	}

	public void setFileEntryId(String fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

}

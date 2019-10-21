package in.easyapp.licence4j.easyapplicence4j.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "license")
public class LicenseRequestMdl implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	@Column(name="app_id",nullable=false)
	private String appId ;
	@NotBlank
	@Column(name="service_id",nullable=false)
	private String serviceId ;
	@NotBlank
	@Column(name="valid_for_days",nullable=false)
	private int  validForDays;
	@NotBlank
	@Column(name="user_id",nullable=false)
	private String userId;
	@NotBlank
	@Column(name="license_key",nullable=false)
	private String licenseKey ;
	@NotBlank
	@Column(name="activation_required",nullable=false)
	private boolean  activationRequired ;
	
	@NotBlank
	@Column(name="created_at",nullable=false)
	private Date createdAt;
	

	public LicenseRequestMdl() {
		// TODO Auto-generated constructor stub
	}

	public LicenseRequestMdl(String appId, String serviceId, int validForDays, String userId, String licenseKey,
			boolean activationRequired) {
		this.appId = appId;
		this.serviceId = serviceId;
		this.validForDays = validForDays;
		this.userId = userId;
		this.licenseKey = licenseKey;
		this.activationRequired = activationRequired;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public int getValidForDays() {
		return validForDays;
	}

	public void setValidForDays(int validForDays) {
		this.validForDays = validForDays;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public boolean getActivationRequired() {
		return activationRequired;
	}

	public void setActivationRequired(boolean activationRequired) {
		this.activationRequired = activationRequired;
	}
	

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "LicenseRequestMdl [appId=" + appId + ", userId=" + userId + "]";
	}  

}

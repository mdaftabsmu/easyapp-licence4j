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
	@Column(name="app_id")
	private String appId ;
	@Column(name="service_id")
	private String serviceId ;
	@Column(name="valid_for_days")
	private int  validForDays;
	@Column(name="user_id")
	private String userId;
	@Column(name="license_key")
	private String licenseKey ;
	@Column(name="activation_required")
	private boolean  activationRequired ;
	@Column(name="created_at")
	private Date createdAt;
	@Column(name="subscription_id")
	private String subscriptionId;
	

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
	
	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@Override
	public String toString() {
		return "LicenseRequestMdl [id=" + id + ", appId=" + appId + ", serviceId=" + serviceId + ", validForDays="
				+ validForDays + ", userId=" + userId + ", licenseKey=" + licenseKey + ", activationRequired="
				+ activationRequired + ", createdAt=" + createdAt + ", subscriptionId=" + subscriptionId + "]";
	}

	

}

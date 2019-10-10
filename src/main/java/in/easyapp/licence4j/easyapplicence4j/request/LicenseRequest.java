package in.easyapp.licence4j.easyapplicence4j.request;

import javax.persistence.Entity;

import in.easyapp.licence4j.easyapplicence4j.model.LicenseRequestMdl;

@Entity
public class LicenseRequest {
    private String appId = "appId_1";
    private String serviceId = "testService_1";
    private int  validForDays = 180;
    private String userId = "testUserId";
    private String licenseKey = "iuefifoesfj21epoj.fhaiwf9-28j.fuuihjbb7347yoihfygybki";
    private boolean  activationRequired  =false;

    public LicenseRequest(LicenseRequestMdl model) {
		this.appId = model.getAppId();
		this.serviceId = model.getServiceId();
		this.validForDays = model.getValidForDays();
		this.userId = model.getUserId();
		this.licenseKey = model.getAppId();
		this.activationRequired = model.getActivationRequired();
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
}

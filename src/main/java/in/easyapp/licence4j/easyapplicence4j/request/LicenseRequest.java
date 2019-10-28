package in.easyapp.licence4j.easyapplicence4j.request;


import in.easyapp.licence4j.easyapplicence4j.model.LicenseRequestMdl;

public class LicenseRequest {
    private String appId;
    private String serviceId ;
    private int  validForDays;
    private String userId;
    private String subscriptionId;
    private boolean  activationRequired;
    
    public LicenseRequest() {
		// TODO Auto-generated constructor stub
	}

    public LicenseRequest(LicenseRequestMdl model) {
		this.appId = model.getAppId();
		this.serviceId = model.getServiceId();
		this.validForDays = model.getValidForDays();
		this.userId = model.getUserId();
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

    public boolean getActivationRequired() {
        return activationRequired;
    }

    public void setActivationRequired(boolean activationRequired) {
        this.activationRequired = activationRequired;
    }

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@Override
	public String toString() {
		return "LicenseRequest [appId=" + appId + ", serviceId=" + serviceId + ", userId=" + userId + "]";
	}
}

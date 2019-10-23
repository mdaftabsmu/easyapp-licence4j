package in.easyapp.licence4j.easyapplicence4j.request;

public class LicenseResponse {
    private String appId;
    private String serviceId;
    private String status;

    public LicenseResponse() {
		// TODO Auto-generated constructor stub
	}

    public LicenseResponse(String appId, String serviceId) {
		super();
		this.appId = appId;
		this.serviceId = serviceId;
	}
	public LicenseResponse(String appId, String serviceId, String status) {
		this.appId = appId;
		this.serviceId = serviceId;
		this.status = status;
	}
    public String getServiceId() {
        return serviceId;
    }


	public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getAppId() {
        return appId;

    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

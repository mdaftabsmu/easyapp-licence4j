package in.easyapp.licence4j.easyapplicence4j.request;

public class LicenseKey {
    private String licenseKey = "iuefifoesfj21epoj.fhaiwf9-28j.fuuihjbb7347yoihfygybki";
    private String userId = "testUserId";
    
    public LicenseKey() {
		// TODO Auto-generated constructor stub
	}

    public LicenseKey(String licenseKey, String userId) {
		this.licenseKey = licenseKey;
		this.userId = userId;
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


}

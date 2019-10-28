package in.easyapp.licence4j.easyapplicence4j.request;

public class LicenseKey {
	private String userId;
	private String appId;
	private String subscriptionId;
	private String status;

	public LicenseKey() {
		// TODO Auto-generated constructor stub
	}

	public LicenseKey(String userId, String appId, String subscriptionId, String status) {
		this.userId = userId;
		this.appId = appId;
		this.subscriptionId = subscriptionId;
		this.status = status;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

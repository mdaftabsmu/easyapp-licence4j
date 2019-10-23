package in.easyapp.licence4j.easyapplicence4j.service;

import java.util.List;

import in.easyapp.licence4j.easyapplicence4j.request.LicenseKey;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseRequest;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseResponse;

public interface Licence4jService extends Licence4jCommonConstants {

	LicenseKey generateLicense(LicenseRequest licenseRequest);

	List<LicenseRequest> getLicenseByAppIdAndServiceId(String appId, String serviceId);

	LicenseResponse activateLicense(String serviceId, String appId);

	LicenseResponse validateLicense(String appId, String serviceId);

}

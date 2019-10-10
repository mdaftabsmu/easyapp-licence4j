package in.easyapp.licence4j.easyapplicence4j.service;

import java.util.List;

import in.easyapp.licence4j.easyapplicence4j.request.LicenseKey;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseRequest;

public interface Licence4jService {

	LicenseKey generateLicense(LicenseRequest licenseRequest);

	List<LicenseRequest> getLicenseByAppIdAndServiceId(String appId, String serviceId);

}

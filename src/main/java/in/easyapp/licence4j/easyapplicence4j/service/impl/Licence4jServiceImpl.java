package in.easyapp.licence4j.easyapplicence4j.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.license4j.License;

import in.easyapp.licence4j.easyapplicence4j.exception.Licence4jNotFoundException;
import in.easyapp.licence4j.easyapplicence4j.model.LicenseRequestMdl;
import in.easyapp.licence4j.easyapplicence4j.repository.Licence4jRepository;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseKey;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseRequest;
import in.easyapp.licence4j.easyapplicence4j.service.Licence4jService;
import in.easyapp.licence4j.easyapplicence4j.util.Licence4jUtil;

@Service
public class Licence4jServiceImpl implements Licence4jService {
	
	@Autowired
	private Licence4jRepository licence4jRepository;
	
	

	@Override
	public LicenseKey generateLicense(LicenseRequest licenseRequest) {
		LicenseRequestMdl requestMdl = new LicenseRequestMdl();
		requestMdl.setActivationRequired(true);
		requestMdl.setAppId(licenseRequest.getAppId());
		requestMdl.setCreatedAt(new Date());
		requestMdl.setLicenseKey(licenseRequest.getLicenseKey());
		requestMdl.setServiceId(licenseRequest.getServiceId());
		requestMdl.setUserId(licenseRequest.getUserId());
		requestMdl.setValidForDays(licenseRequest.getValidForDays());
		License validateResponse = null; 
		if(licenseRequest.getServiceId()=="service_id_1" && licenseRequest.getValidForDays()==360) {
			
		}else if(licenseRequest.getServiceId()=="service_id_1" && licenseRequest.getValidForDays()==180) {
			
		}else {
			String licenseStringToValidate = Licence4jUtil.generateLicence("1571158624658934459511571158529822");
			if(licenseStringToValidate!=null && !licenseStringToValidate.isEmpty()) {
				validateResponse = Licence4jUtil.validate(publicKey, licenseStringToValidate, requestMdl.getServiceId());
			}
			requestMdl.setLicenseKey(validateResponse.getLicenseString());
		}
		licence4jRepository.save(requestMdl);
		return new LicenseKey(validateResponse.getLicenseString(),licenseRequest.getUserId());
		
	}

	@Override
	public List<LicenseRequest> getLicenseByAppIdAndServiceId(String appId, String serviceId) {
		 List<LicenseRequestMdl> licenses = licence4jRepository.findAllByAppIdAndServiceId(appId,serviceId);
		 if(licenses == null || licenses.isEmpty()) {
			 throw new Licence4jNotFoundException("Licences not found ");
		 }
		 List<LicenseRequest> licenseReqs = new ArrayList<LicenseRequest>();
		 for(LicenseRequestMdl model :licenses) {
			 licenseReqs.add(new LicenseRequest(model));
		 }
		 return licenseReqs;
	}

}

package in.easyapp.licence4j.easyapplicence4j.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.easyapp.licence4j.easyapplicence4j.exception.Licence4jNotFoundException;
import in.easyapp.licence4j.easyapplicence4j.model.LicenseRequestMdl;
import in.easyapp.licence4j.easyapplicence4j.repository.Licence4jRepository;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseKey;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseRequest;
import in.easyapp.licence4j.easyapplicence4j.service.Licence4jService;

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
		licence4jRepository.save(requestMdl);
		return new LicenseKey(licenseRequest.getLicenseKey(),licenseRequest.getUserId());
		
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

package in.easyapp.licence4j.easyapplicence4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.easyapp.licence4j.easyapplicence4j.request.LicenseKey;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseRequest;
import in.easyapp.licence4j.easyapplicence4j.request.LicenseResponse;
import in.easyapp.licence4j.easyapplicence4j.service.Licence4jService;



@RestController
public class Licence4jController {
	
	@Autowired
	private Licence4jService licence4jService;
	
	@RequestMapping(value = "/licenses", method = RequestMethod.POST)
    public LicenseKey generateLicense(@RequestBody LicenseRequest licenseRequest) {
		return licence4jService.generateLicense(licenseRequest);
    }

    @RequestMapping(value = "/licenses", method = RequestMethod.GET)
    public List<LicenseRequest> getLicenses(@RequestParam(value = "appId", required = false) String appId,
                                     @RequestParam(value = "serviceId", required = false) String serviceId) {
        return licence4jService.getLicenseByAppIdAndServiceId(appId,serviceId) ;
    }

    @RequestMapping(value = "/apps/{appId}/services/{serviceId}/activate", method = RequestMethod.POST)
    public LicenseResponse activateLicense(@PathVariable("appId") String appId,
                                      @PathVariable("serviceId") String serviceId) {
        LicenseResponse res =  new LicenseResponse();
        res.setStatus("ACTIVATED");
        return res;
    }

    @RequestMapping(value = "/apps/{appId}/services/{serviceId}/validate", method = RequestMethod.POST)
    public LicenseResponse validateLicense(@PathVariable("appId") String appId,
                                      @PathVariable("serviceId") String serviceId) {
        LicenseResponse res =  new LicenseResponse();
        res.setStatus("VALID");
        return res;
    }
}

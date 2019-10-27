package in.easyapp.licence4j.easyapplicence4j.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.easyapp.licence4j.easyapplicence4j.request.LicenseResponse;
import in.easyapp.licence4j.easyapplicence4j.request.ProjectMdl;
import in.easyapp.licence4j.easyapplicence4j.request.ServiceSubscription;
import in.easyapp.licence4j.easyapplicence4j.service.AppService;

@RestController
public class AppController {
	
	@Autowired
	private AppService appService;

    @RequestMapping(value = "/apps", method = RequestMethod.POST)
    public ProjectMdl createProject(@RequestBody ProjectMdl app, Principal principal) {
    	return appService.createProject(app,principal);
    }

    @RequestMapping(value = "/apps", method = RequestMethod.GET)
    public List<ProjectMdl> getProjectsByUserId(@RequestParam(value = "createdBy", required = false) String createdBy,
                                                Principal principal) {
        List<ProjectMdl> srvList = new ArrayList<>();
        srvList.add(new ProjectMdl(1));
        if(createdBy == null || createdBy.isEmpty())
            srvList.add(new ProjectMdl(2));

        return srvList;
    }

    @RequestMapping(value = "/apps/{appId}", method = RequestMethod.GET)
    public ProjectMdl getProjectsByAppId(@PathVariable("appId") String appId) {
        return new ProjectMdl();
    }


    @RequestMapping(value = "/apps/{appId}/services/{serviceId}/subscription", method = RequestMethod.POST)
    public ServiceSubscription subscribeServiceForAppId(@PathVariable("appId") String appId,
                                                        @PathVariable("serviceId") String serviceId,
                                                        ServiceSubscription subcn) {
        ServiceSubscription subscription = new ServiceSubscription();
        subscription.setAppId(appId);
        subscription.setServiceId(serviceId);
        if(subcn.getSubscriptionPlan() != null && !subcn.getSubscriptionPlan().isEmpty())
            subscription.setSubscriptionPlan(subcn.getSubscriptionPlan());
        return subscription;
    }

    @RequestMapping(value = "/apps/{appId}/services", method = RequestMethod.GET)
    public List<ServiceSubscription> getServicesForAppId(@PathVariable("appId") String appId) {
        List<ServiceSubscription> subscriptions = new ArrayList<>();
        for (int i = 0; i < 3 ; i++){
            ServiceSubscription subscription = new ServiceSubscription();
            subscription.setAppId(appId);
            subscription.setServiceId("TestService_"+i);
            subscriptions.add(subscription);
        }
        return subscriptions;
    }

    @RequestMapping(value = "/apps/{appId}/services/{serviceId}/subscription", method = RequestMethod.PUT)
    public LicenseResponse updateServiceLicense(@PathVariable("appId") String appId,
                                                @PathVariable("serviceId") String serviceId,
                                                ServiceSubscription subcn) {
        return new LicenseResponse();
    }
}

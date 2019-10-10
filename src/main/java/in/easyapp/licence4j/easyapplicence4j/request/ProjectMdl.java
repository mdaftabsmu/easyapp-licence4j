package in.easyapp.licence4j.easyapplicence4j.request;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectMdl {
    private String appId;
    private String appName = "TestApp-Name";
    private String description ="....";
    private String createdBy = " ";
    private  boolean isActive = true;
    private List<ServiceSubscription> services = new ArrayList<>();
    private long createdAt = Date.from(Instant.now()).getTime();

    public ProjectMdl(){
        this.appId = "appId_1";
    }

    public List<ServiceSubscription> getServices() {
        return services;
    }

    public void setServices(List<ServiceSubscription> services) {
        this.services = services;
    }

    public ProjectMdl(int count){
        this.appId = "appId_"+count;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}

package in.easyapp.licence4j.easyapplicence4j.service;

import java.security.Principal;

import in.easyapp.licence4j.easyapplicence4j.request.ProjectMdl;

public interface AppService  extends Licence4jCommonConstants{

	ProjectMdl createProject(ProjectMdl app, Principal principal);

}

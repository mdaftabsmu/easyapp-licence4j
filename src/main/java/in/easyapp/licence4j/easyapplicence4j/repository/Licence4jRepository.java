package in.easyapp.licence4j.easyapplicence4j.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.easyapp.licence4j.easyapplicence4j.model.LicenseRequestMdl;

@Repository
public interface Licence4jRepository extends JpaRepository<LicenseRequestMdl, Long>  {


	List<LicenseRequestMdl> findAllByAppIdAndServiceId(String appId, String serviceId);

	LicenseRequestMdl  findByAppIdAndServiceId(String appId, String serviceId);

}

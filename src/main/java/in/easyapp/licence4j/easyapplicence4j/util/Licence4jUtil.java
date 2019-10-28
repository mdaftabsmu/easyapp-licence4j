package in.easyapp.licence4j.easyapplicence4j.util;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.license4j.License;
import com.license4j.LicenseKey;
import com.license4j.LicenseValidator;

import in.easyapp.licence4j.easyapplicence4j.service.Licence4jCommonConstants;

public class Licence4jUtil implements Licence4jCommonConstants{

	private static RestTemplate restTemplate = new RestTemplate();

	public static String generateLicence(String productId) {
		try {
			final String baseUrl = "http://localhost:8080/algas/generate/"+productId;
			ResponseEntity<String> response = restTemplate.postForEntity(new URI(baseUrl),null,String.class);
			if(response !=null && response.getStatusCodeValue()==200) {
				return response.getBody(); 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static License validate(String publicKey,String licenseStringToValidate,String serviceId) {
		return LicenseValidator.validate(
				licenseStringToValidate, // REQUIRED - license string
				publicKey, // REQUIRED - public key
				serviceId, // REQUIRED - product id
				null, // product edition if needed
				null, // product version if needed
				null, // current date, null for current date
				null);
	}
	public static License validate1(String publicKey,String licenseStringToValidate,String serviceId) {
	
	/**
	* Following validate method validates given license text and
	* returns a License object. License Text should be given as "licenseString"
	* variable to method below.
	*/
	return LicenseValidator.validate(
			licenseStringToValidate, // license text to validate
		"30819f300d06092a864886f70d010101050003818d003081893032301006072a8648ce3d02002EC311215SHA512withECDSA106052b81040006031e000486516bc465ab979a5c3b17eb5e9076c0f326888504d51b3187f20edcG02818100940b3a302f1c96d999f37f6b2618f6b3f59ec4b1cb3fd1a48f8d6e04b03df02571d06f54fced388c2e3fd2743d13211048da766ec83ab174402686f453515a338d935cd51a578a4d291281b5e20748884574d6cbc95c76c8b5fe64c255ab261003RSA4102413SHA512withRSAe6a03e2f0c448d5404d4ac45d03829a0bd5d414c715ec23d0ae4a2eb52525ac90203010001", // product public key
		"service_id_1", // product id string
		null, // product edition if defined
		null, // product version if defined
		null, // current date, null to use local time
		null // product release date to check manintenance period
	);
	}

	/**
	* After validating or activating a license,
	* License.getValidationStatus() and License.getActivationStatus()
	* methods should be used to check for license status.
	* A switch statement can be used to take action on each license status.
	*/





	public static void main(String[] args) {
			String licenseStringToValidate = new Licence4jUtil().generateLicence("1571158624658934459511571158529822");
			License lic = validate1(publicKey, licenseStringToValidate, "service_id_1");
			System.out.println(lic.getValidationStatus().name());
	}

}

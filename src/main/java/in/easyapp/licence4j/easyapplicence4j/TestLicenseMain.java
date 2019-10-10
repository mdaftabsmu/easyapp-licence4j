package in.easyapp.licence4j.easyapplicence4j;
/*
 * Save this code in a file named as TestLicenseMain.java.
 * Add License4J Runtime Library then run.
 */

import com.license4j.License;
import com.license4j.ValidationStatus;
import com.license4j.LicenseValidator;
import java.util.Calendar;
import java.util.Date;

public class TestLicenseMain {

	public static void main(String[] args) {

	String key = "I3JPW-Q3JJR-QMPLA-UXM2V-AWZR9";

	String publickey = "30819f300d06092a864886f70d010101050003818d003081893032301006072a8648ce3d02002EC311215SHA512withECDSA106052b81040006031e0004d25aef6c143c32177eeba07a6a5aca82853fa85aec79a458224a04a5G028181009f9cf6f5a9bde95c4d280de15e1697c54e230f42004d4a7f4447d86347609424006c56e5eefb76bfd497ce62ab2d5829a4a782370f887403904ea4edfd520a6997d04ae86ae5d417d19b08ef2695345346bcf37e204ce0d18b7f0e9b9623186003RSA4102413SHA512withRSAb34425b7032b0239055399124c22844523c2cad5e6ff2522ddc0a7613a5e658d0203010001";

	String internalString = "1569999100910";
	String nameforValidation = null;
	String companyforValidation = null;
	int hardwareIDMethod=0;


	License license = LicenseValidator.validate(
		key,
		publickey,
		internalString,
		nameforValidation,
		companyforValidation,
		hardwareIDMethod);
	System.out.println("Validating with all correct parameters: " + license.getValidationStatus());


	license = LicenseValidator.validate(
		key,
		publickey,
		"incorrect-internal",
		nameforValidation,
		companyforValidation,
		hardwareIDMethod);
	System.out.println("Validating with incorrect internal string ('incorrect-internal'): " + license.getValidationStatus());


	license = LicenseValidator.validate(
		key,
		publickey,
		internalString,
		nameforValidation,
		companyforValidation,
		hardwareIDMethod);
	System.out.println("License Validation Status before activation: " + license.getValidationStatus());


	// Auto activate license.
	License activatedLicense = LicenseValidator.autoActivate(license, "http://localhost:8080/algas/");
	System.out.println("License Activation Status: " + activatedLicense.getActivationStatus());

	/**
	 * NOTICE
	 *
	 * In your software product, you should save activated license string
	 * into a file on customer's disk; then validate on each software
	 * startup.
	 *
	 * Use the following method to get activated license string and save it
	 * to a license file:
	 * <pre>
	 * String myActivatedLicenseString = activatedLicense.getLicenseString();
	 * </pre>
	 *
	 * Then on each software startup use following validate method to validate it:
	 * 
	 * <pre>
	 * License licenseOnDisk = LicenseValidator.validate(
	 *       myActivatedLicenseString,
	 *       publickey,
	 *       null,
	 *       null,
	 *       null,
	 *       1); // For information on hardware ID method see user guide.
	 * </pre>
	 *
	 * Depending on validation status of the license saved on disk either
	 * allow to run your software or display a message to customer (e.g.
	 * license is invalid or license is expired etc). Following is a switch
	 * block for testing validation status.
	 * <pre>
	 * switch (licenseOnDisk.getValidationStatus()) {
	 *   case LICENSE_VALID:
	 *       // the activated license is valid, no problem, run the software.
	 *       break;
	 *   case LICENSE_EXPIRED:
	 *       // the activated license is expired, display a message to customer and do not allow software run.
	 *       JOptionPane.showMessageDialog(null, "Your license expired, get a new license.");
	 *       break;
	 *   //case XXX: // Put all other ValidationStatus codes here you need.
	 *   //   break;
	 *   default:
	 *       // not reachable if you put all your alternative validation status codes.
	 *       break;
	 * }
	 * </pre>
	 */

	}
}

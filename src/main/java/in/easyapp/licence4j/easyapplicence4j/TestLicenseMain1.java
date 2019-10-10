package in.easyapp.licence4j.easyapplicence4j;
/*
 * Save this code in a file named as TestLicenseMain.java.
 * Add License4J Runtime Library then run.
 */

import com.license4j.License;
import com.license4j.LicenseValidator;
import java.util.Calendar;
import java.util.Date;

public class TestLicenseMain1 {

	public static void main(String[] args) {

	String licenseString = "8c08fa2ecdfda116657d27a716ad1586bd88559d92caf14a0ee03b406650\r\n" + 
			"a1d5a61b1f95277a6a34976616836ec6227b17d8f5dad4c257f6146703ab\r\n" + 
			"45573bd235140d7cf080e3ca5878c66c9a9eca11ef0fd070c12b2c27b920\r\n" + 
			"f081c922c12e36942d5ed1104f5f5b4ad5a2eef44957fe661a77d591e89a\r\n" + 
			"e2e6a718416cb8ad1e66babd7b73b460b7b0933926b195485899615de535\r\n" + 
			"a6e437388448e81c3384d06a499453d15b5fb09a4e32a12040f421034fe2\r\n" + 
			"cb184e3749374ba4316c0cbda83b15ddc5bce3d18c57c6dd106f0bbf3d77\r\n" + 
			"f2c238294409c487faa6031e34e258eeca5488f550475d1edcc198cc14a1\r\n" + 
			"5d6d8065f24946d405d533d42cef0c752670685f6cfc328f62785106c04e\r\n" + 
			"764cfd7042a9e07cf10cc4802432e9e25318149ff0f38aad0df40e49f292\r\n" + 
			"c13a20d9393ccb2460ac10933b7da8535f6c1688098dcb7908ab875c43df\r\n" + 
			"bed2d26699e639041c0c91f342e4dd091b8ebfa228a2c1ab6e8b2b53f994\r\n" + 
			"7d1f5b90bfced84ee1a42ef02eecb3207aa3a71d420184e261e680cea8e6\r\n" + 
			"ac2b1f5fc5a0cf6361a847c3366dffea627c66bfbfc2935c62be9b1a7535\r\n" + 
			"5f84afda5222e3e47f7f76c789bdec36c6242f2ad4af1d5fba025d5bc3d3\r\n" + 
			"037b4104a6cf162ffc2c13dc83e320ce5bbccdc9f0df53978f7317b23f86\r\n" + 
			"bffbad20d3ce8a0d20da18ff971f24e54f88c34f0465f27f5a834b881a77\r\n" + 
			"6e570b848eaf024ce06719e4dcf4ad45720f3ce5c0940ca295cc";

	String publickey = "30819f300d06092a864886f70d010101050003818d003081893032301006\r\n" + 
			"072a8648ce3d02002EC311215SHA512withECDSA106052b81040006031e0\r\n" + 
			"0049f94fcde19d71c7530eff9ebd0f02e00c1c41f2a2f8db551e1845d33G\r\n" + 
			"0281810091104e6ebd126ae28533fd9f413e58abf6ec9c727bee1a9007b2\r\n" + 
			"3337a892e7ad79dfc7a79e822b78c10c5e971202b0f86f4d10dea220d32d\r\n" + 
			"ff21d12e2ff03bfcde628e61933d9cc3dc63335a7748c88b654655d9b6ad\r\n" + 
			"b4a439ac45a921c1841503RSA4102413SHA512withRSA76603442b201c38\r\n" + 
			"bafa6081b31048d7345c22a3705e26f02e399ae3e38c46e570203010001";
		
		

		//String licenseString = "8c08fa2ecdfda116913c597b7c2fbd5d8f690446e560f3d5dd16eaea9920c328605ee75b177e537f5f1489f310b937e35ee6a6686a4210e2c7c6089ec60b89a30f8a0ba1643ed35c04bc24940287e3c76cfe12738d789498527e7204fd42452f69486977d50f65f002c579baefdc140fac8aa1ab20f645f6eebb57d231314b7977e36093c60a775ef34b2fc9adc989f73a79f15a7db55fda3e217d01c290e855f12ae68232fa3aea2f47cdb1a73d456a01b1592b0286acb410b3cc2a2c1234609f1af34be9c4b545862f60be9a997751b4aa14c7542b2e354e43b0badda427cebdffc84486801be3ac61141b1065c1526ae436c2106bdec20e34f27fe7ed6b89fa1a9105d34cbe9ad2b63883c4b281e6352578f2ec5d028ee3094bdf9c1129db54600fe5291f466c51f34e22028c715a26a03c674df448eaa08b5dc87c5696c7752050725eefdd735c0b20fe0fcf0ee7efe3223202ff424b33cf4771a2ea2880f01c8cf8a6e31c333022c401f49ffb7f73b5fc005fcab8c607e84ecdedfbb30cdc98409d84401de96b0cbf86c26ebae0498201ce4a4f7581cc86a713b10089586364b99e5d3aaa1d2b81d2321df48e495747d68a12880ef142d601fbe4151bbb3ed0f0c7d40ab5f214b7716d12d34a814272c79fa242ea1ef319a8d5285e863116413ab3ae39c6afced09a292a66f66409523ff378d460b9";

		//String publickey = "30819f300d06092a864886f70d010101050003818d003081893032301006072a8648ce3d02002EC311215SHA512withECDSA106052b81040006031e00049f94fcde19d71c7530eff9ebd0f02e00c1c41f2a2f8db551e1845d33G0281810091104e6ebd126ae28533fd9f413e58abf6ec9c727bee1a9007b23337a892e7ad79dfc7a79e822b78c10c5e971202b0f86f4d10dea220d32dff21d12e2ff03bfcde628e61933d9cc3dc63335a7748c88b654655d9b6adb4a439ac45a921c1841503RSA4102413SHA512withRSA76603442b201c38bafa6081b31048d7345c22a3705e26f02e399ae3e38c46e570203010001";

	String productID = "license4j";
	String productEdition = null;
	String productVersion = null;
	Date licenseExpireDate = null;
	Date maintenanceExpireDate = null;

	License license = LicenseValidator.validate(
		licenseString,
		publickey,
		productID,
		productEdition,
		productVersion,
		null,
		null);
	System.out.println("Validating with all correct parameters: " + license.getValidationStatus());

	Calendar cal = Calendar.getInstance();
	cal.setTime(new Date(1569988785287L));
	cal.add(Calendar.DAY_OF_YEAR, 1);

	license = LicenseValidator.validate(
		licenseString,
		publickey,
		productID,
		productEdition,
		productVersion,
		cal.getTime(),
		null);
	System.out.println("Validating with all correct parameters (date set 1 day after generation date time): " + license.getValidationStatus());


	license = LicenseValidator.validate(
		licenseString,
		publickey,
		"license4j",
		productEdition,
		productVersion,
		null,
		null);
	System.out.println("Validating with incorrect product id ('incorrect-id'): " + license.getValidationStatus());

	cal = Calendar.getInstance();
	cal.setTime(new Date());
	cal.add(Calendar.HOUR_OF_DAY, 48);

	license = LicenseValidator.validate(
		licenseString,
		publickey,
		productID,
		productEdition,
		productVersion,
		cal.getTime(),
		null);
	System.out.println("Validating with incorrect local time: " + license.getValidationStatus());

	}
}

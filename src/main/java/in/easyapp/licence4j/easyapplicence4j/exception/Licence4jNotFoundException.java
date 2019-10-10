package in.easyapp.licence4j.easyapplicence4j.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Licence4jNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Licence4jNotFoundException(String exception) {
		super(exception);
	}

}
package eosclifenmr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class NmrdataNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(NmrdataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(NmrdataNotFoundException ex) {
		return ex.getMessage();
	}
}

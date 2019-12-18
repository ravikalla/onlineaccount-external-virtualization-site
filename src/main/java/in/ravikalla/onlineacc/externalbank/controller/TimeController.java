package in.ravikalla.onlineacc.externalbank.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.ravikalla.onlineacc.externalbank.util.AppConstants;

@RestController
@RequestMapping(AppConstants.DATE_TIME_URI)
public class TimeController {
	private static final Logger L = LogManager.getLogger(TimeController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String getCurrentDateTime() {
		L.info("21 : Start : TimeController.getCurrentDateTime()");
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		String strFormattedDate = formatter.format(date);
		L.info("25 : End : TimeController.getCurrentDateTime() : strFormattedDate = {}", strFormattedDate);
		return strFormattedDate;
	}
}
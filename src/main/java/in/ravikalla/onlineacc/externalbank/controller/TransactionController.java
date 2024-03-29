package in.ravikalla.onlineacc.externalbank.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.ravikalla.onlineacc.externalbank.util.AppConstants;

@RestController
@RequestMapping(AppConstants.EXTERNAL_AUDIT_URI)
public class TransactionController {
	private static final Logger L = LogManager.getLogger(TransactionController.class);

	@RequestMapping(value = AppConstants.EXTERNAL_AUDIT_URL_DEPOSIT + "/{amount}", method = RequestMethod.GET)
	public String deposit(@PathVariable Double amount) {
		L.info("19 : Start : TransactionController.deposit() : amount = {}", amount);
		String strResponse;
		double dblAmount = amount.doubleValue();
		if ((dblAmount >= 5000) && (dblAmount <= 100000000))
			strResponse = "deposit success";
		else
			strResponse = "deposit failed";

		L.info("27 : End : TransactionController.deposit() : amount = {}, strResponse = {}", amount, strResponse);
		return strResponse;
	}

	@RequestMapping(value = AppConstants.EXTERNAL_AUDIT_URL_WITHDRAW + "/{amount}", method = RequestMethod.GET)
	public String withdraw(@PathVariable Double amount) {
		L.info("33 : Start : TransactionController.withdraw() : amount = {}", amount);
		String strResponse;
		double dblAmount = amount.doubleValue();
		if ((dblAmount >= 5000) && (dblAmount <= 100000000))
			strResponse = "withdraw success";
		else
			strResponse = "withdraw failed";

		L.info("41 : End : TransactionController.withdraw() : amount = {}, strResponse = {}", amount, strResponse);
		return strResponse;
	}
}
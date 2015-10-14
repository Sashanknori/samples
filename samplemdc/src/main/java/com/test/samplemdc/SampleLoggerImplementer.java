package com.test.samplemdc;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/info")
@Stateless
public class SampleLoggerImplementer {

	private static final Logger logger = LoggerFactory.getLogger(SampleLoggerImplementer.class);

	@POST
	@Path("/retrieveCustomerDetails")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML, MediaType.TEXT_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML, MediaType.TEXT_XML })
	public void retrieveCustomerDetails(SampleObject sampleobject) {
		logger.debug("Entering retrieveCustomerDetails with parameters : {}", sampleobject);
		logger.error("Entering retrieveCustomerDetails with parameters : {}", sampleobject);
		logger.warn("Entering retrieveCustomerDetails with parameters : {}", sampleobject);
		logger.info("Entering retrieveCustomerDetails with parameters : {}", sampleobject);
		logger.trace("Entering retrieveCustomerDetails with parameters : {}", sampleobject);

	}
}

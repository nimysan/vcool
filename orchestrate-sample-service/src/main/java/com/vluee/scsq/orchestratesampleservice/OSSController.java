package com.vluee.scsq.orchestratesampleservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OSSController {
	private static final Logger LOGGER = LoggerFactory.getLogger(OSSController.class);
	@Autowired
	WeatherServiceClient wsClient;

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") Long id) {
		LOGGER.info("Organization find: id={}", id);
		return wsClient.findByWeatchId(id.intValue()) + "";
	}
}

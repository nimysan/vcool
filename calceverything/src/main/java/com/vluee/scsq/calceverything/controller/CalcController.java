package com.vluee.scsq.calceverything.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController("hb")
public class CalcController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CalcController.class);

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") Long id) {
		LOGGER.info("Employee find: id={}", id);
		return Math.random() + "";
	}
}

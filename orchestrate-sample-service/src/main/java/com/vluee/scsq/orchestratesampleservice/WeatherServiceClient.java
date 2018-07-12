package com.vluee.scsq.orchestratesampleservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "weather-service")
public interface WeatherServiceClient {
	 @GetMapping("/{weatherId}")
	 String findByWeatchId(@PathVariable("weatherId") int weatherId);
}

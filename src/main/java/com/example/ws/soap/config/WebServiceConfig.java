package com.example.ws.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ws.soap.HelloWs;

@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;

	/**
	 * bus parameter is cxf runtime
	 * 
	 * @return
	 */
	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, new HelloWs());
		endpoint.publish("/hello");
		return endpoint;
	}
}

package org.se.serviceproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableHystrix
public class ServiceProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProxyApplication.class, args);
	}

	
	
	@Bean
	RouteLocator staticRoutes(RouteLocatorBuilder builder) {
		return builder.routes().
				route(r->r.path("/publicCcountries/**")
						.filters(f->f
						.addRequestHeader("X-RapidAPI-Host", "world-countries.p.rapidapi.com")
						.addRequestHeader("X-RapidAPI-Key", "168dcb8436mshd73b243fbd7296dp114bf7jsnc5de8280ffd8")
						.rewritePath("/publicCcountries/(?<segment>.*)", "/${segment}")
								)
								.uri("https://world-countries.p.rapidapi.com"))
				                
		
		.route(r->r.path("/muslim/**")
				.filters(f->f.addRequestHeader("X-RapidAPI-Host", "muslimsalat.p.rapidapi.com")
						.addRequestHeader("X-RapidAPI-Key", "168dcb8436mshd73b243fbd7296dp114bf7jsnc5de8280ffd8")
						.rewritePath("/muslim/(?<segment>.*)", "/${segment}")
						)
						.uri("https://muslimsalat.p.rapidapi.com/london.json"))
		                .build();
	}
	

	@Bean
	DiscoveryClientRouteDefinitionLocator dynnamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {
		return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}
}

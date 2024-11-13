package com.esprit.apigatewayt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayTApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayTApplication.class, args);
	}

	@Bean
	public RouteLocator gateway(RouteLocatorBuilder builder) {

		return builder.routes().route("EvenementProject",r->r.path("/Evenements/**").uri("http://localhost:8083"))
		.route("ReclamationGestions",r->r.path("/reclamations/**").uri("http://localhost:8087"))
				.route("GestionFormations",r->r.path("/gestionformation/**").uri("http://localhost:8085"))
				.route("GestionStages",r->r.path("/Stages/**").uri("http://localhost:8086"))
		.route("APPOffer",r->r.path("/APPOffer/**").uri("http://localhost:8084")).build();
	}

}

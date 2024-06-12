package com.portafolio.microservicios.reporr_listener.streams;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.portafolio.microservicios.reporr_listener.documents.ReportDocument;
import com.portafolio.microservicios.reporr_listener.repositories.ReportDocumentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
@AllArgsConstructor
public class ReportListener {
	
	private final ReportDocumentRepository reportDocumentRepository;

	@Bean
	public Consumer<String>consumerReport(){
		
		
		
		return report -> {
			reportDocumentRepository.save(ReportDocument.builder().content(report).build());
			log.info("Saving Report {}",report);
		};
	}
}

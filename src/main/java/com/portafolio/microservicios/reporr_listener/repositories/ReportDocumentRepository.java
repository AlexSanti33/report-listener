package com.portafolio.microservicios.reporr_listener.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.portafolio.microservicios.reporr_listener.documents.ReportDocument;

public interface ReportDocumentRepository extends MongoRepository<ReportDocument,String>{

	
}

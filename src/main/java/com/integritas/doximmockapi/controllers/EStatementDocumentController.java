package com.integritas.doximmockapi.controllers;

import com.integritas.doximmockapi.models.EStatementDocument;
import com.integritas.doximmockapi.repositories.EStatementDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.xml.ws.Response;

@RestController
@RequestMapping("/doxim/api")
public class EStatementDocumentController {

    @Autowired
    private EStatementDocumentRepository eStatementDocumentRepository;


    @GetMapping("/GetEStatementDocuments")
    public ResponseEntity<List<EStatementDocument>> getEStatementDocuments(){

        List<EStatementDocument> eStatementDocuments = eStatementDocumentRepository.findAll();

        return ResponseEntity.ok().body(eStatementDocuments);

    }


}

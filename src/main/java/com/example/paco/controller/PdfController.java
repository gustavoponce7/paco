package com.example.paco.controller;

import com.example.paco.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class PdfController {

    private PdfService pdfService;

    @Autowired
    public PdfController(PdfService pdfService){
        this.pdfService = pdfService;
    }

    @GetMapping(
            value = "/get-pdf",
            produces = MediaType.APPLICATION_PDF_VALUE
    )
    public @ResponseBody byte[] getPdf() throws IOException {
        return pdfService.getContent();
    }
}

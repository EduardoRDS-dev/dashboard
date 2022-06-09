package com.project.dashboard.controllers;

import com.project.dashboard.dto.SaleDTO;
import com.project.dashboard.dto.SaleSuccessDTO;
import com.project.dashboard.dto.SaleSumDTO;
import com.project.dashboard.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
       Page<SaleDTO> page = service.findAll(pageable);
       return ResponseEntity.ok(page);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> result = service.amountGroupedBySeller();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
        List<SaleSuccessDTO> result = service.successGroupedBySeller();
        return ResponseEntity.ok(result);
    }
}

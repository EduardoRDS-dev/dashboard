package com.project.dashboard.service;

import com.project.dashboard.dto.SaleDTO;
import com.project.dashboard.dto.SaleSuccessDTO;
import com.project.dashboard.dto.SaleSumDTO;
import com.project.dashboard.entities.Sale;
import com.project.dashboard.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerService sellerService;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerService.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        sellerService.findAll();
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        sellerService.findAll();
        return saleRepository.successGroupedBySeller();
    }
}

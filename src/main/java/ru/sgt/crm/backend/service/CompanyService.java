package ru.sgt.crm.backend.service;

import org.springframework.stereotype.Service;
import ru.sgt.crm.backend.entity.Company;
import ru.sgt.crm.backend.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

}
package com.example.springapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Payroll;
import com.example.springapp.repository.PayrollRepo;

@Service
public class PayrollService {
    @Autowired
    private PayrollRepo payrollRepo;

    public Payroll savePayroll(Payroll payroll) {
        return payrollRepo.save(payroll);
    }

    public Payroll getPayrollById(Long payrollId) {
        return payrollRepo.findById(payrollId).orElse(null);
    }
}
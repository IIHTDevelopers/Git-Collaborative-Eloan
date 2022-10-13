package com.iiht.training.eloan.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iiht.training.eloan.model.LoanOutputDto;
import com.iiht.training.eloan.model.RejectDto;
import com.iiht.training.eloan.model.SanctionDto;
import com.iiht.training.eloan.model.SanctionOutputDto;
import com.iiht.training.eloan.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	
	@Override
	public List<LoanOutputDto> allProcessedLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RejectDto rejectLoan(Long managerId, Long loanAppId, RejectDto rejectDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanctionOutputDto sanctionLoan(Long managerId, Long loanAppId, SanctionDto sanctionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanOutputDto> allFinalizedLoans(Long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

}

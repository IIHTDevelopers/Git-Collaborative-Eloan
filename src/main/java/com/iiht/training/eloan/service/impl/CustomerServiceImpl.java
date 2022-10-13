package com.iiht.training.eloan.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iiht.training.eloan.model.LoanDto;
import com.iiht.training.eloan.model.LoanOutputDto;
import com.iiht.training.eloan.model.UserDto;
import com.iiht.training.eloan.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Override
	public UserDto register(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanOutputDto applyLoan(Long customerId, LoanDto loanDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanOutputDto getStatus(Long loanAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanOutputDto> getStatusAll(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanOutputDto updateLoanInfo(Long loanAppId, LoanDto loanDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanOutputDto deleteLoan(Long loanAppId) {
		// TODO Auto-generated method stub
		return null;
	}

}

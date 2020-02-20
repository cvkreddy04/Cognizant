package com.cts.starter.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cts.starter.dao.CompanydataRepository;

import com.cts.starter.pojo.Companydata;

import com.cts.starter.pojo.User;

@RestController

@RequestMapping("/ManageCompanies")

public class CompanydataController {

	@Autowired

	private CompanydataRepository companydataRepository;

	@GetMapping

	public Iterable<Companydata> getAllCompanies() {

		return companydataRepository.findAll();

	}

	@PostMapping("/saveCompanydata")

	public Companydata saveCompanydata(@RequestBody Companydata Companydata) {

		System.out.println(Companydata);

	companydataRepository.save(Companydata);

		return Companydata;

	}

	@PutMapping("/updateCompanydata/{username}")

	public Companydata updateCompanydata(@RequestBody Companydata companydata, @PathVariable("companydataname") String companydataname) {

		companydata.setCompanyname(companydataname);

		System.out.println(companydata);

		companydataRepository.save(companydata);

		return companydata;

	}

	@DeleteMapping("/deleteCompanydata/{username}")

	public Boolean deleteCompanydata(@PathVariable("username") String username) {

		System.out.println(username);

		companydataRepository.deleteById(username);

		return true;

	}

	@GetMapping("/findOneInAll/{username}")

	public Companydata findoneinall(@PathVariable("username") String username) {

		Optional<Companydata> companydata = companydataRepository.findById(username);

		return companydata.get();

	}

}

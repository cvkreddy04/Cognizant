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

import com.cts.starter.dao.StockpriceRepository;
import com.cts.starter.pojo.Stockprice;



@RestController

@RequestMapping("/getAllStockprice")

public class StockpriceController {

	@Autowired

	private StockpriceRepository stockpriceRepository;

	@GetMapping

	public Iterable<Stockprice> getAllStockPrice() {

		return stockpriceRepository.findAll();

	}

	@PostMapping("/savestockprice")

	public Stockprice saveStockprice(@RequestBody Stockprice stockprice) {

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@PutMapping("/updateStockPrice/{companyname}")

	public Stockprice updateStockprice(@RequestBody Stockprice stockprice,

			@PathVariable("companyname") String companyname) {

		stockprice.setCompanyname(companyname);

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@DeleteMapping("/deletestockprice/{companyname}")

	public Boolean deleteStockprice(@PathVariable("companyname") String companyname) {

		System.out.println(companyname);

		Optional<Stockprice> stockprice = stockpriceRepository.findById(companyname);

		stockpriceRepository.delete(stockprice.get());

		return true;

	}

	@GetMapping("/findOneInAll5/{companyname}")

	public Stockprice findoneinall(@PathVariable("companyname") String companyname)

	{

		Optional<Stockprice> stockprice = stockpriceRepository.findById(companyname);

		return stockprice.get();

	}

}

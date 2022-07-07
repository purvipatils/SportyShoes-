package com.shoeApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchesController {

	@Autowired
	PurchesReportService purchesReportService;

	@GetMapping("/purchesReport")
	private List<PurchesReport> getAllPurchesReport() {
		return purchesReportService.getAllPurchesReport();
	}

	@GetMapping("/purchesReport/{id}")
	private PurchesReport getPurchesReport(@PathVariable("id") int id) {
		return purchesReportService.getPurchesReportById(id);
	}

	@DeleteMapping("/purchesReport/{id}")
	private void deletePurchesReport(@PathVariable("id") int id) {
		purchesReportService.delete(id);
	}
	@PostMapping("/purchesReport")
	private int savePurchesReport(@RequestBody PurchesReport purchesReport) {
		 purchesReportService.saveOrUpdate(purchesReport);
		return purchesReport.getId();
	}

}

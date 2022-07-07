package com.shoeApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchesReportService {
	@Autowired
	PurchesReportRepository purchesReportRepository;

	public List<PurchesReport> getAllPurchesReport() {
		List<PurchesReport> PurchesReport1 = new ArrayList<PurchesReport>();
		purchesReportRepository.findAll().forEach(PurchesReport -> PurchesReport1.add(PurchesReport));
		return PurchesReport1;
	}

	public PurchesReport getPurchesReportById(int id) {
		return purchesReportRepository.findById(id).get();
	}

	public void saveOrUpdate(PurchesReport purchesReport) {
		purchesReportRepository.save(purchesReport);
	}

	public void delete(int id) {
		purchesReportRepository.deleteById(id);
	}

}



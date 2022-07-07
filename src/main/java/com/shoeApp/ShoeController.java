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
public class ShoeController {

	@Autowired
	ShoeService shoeService;

	@GetMapping("/shoes")
	private List<Shoe> getAllShoes() {
		return shoeService.getAllShoes();
	}

	@GetMapping("/shoes/{id}")
	private Shoe getShoe(@PathVariable("id") int id) {
		return shoeService.getShoeById(id);
	}

	@DeleteMapping("/shoes/{id}")
	private void deleteShoe(@PathVariable("id") int id) {
		shoeService.delete(id);
	}

	@PostMapping("/shoes")
	private int saveShoe(@RequestBody Shoe shoe) {
		shoeService.saveOrUpdate(shoe);
		return shoe.getId();
	}

}

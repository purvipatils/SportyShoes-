package com.shoeApp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoeService {

	@Autowired
	ShoeRepository shoeRepository;

	public List<Shoe> getAllShoes() {
		List<Shoe> shoes = new ArrayList<Shoe>();
		shoeRepository.findAll().forEach(shoe -> shoes.add(shoe));
		return shoes;
	}

	public Shoe getShoeById(int id) {
		return shoeRepository.findById(id).get();
	}

	public void saveOrUpdate(Shoe shoe) {
		shoeRepository.save(shoe);
	}

	public void delete(int id) {
		shoeRepository.deleteById(id);
	}

}
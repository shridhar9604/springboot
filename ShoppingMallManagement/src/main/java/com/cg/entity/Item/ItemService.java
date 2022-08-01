package com.cg.entity.Item;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;


	public List<Item> listAll() {
		return repo.findAll();
	}

	public Item get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(Item item) {
		repo.save(item);

	}

	public void delete(Integer id) {
		repo.deleteById(id);

	}
}

package com.cg.entity.Item;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ItemController {
	@Autowired
	private ItemService service;
	//Retrieve All the the rows from Database
		@GetMapping("/item")
		public List<Item> list() {
			return service.listAll();

		}

	//Retrieve Specific Records from Database 
		@GetMapping("/item/{id}")
		public ResponseEntity get(@PathVariable Integer Id) {
			Item item = service.get(Id);
			return new ResponseEntity<Item>(item, HttpStatus.OK);
		}
			
		// CREATE a row in database
		@PostMapping("/item")
		public void add(@RequestBody Item item) {
			service.save(item);
		}
		//Update Operation - record in database
			@PutMapping("/item/{id}")
			public ResponseEntity<?> update(@RequestBody Item item, @PathVariable Integer Id) {
				try {
					Item existItem = service.get(Id);
					service.save(item);
					return new ResponseEntity<Item>(item, HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
			}

			// Delete Operation
			@DeleteMapping("/Item/{id}")
			public void delete(@PathVariable Integer id) {
				service.delete(id);
			}
		}

		
		
		




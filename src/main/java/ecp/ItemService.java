package ecp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemService {

	@Autowired
	private ItemRepository repo;

	public List<Item> listAll() {
		return repo.findAll();
	}

/*	@Query(value = "select  * from product p where p.brand=Nike",
			nativeQuery = true)*/
	public List<Item> listIems(int sousEch) {
		return repo.findItemByIt_So_ID(1);
	}



	public void save(Item item) {
		repo.save(item);
	}

	
	public Item get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}

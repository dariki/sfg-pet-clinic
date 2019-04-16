package br.com.ariki.sfgpetclinic.data.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.ariki.sfgpetclinic.data.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll() {
		return new HashSet<>(this.map.values());
	}
	
	T findById(ID id) {
		return this.map.get(id);
	}
	
	T save(T object) {
		object.setId(this.getNextId());
		this.map.put(object.getId(), object);
		
		return object;
	}
	
	void deleteById(ID id) {
		this.map.remove(id);
	}
	
	void delete(T object) {
		this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	private Long getNextId() {
		Long nextId = 0L;
		
		if(map.size() > 0) {
			nextId = Collections.max(map.keySet());
		}
		
		return nextId + 1;
	}
}

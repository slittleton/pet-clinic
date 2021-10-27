package com.example.petclinic.services.map;

import com.example.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);

    }
    T save(ID id, T object){
        System.out.println("===== SAVING");
        if(object != null){

            if(object.getId() == null){
                System.out.println("===== making and setting next id");
                object.setId(getNextId());
            }
            System.out.println("===== adding object id and object to the map");
            map.put(object.getId(), object);

        } else {
            throw new RuntimeException("===== Object cannot be null =========================");
        }

        System.out.println("===== Object Saved");
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));

    }
    private Long getNextId(){
        Long nextId = null;

      if(map.size()< 1){
          nextId = 1L;
      }else{
          nextId = Collections.max(map.keySet()) + 1;
      }
        return nextId;

    }
}

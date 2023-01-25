package com.glc.cricket;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CricketRepository implements ICricket<CricketPlayer> {

    private Map<Long, CricketPlayer> repository;
    
    public CricketRepository(){
        repository = new HashMap<>();
    }

    @Override
    public void save(CricketPlayer player) {
        repository.put(player.getId(), player);        
    }

    @Override
    public Collection<CricketPlayer> viewAll() {
        return repository.values();
    }

    @Override
    public void update(CricketPlayer player) {
        repository.put(player.getId(), player); 
    }

    @Override
    public void delete(CricketPlayer player) {
        repository.remove(player);
    }
    

    
}

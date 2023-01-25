package com.glc.cricket;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cricket")
public class CricketController {
    CricketRepository repo;
    public CricketController(){
        repo = new CricketRepository();
    }
    @GetMapping("/Players")
    public Collection<CricketPlayer> viewall(){
        return repo.viewAll();
    }
    @PostMapping("/AddPlayers")
    public String addPlayer(@RequestBody CricketPlayer cricketplayer){
        repo.save(cricketplayer);
        return "Player Added Successfully"+cricketplayer.getName();
    }
    @PutMapping("/AddPlayers")   
    public String updatePlayer(@RequestBody CricketPlayer cricketPlayer){
        repo.update(cricketPlayer);
        return "Player Updated Successfully"+cricketPlayer.getName();
    }
    @DeleteMapping("/AddPlayers/{id}")
    public String deletePlayer(@RequestBody CricketPlayer cricketPlayer){
        repo.delete(cricketPlayer);
        return "Player Deleted Successfully"+cricketPlayer.getName();
    }

}

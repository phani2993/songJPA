/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here 
package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import com.example.song.service.SongJpaService;
import com.example.song.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*; 

@RestController
public class SongController{ 
   
   @Autowired
    private SongJpaService songJpaService;



    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return songJpaService.getSongs();

    }


    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return songJpaService.getSongById(songId);
    }


    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songJpaService.addSong(song);

    }

   
    @PutMapping("/songs/{songId}")

    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song){
        return songJpaService.updateSong(songId,song);
    }

    @DeleteMapping("/songs/{songId}")
    public Song deleteSong(@PathVariable("songId") int songId){
        songJpaService.deleteSong(songId);
    }












    
}
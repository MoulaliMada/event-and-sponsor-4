/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import com.example.eventmanagementsystem.model.Event;
import com.example.eventmanagementsystem.model.Sponsor;
import com.example.eventmanagementsystem.service.SponsorJpaService;

@RestController
public class SponsorController {
    @Autowired
    public SponsorJpaService sponsorJpaService;

    @GetMapping("/events/sponsors")
    public ArrayList<Sponsor> getSponsor() {
        return sponsorJpaService.getSponsor();
    }

    @PostMapping("/events/sponsors")
    public Sponsor addSponsor(@RequestBody Sponsor sponsor) {
        return sponsorJpaService.addSponsor(sponsor);
    }

    @GetMapping("/events/sponsors/{sponsorId}")
    public Sponsor getSponsorById(@PathVariable("sponsorId") int sponsorId) {
        return sponsorJpaService.getSponsorById(sponsorId);
    }

    @PutMapping("/events/sponsors/{sponsorId}")
    public Sponsor updateSponsor(@PathVariable("sponsorId") int sponsorId, @RequestBody Sponsor sponsor) {
        return sponsorJpaService.updateSponsor(sponsorId, sponsor);
    }

    @DeleteMapping("/events/sponsors/{sponsorId}")
    public void deleteSponsorById(@PathVariable("sponsorId") int sponsorId) {
        sponsorJpaService.deleteSponsorById(sponsorId);
    }

    @GetMapping("/sponsors/{sponsorId}/events")
    public List<Event> getAllSponsorEvents(@PathVariable("sponsorId") int sponsorId) {
        return sponsorJpaService.getAllSponsorEvents(sponsorId);
    }

}

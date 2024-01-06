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
import com.example.eventmanagementsystem.service.EventJpaService;

@RestController
public class EventController {
    @Autowired
    public EventJpaService eventJpaService;

    @GetMapping("/events")
    public ArrayList<Event> getEvents() {
        return eventJpaService.getEvents();
    }

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event) {
        return eventJpaService.addEvent(event);
    }

    @GetMapping("/events/{eventId}")
    public Event getEventById(@PathVariable("eventId") int eventId) {
        return eventJpaService.getEventById(eventId);
    }

    @PutMapping("/events/{eventId}")
    public Event updateEvent(@PathVariable("eventId") int eventId, @RequestBody Event event) {
        return eventJpaService.updateEvent(eventId, event);
    }

    @DeleteMapping("/events/{eventId}")
    public void deleteEventById(@PathVariable("eventId") int eventId) {
        eventJpaService.deleteEventById(eventId);
    }

    @GetMapping("/events/{eventId}/sponsors")
    public List<Sponsor> getAllEventSponsors(@PathVariable("eventId") int eventId) {
        return eventJpaService.getAllEventSponsors(eventId);
    }
}

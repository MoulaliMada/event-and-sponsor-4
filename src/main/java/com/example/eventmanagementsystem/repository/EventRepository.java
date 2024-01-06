/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.eventmanagementsystem.model.Event;
import com.example.eventmanagementsystem.model.Sponsor;

public interface EventRepository {
    ArrayList<Event> getEvents();

    Event addEvent(Event event);

    Event getEventById(int eventId);

    Event updateEvent(int eventId, Event event);

    void deleteEventById(int eventId);

    List<Sponsor> getAllEventSponsors(int eventId);
}
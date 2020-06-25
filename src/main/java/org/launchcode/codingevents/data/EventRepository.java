package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Repository flags for SpringBoot that this is a class it should manage for us
public interface EventRepository extends CrudRepository<Event, Integer> {
}

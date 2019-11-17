package com.epam.sergeev.helpdesk.web;

import com.epam.sergeev.helpdesk.dao.category.CategoryDao;
import com.epam.sergeev.helpdesk.model.Greeting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sea
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, ur category is %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value = "/greeting")
    public List greeting(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {

        List<Greeting> resList = new ArrayList<>();
        resList.add(new Greeting(1, TEMPLATE));
        resList.add(new Greeting(2, "Holla"));
        resList.add(new Greeting(3, "Ave"));
        resList.add(new Greeting(4, "World :D"));

        return resList;
        //return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, "Sam"));
        //return categoryDao.getById(id);
    }
}

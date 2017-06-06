package com.mlhoste.magicpony.controller;

import com.mlhoste.magicpony.entity.Child;
import com.mlhoste.magicpony.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/enfant")
public class ChildController {

    @Autowired
    private ChildRepository childRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewChild(@RequestParam String firstName, @RequestParam String lastName) {
        Child child = new Child();
        child.setFirstName(firstName);
        child.setLastName(lastName);
        childRepository.save(child);

        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Child> getAllChildren() {

        return childRepository.findAll();
    }
}

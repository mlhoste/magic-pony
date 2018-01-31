package com.mlhoste.magicpony.controller;

import com.mlhoste.magicpony.entity.Child;
import com.mlhoste.magicpony.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/enfant/")
public class ChildController {

    @Autowired
    private ChildRepository childRepository;

    @GetMapping("{id}")
    public String displayChild(@PathVariable(value="id") Long childId, Model model) {
        model.addAttribute("child", childRepository.findOne(childId));
        model.addAttribute("editMode", false);

        return "child";
    }

    @PostMapping("delete/{id}")
    public String deleteChild(@PathVariable(value="id") Long childId, Model model) {
        childRepository.delete(childId);

        return "redirect:/enfant/all";
    }

    @GetMapping("edit/{id}")
    public String displayEditChild(@PathVariable(value="id") Long childId, Model model) {
        model.addAttribute("child", childRepository.findOne(childId));
        model.addAttribute("editMode", true);

        return "child";
    }

    @PostMapping("edit/{id}")
    public String editChild(@PathVariable(value="id") Long childId, Model model){
        Child child = childRepository.findOne(childId);
        //ToDo : get Child from IHM

        childRepository.save(child);

        model.addAttribute("child", child);

        return "child";
    }

    @GetMapping("all")
    public String displayAllChildren(Model model) {
        model.addAttribute("childrenList", childRepository.findAll());
        return "children";
    }
}

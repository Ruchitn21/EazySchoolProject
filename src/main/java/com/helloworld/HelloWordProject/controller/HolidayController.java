package com.helloworld.HelloWordProject.controller;

import com.helloworld.HelloWordProject.model.Holiday;
import com.helloworld.HelloWordProject.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class HolidayController {

    @Autowired
    private HolidayRepository holidayRepository;

    @GetMapping("/holidays/{display}")
    public String displayHolidays(@PathVariable String display, Model model) {

        if(null!=display && display.equals("all")){
            model.addAttribute("festival",true);
            model.addAttribute("federal",true);
        }
        else if(null!=display && display.equals("festival")){
            model.addAttribute("festival",true);
        }
        else if(null!=display && display.equals("federal")){
            model.addAttribute("federal",true);
        }

        Iterable<Holiday> holidays = holidayRepository.findAll();
        List<Holiday> holidayList = new ArrayList<>();
        for(Holiday holiday : holidays) {
            holidayList.add(holiday);
        }

        Holiday.Type[] types = Holiday.Type.values();

        for(Holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidayList.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }

        return "holidays.html";
    }
}

package com.pepon.pepos.controller;

import com.pepon.pepos.models.Pepo;
import com.pepon.pepos.service.PeposServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pepo")
@CrossOrigin
public class PeposController {

    @Autowired
    private PeposServices peposServices;

    @PostMapping("/add")
    public String add(@RequestBody Pepo pepo){
        peposServices.savePepo(pepo);
        return "se agrego el pepe";
    }

    @GetMapping("/getAll")
    public List<Pepo> list(){
        return peposServices.getAllPepo();
    }
}

package com.pepon.pepos.service;

import com.pepon.pepos.models.Pepo;
import com.pepon.pepos.repository.PeposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeposServicesImplement implements PeposServices{

    @Autowired
    private PeposRepository peposRepository;

    @Override
    public Pepo savePepo(Pepo pepo) {
        return peposRepository.save(pepo);
    }

    @Override
    public List<Pepo> getAllPepo() {
        return peposRepository.findAll();
    }
}

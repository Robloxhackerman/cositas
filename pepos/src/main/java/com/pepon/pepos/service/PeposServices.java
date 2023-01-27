package com.pepon.pepos.service;

import com.pepon.pepos.models.Pepo;

import java.util.List;

public interface PeposServices {
    public Pepo savePepo(Pepo pepe);

    public List<Pepo> getAllPepo();
}

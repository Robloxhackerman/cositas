package com.pepon.pepos.repository;

import com.pepon.pepos.models.Pepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeposRepository extends JpaRepository<Pepo, Integer> {
}

package com.example.manyToMany.repo;

import com.example.manyToMany.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Long> {
}

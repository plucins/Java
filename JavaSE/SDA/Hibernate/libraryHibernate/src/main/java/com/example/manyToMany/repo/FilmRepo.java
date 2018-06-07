package com.example.manyToMany.repo;

import com.example.manyToMany.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends JpaRepository<Film,Long> {
}

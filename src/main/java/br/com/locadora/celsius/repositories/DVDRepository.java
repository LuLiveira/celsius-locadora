package br.com.locadora.celsius.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.locadora.celsius.models.DVD;

@Repository
public interface DVDRepository extends JpaRepository<DVD, Long>{

}

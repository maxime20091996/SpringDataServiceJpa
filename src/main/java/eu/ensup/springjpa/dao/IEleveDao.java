package eu.ensup.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.springjpa.domaine.Eleve;

public interface IEleveDao extends JpaRepository<Eleve, Integer>{
	
}

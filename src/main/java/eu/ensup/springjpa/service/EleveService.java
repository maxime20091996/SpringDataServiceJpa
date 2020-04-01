package eu.ensup.springjpa.service;

import java.util.List;

import eu.ensup.springjpa.dao.IEleveDao;
import eu.ensup.springjpa.domaine.Eleve;

public class EleveService {

	private IEleveDao elevedao;

//	public EleveService(IEleveDao elevedao) {
//		super();
//		this.elevedao = elevedao;
//	}

	public EleveService() {
		super();
	}

	public IEleveDao getElevedao() {
		return elevedao;
	}

	public void setElevedao(IEleveDao elevedao) {
		this.elevedao = elevedao;
	}
	
	public void creerEleve(Eleve eleve) {
		elevedao.save(eleve);
	}
	
	public Eleve lireEleve(int id) {
		return elevedao.findOne(id);
	}

//	public List<Eleve> findByNom(String Nom){
//		return elevedao.findByNom(Nom);
//	}
//
//	public void initialisation() {
//		System.out.println("Creation de l'objet service");
//	}
//
//	public void destruction() {
//		System.out.println("Destruction de l'objet service");
//	}

}

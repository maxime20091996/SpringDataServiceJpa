package eu.ensup.springjpa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springjpa.domaine.Eleve;
import eu.ensup.springjpa.service.EleveService;

public class EleveServiceTest {

	private Eleve eleve;
	private EleveService eleveService;
	private ClassPathXmlApplicationContext appContext;
	
	@Test
	public void test() {
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		
		eleveService = (EleveService) appContext.getBean("eleveservice");
		eleve = new Eleve("CHEVALIER", "MAXIME");
		eleveService.creerEleve(eleve);
		
		assertEquals("CHEVALIER", eleveService.lireEleve(1).getNom());
				
	}
}

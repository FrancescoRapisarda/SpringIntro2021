package com.spring2021.SpringInitializr2021.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring2021.SpringInitializr2021.models.Studente;

@RestController					//Rest signfica che parla in JSON
@RequestMapping("/studente")
public class StudenteController {
	
	
	/*
	 * Sezione POST
	 */
//	@PostMapping("/inserisci")
//	public String inserisciStudente(@RequestBody Studente objStud) {		//RequestBody è il contenuto (oggetto STUDENTE) della richiesta inviata tramite JSON!
//		return objStud.toString();			//La RESPONSE  restituisce l'oggetto con il toString!
//	}
	
	
	//SOTTOFORMA DI JSON
	@PostMapping("/inserisci")
	public Studente inserisciStudente(@RequestBody Studente objStud) {
		return objStud;						//La RESPONSE  restituisce l'oggetto sottoforma di JSON!
	}
	
	
	@PostMapping("/lista")
	public List<Studente> listaStudenti() {
		
		Studente fra = new Studente("Davide", "Rapisarda", "Ingegneria Aerospaziale", "UNU000002");
		Studente val = new Studente("Valeria", "Verdi", "Ingegneria Aerospaziale", "UNU000003");
		Studente mar = new Studente("Mario", "Rossi", "Ingegneria Aerospaziale", "UNU000004");
		
		List<Studente> elenco = new ArrayList<Studente>();
		elenco.add(fra);
		elenco.add(val);
		elenco.add(mar);
		
		return elenco;		//sottoforma di array di oggetti in formato JSON!
	}
	
	@PostMapping("/importa")
	public String importazioneStudenti(@RequestBody List<Studente> elenco) {   //RequestBody è il contenuto (List di tipo STUDENTE) della richiesta inviata tramite JSON!
		
		for(int i=0; i<elenco.size(); i++) {
			Studente temp = elenco.get(i);
			System.out.println(temp.toString());
		}
		
		return "Tutto OK!";		//La RESPONSE  restituisce "tutto OK" e inserisce gli oggetti (passati in formato JSON) nell'elenco!
	}

}

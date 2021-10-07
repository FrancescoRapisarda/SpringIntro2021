package com.spring2021.SpringInitializr2021.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Spring va alla ricerca dei controller e fornisce 
 * a Tomcat tutti gli indirizzi per ricevere tutti i controller.
 */

//URL = Root della PATH: https://localhost:8081/ + SEGMENTS
//Segments: giovanni e mario (esempio)


@RestController							//Controller che parla in modalità REST. Tutto quello che passiamo in input e in output verrà TRADOTTO in JSON!
@RequestMapping("/hello")				//RequestMapping: QUESTO CONTROLLER E' SOLTANTO ACCESSIBILE TRAMITE IL SEGMENT (hello)
public class HelloWorldController {
	
	@GetMapping("/")						//ROTTA DI DEFAULT! Intercetto la REQUEST!
	public String testFunzionamento() {
		
		System.out.println("Tutto sta funzionando correttamente!");
		
		return "Funziono!";					//Restituisce la RESPONSE!
	}
	
	
	//PRIMA Applicazione REST
	/*
	 * Sezione GET - header ha una dimensione massima (forse 2kb di caratteri) Utilizziamo la GET per informazioni brevi e piccoli (mittente, destinatario e contenuto)
	 */
	
	@GetMapping("/giovanni")			//(questo SEGMENT adesso è accessibile soltanto in questo modo: https://localhost:8081/hello/giovanni
	public String salutaGiovanni() {
		
		return "Ciao Giovanni";
	}
	
	@GetMapping("/mario")				//(questo SEGMENT adesso è accessibile soltanto in questo modo: https://localhost:8081/hello/mario
	public String salutaMario() {
		
		return "Ciao Mario";
	}
	
	@GetMapping("/saluta/{nome}")		//(questo SEGMENT adesso è accessibile soltanto in questo modo: https://localhost:8081/hello/saluta/qualsiasinome
	public String salutaNome(@PathVariable String nome) {			//PathVariable indica una variabile di tipo String!
		return "Ciao " + nome;			//restituisce la RESPONSE!
	}
	
	@GetMapping("/saluta/{nome}/{cognome}")
	public String salutaNomeCognome(@PathVariable String nome, @PathVariable String cognome) {
		return "Ciao " + nome + ", " + cognome;
	}
	
	@GetMapping("/persona")		//http://localhost:8081/hello/persona?nomePer=Francesco&cognomePer=Rapisarda -- il GetMapping attiva la scansione dei parametri tramite ? (punto interrogativo)
	public String salutaPersona(@RequestParam(name ="nomePer") String nome, @RequestParam (name="cognomePer") String cognome) {
		return "Ciao " + nome + ", " + cognome;
	}
	
	
	@GetMapping("/test")				//Intercetto la REQUEST!
	public String getTest() {
		return "Il GET funziona!";		//Restituisce la RESPONSE!
	}
	
	
	
	/*
	 * Sezione POST
	 */
	@PostMapping("/test")
	public String testPost() {
		return "Il POST funziona!";
	}
	
	
	/*
	 *  Sezione Universale (le request di tipo REST possono essere lanciati con metodi GET e POST)
	 */
	@RequestMapping("/requesttest")
	public String testUniversale() {
		return "Sto ritornando qualcosa..";		//Restituisce la response di tipo REST con uno dei metodi di comunicazione sopracitati)
	}
	
}

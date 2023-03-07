package Kodlama.io.Devs.camp.webApi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.camp.business.abtstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.camp.entities.concretes.ProgrammingLanguage;
@RestController
@RequestMapping("api/programmingLanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguage>getAll(){
		
		return languageService.getAll();
	}
	@PostMapping("/add")
	public ResponseEntity<String> Add(@RequestBody ProgrammingLanguage language) throws Exception {
		try {
		   languageService.Add(language);
       return ResponseEntity.created(null).body("created");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
	@DeleteMapping("/delete/{id}")
	
	public void delete(@PathVariable("id")int id) {languageService.Delete(id);}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ProgrammingLanguage>update(@PathVariable("id")int id,@RequestBody ProgrammingLanguage language)throws Exception{
		try {
			return ResponseEntity.ok(languageService.update(id, language));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return ResponseEntity.badRequest().body(null);
		}
	}
	@GetMapping("/getbyid/{id}")
	
	public ProgrammingLanguage getById(@PathVariable("id")int id) {
		return languageService.getById(id);
	}
	
}

package Kodlama.io.Devs.camp.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.camp.business.abtstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.camp.dataaccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.camp.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository languageRepository;
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public void Add(ProgrammingLanguage language) throws Exception {
		// TODO Auto-generated method stub
		if (language.getName().isEmpty()) {
			throw new Exception("The programming languag name cannot be empty");
			
		}else {
		for(ProgrammingLanguage programmingLanguage:getAll()) {
			if(programmingLanguage.getName().equals(language.getName())) {
		 throw new Exception("The proggramming language is already exist!");
		}
		else {
			
		}
		
	}
		languageRepository.add(language);
		}
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		languageRepository.Delete(id);
	}

	@Override
	public ProgrammingLanguage update(int id, ProgrammingLanguage language) throws Exception {
		// TODO Auto-generated method stub
        for(ProgrammingLanguage programmingLanguages:getAll())   
        {
        	if(language.getName().equals(programmingLanguages.getName())) {
        		throw new Exception("The programming language is already exists!");
        	}
        }
		languageRepository.Update(id, language);
		return language;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return languageRepository.getById(id);
	}

	

}

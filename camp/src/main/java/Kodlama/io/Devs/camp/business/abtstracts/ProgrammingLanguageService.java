package Kodlama.io.Devs.camp.business.abtstracts;

import java.util.List;

import Kodlama.io.Devs.camp.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	 List<ProgrammingLanguage> getAll();
	 void Add(ProgrammingLanguage language)throws Exception;
	 void Delete(int id);
	 ProgrammingLanguage update(int id,ProgrammingLanguage language)throws Exception;
	 ProgrammingLanguage getById(int id);
	
}

package Kodlama.io.Devs.camp.dataaccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.camp.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage>getAll();
	public ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage language);
	ProgrammingLanguage Update(int id, ProgrammingLanguage language);
	void Delete(int id);
	
}

package Kodlama.io.Devs.camp.dataaccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;

import Kodlama.io.Devs.camp.dataaccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.camp.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage>programmingLanguages;
	
	
	
	public InMemoryProgrammingLanguage() {
		programmingLanguages=new ArrayList<>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Go"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Php"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		for(ProgrammingLanguage language:programmingLanguages) {
			if(language.getId()==id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(ProgrammingLanguage language) {
		// TODO Auto-generated method stub
		programmingLanguages.add(language);
		System.out.println("Proglama Dili Eklendi");
	}

	@Override
	public ProgrammingLanguage Update(int id, ProgrammingLanguage language) {
		// TODO Auto-generated method stub
		for(ProgrammingLanguage programmingLanguage:programmingLanguages) {
			if (programmingLanguage.getId()==id) {
				programmingLanguage.setName(language.getName());
			}
		}
		return language;
	}

	@Override
	public void Delete(int id) {		
         ProgrammingLanguage current =null;
         for(ProgrammingLanguage programmingLanguage:programmingLanguages) {
         if(programmingLanguage.getId()==id) {
        	 current =programmingLanguage;
         break;
         }
	}
         if(current !=null) {
        	 programmingLanguages.remove(current);
         }
	}
}

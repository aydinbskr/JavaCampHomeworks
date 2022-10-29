package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.ProgrammingLanguage;

@Repository //bu sınıf bir dataAccess nesnesidir
public class InMemoryPLRepository implements ProgrammingLanguageRepository {
	List<ProgrammingLanguage> languages;
	
	public InMemoryPLRepository() {
		languages=new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"C#"));
		languages.add(new ProgrammingLanguage(2,"JAVA"));
		languages.add(new ProgrammingLanguage(3,"PYTHON"));
		languages.add(new ProgrammingLanguage(4,"PHP"));
		languages.add(new ProgrammingLanguage(5,"C++"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}

	@Override
	public void delete(int id) {
		for(ProgrammingLanguage pl:languages)
		{
			if(pl.getId()==id)
			{
				languages.remove(pl);
				break;
			}
		}
	}

	@Override
	public void add(ProgrammingLanguage pl) {
		languages.add(pl);
	}

	@Override
	public void update(int id, ProgrammingLanguage pl) {
		for(ProgrammingLanguage item:languages)
		{
			if(item.getId()==id)
			{
				item=pl;
				break;
			}
		}
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage pl:languages)
		{
			if(pl.getId()==id)
			{
				return pl;
			}
		}
		return null;
	}

}

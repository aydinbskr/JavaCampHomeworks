package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.ProgrammingLanguage;

@Repository
public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	void delete(int id);
	void add(ProgrammingLanguage pl);
	void update(int id,ProgrammingLanguage pl);
	ProgrammingLanguage getById(int id);
}

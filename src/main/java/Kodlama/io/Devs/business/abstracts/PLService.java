package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.ProgrammingLanguage;

public interface PLService {
	List<ProgrammingLanguage> getAll();
	void delete(int id);
	void add(ProgrammingLanguage pl);
	void update(int id,ProgrammingLanguage pl);
	ProgrammingLanguage getById(int id);
}

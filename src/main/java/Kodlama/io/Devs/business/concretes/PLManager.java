package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.PLService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.ProgrammingLanguage;

@Service
public class PLManager implements PLService {
	private ProgrammingLanguageRepository plRepository;
	@Autowired
	public PLManager(ProgrammingLanguageRepository plRepository) {
		
		this.plRepository = plRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return plRepository.getAll();
	}

	@Override
	public void delete(int id) {
		plRepository.delete(id);
	}

	@Override
	public void add(ProgrammingLanguage pl) {
		plRepository.add(pl);
	}

	@Override
	public void update(int id, ProgrammingLanguage pl) {
		plRepository.update(id, pl);
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return plRepository.getById(id);
	}

}

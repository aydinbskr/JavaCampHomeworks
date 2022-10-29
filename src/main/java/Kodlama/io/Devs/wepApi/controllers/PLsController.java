package Kodlama.io.Devs.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.PLService;
import Kodlama.io.Devs.entities.ProgrammingLanguage;

@RestController
@RequestMapping("/api/pls")
public class PLsController {
	private PLService plService;

	@Autowired
	public PLsController(PLService plService) {
		
		this.plService = plService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll()
	{
		return plService.getAll();
	}
	@GetMapping("/getbyid/{id}")
	public ProgrammingLanguage getById(int id)
	{
		return plService.getById(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(int id)
	{
		plService.delete(id);
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody ProgrammingLanguage pl)
	{
		plService.update(id, pl);
	}
	@PostMapping("/add")
	public void update(@RequestBody ProgrammingLanguage pl)
	{
		plService.add(pl);
	}
}

package com.example.demo.Table.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Table.model.HelloModel;
import com.example.demo.Table.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	public HelloService pserv;
	
	//post mapping
	@PostMapping("/postPerson")
	public String postmatrix(@RequestBody HelloModel mr)
	{
		pserv.saveMatrix(mr);
		return "your data is successfully saved in the database";
	}
	//sorting ascending
	@GetMapping("/sortAsc/{name}")
	public List<HelloModel> sortasc(@PathVariable("name") String name)
	{
		return pserv.sortByAsc(name);
	}
	//sorting descending
			@GetMapping("/sortDesc/{name}")
			public List<HelloModel> sortdesc(@PathVariable("name") String name)
			{
				return pserv.sortByDesc(name);
			}
    //pagination
			@GetMapping("/pagination/{number}/{size}")
			public List<HelloModel> pagination(@PathVariable("number") int number,@PathVariable("size") int size)
			{
				return pserv.pagination(number, size);
			}
	//paginationAndSorting
			@GetMapping("/paginationAndSorting/{number}/{size}/{name}")
			public List<HelloModel> paginationAndSorting(@PathVariable("number")int number,@PathVariable("size")int size,@PathVariable("name") String name )
			{
				return pserv.paginationAndSorting(number, size, name);
			}
}
	
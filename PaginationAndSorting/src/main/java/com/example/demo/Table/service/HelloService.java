package com.example.demo.Table.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Table.model.HelloModel;
import com.example.demo.Table.repository.HelloRepository;

@Service

public class HelloService {
	@Autowired
	public HelloRepository prepo;

	//post the data
	public String saveMatrix(HelloModel m)
	{
		 prepo.save(m);
		 return "Data is saved successfully in the database";
		}
	 //sorting ascending
    public List<HelloModel> sortByAsc(String name)
	{
		return prepo.findAll(Sort.by(name).ascending());
	}
    //sorting descending
    public List<HelloModel> sortByDesc(String name)
	{
		return prepo.findAll(Sort.by(name).descending());
	}
    
    //pagination
    public List<HelloModel> pagination(int pageNu,int pageSize)
    {
    	Page<HelloModel> cont=prepo.findAll(PageRequest.of(pageNu, pageSize));
    	return cont.getContent();
    }
    //pagination and sorting
    public List<HelloModel> paginationAndSorting(int pageNu,int pageSize,String name)
    {
    	Page<HelloModel> cont1=prepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(name)));
    	return cont1.getContent();
    }
	
}
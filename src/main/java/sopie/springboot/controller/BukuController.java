/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopie.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sopie.springboot.domain.Buku;
import sopie.springboot.service.BukuDao;

/**
 *
 * @author sopie
 */
@RestController
@RequestMapping("/api/buku")
public class BukuController {
    @Autowired
    private BukuDao bukuDao;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Buku finBukuById(@PathVariable String id){
        return bukuDao.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Buku p){
        bukuDao.save(p);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Page<Buku> findAll(Pageable pageable){
        return bukuDao.findAll(pageable);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        Buku p = bukuDao.findOne(id);
        if (p != null){
            bukuDao.delete(p);
        }
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void edit(@PathVariable String id, @RequestBody Buku p){
         Buku buku = bukuDao.findOne(id);
         if (buku != null) {
             p.setId(id);
             bukuDao.save(p);
            
        }
            
        }
    }
    

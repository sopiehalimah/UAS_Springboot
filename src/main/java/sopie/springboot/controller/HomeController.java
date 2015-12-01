/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopie.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sopie.springboot.domain.Buku;

/**
 *
 * @author sopie
 */
@RestController

public class HomeController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World !";
    }
    
    @RequestMapping(value = 
            "/buku",method = RequestMethod.GET)
    Buku getBuku() {
        Buku p = new Buku();
        p.setJudul("Max Havelar");
        p.setJenis("Novel");
        
        return p;
    }
    
    @RequestMapping(value = "/ListBuku",method = RequestMethod.GET)
    List<Buku> getListBuku() {
        
        List<Buku> bukus = new ArrayList<Buku>();
        Buku p = new Buku();
        p.setJudul("Max Havelar");
        p.setJenis("Novel");
        
        Buku p1 = new Buku();
        p1.setJudul("Naruto");
        p1.setJenis("Komik");
        
        bukus.add(p);
        bukus.add(p1);
        
        return bukus;
    }
}

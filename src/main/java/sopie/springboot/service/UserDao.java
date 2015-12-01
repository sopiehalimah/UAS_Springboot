/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopie.springboot.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import sopie.springboot.domain.User;

/**
 *
 * @author sopie
 */
public interface UserDao extends PagingAndSortingRepository<User, String>{
    public User findByUsername(String username);
    
}

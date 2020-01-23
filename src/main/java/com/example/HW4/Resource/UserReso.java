package com.example.HW4.Resource;

import com.example.HW4.Model.Album;
import com.example.HW4.Model.User;
import com.example.HW4.Service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserReso {
    @Autowired
    private UserServ Serv;

    @GetMapping("/1")
    public List<User> getUser()
    {
       return Serv.getUser();
    }

    @PostMapping
    public User saveUser(@Validated @RequestBody User user)
    {
        return Serv.save(user);
    }

    @PutMapping("/{id}")
    public void editAlbum(@RequestBody User user, @PathVariable("id") String id)
    {
        user.setId(id);
        Serv.edit(user);
    }

}

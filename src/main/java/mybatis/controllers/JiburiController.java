package mybatis.controllers;

import mybatis.model.JiburiVar;
import mybatis.services.JiburiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/jiburi")
public class JiburiController {


    //Instance variable
    @Autowired
    JiburiServices jiburiServices;
    
    //Get
    @GetMapping("/")
    public ArrayList<JiburiVar> getJiburiMovies() {
        return jiburiServices.getAllJiburiMovies();
    }

    //Get
    @GetMapping("/{movie_name}")
   public JiburiVar selectAllMovieName(@PathVariable(value = "movie_name")String movie_name){
       return jiburiServices.selectAllMovieName(movie_name);
    }

    //Creating or Insert
    @PostMapping("/")
    public JiburiVar insert(@RequestBody JiburiVar jiburiVar) {
        return jiburiServices.insert(jiburiVar);

    }

  //Updating
    @PutMapping("/")
        public JiburiVar updateById(@RequestBody JiburiVar jiburiVar) {
            return jiburiServices.updateById(jiburiVar);
        }

        //Deleting
        @DeleteMapping("/")
        public JiburiVar deleteById(@RequestParam(value="id")int id){

            return jiburiServices.deleteById(id);
       }


    }



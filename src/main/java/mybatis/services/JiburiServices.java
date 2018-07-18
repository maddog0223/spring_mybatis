package mybatis.services;

import mybatis.mappers.JiburiMapper;
import mybatis.model.JiburiVar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JiburiServices {

    @Autowired
    JiburiMapper jiburiMapper;

    public ArrayList<JiburiVar> getAllJiburiMovies (){
        return jiburiMapper.getAllJiburiMovies();
    }


    //get all by movie name
    public JiburiVar selectAllMovieName(String moviename){

        return jiburiMapper.selectAllMovieName(moviename);
    }


    //post or insert
    public JiburiVar insert(JiburiVar jiburiVar){
        jiburiMapper.insert(jiburiVar);
        return jiburiMapper.selectAllMovieName(jiburiVar.getMovie_name());
    }

    //update by id
    public JiburiVar updateById(JiburiVar jiburiVar){

       jiburiMapper.updateById(jiburiVar);
       return jiburiMapper.getmoviename(jiburiVar.getMovie_name());
    }


    //delete all by id
    public JiburiVar deleteById(int id){
        jiburiMapper.deleteById(id);
    return jiburiMapper.getAllById(id);
    }

}


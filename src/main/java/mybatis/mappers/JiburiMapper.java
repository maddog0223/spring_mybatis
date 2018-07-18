package mybatis.mappers;

import mybatis.model.JiburiVar;
import mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface JiburiMapper {

    String GET_ACTIVE_USERS = "SELECT * FROM `mybatis-test`.JiburiMovies where active_id = 1";
    String GET_ALL_BY_MOVIE_ID = "SELECT * FROM `mybatis-test`.JiburiMovies where id = #{id}";
    String GET_BY_MOVIENAME = "SELECT * FROM `mybatis-test`.JiburiMovies where movie_name = #{movie_name}";
    String INSERT_POST = "INSERT INTO `mybatis-test`.JiburiMovies (movie_name, year_made, active_id)" +
            " VALUES (#{movie_name}, #{year_made}, #{active_id})";
    String UPDATE_BY_ID = "UPDATE `mybatis-test`.JiburiMovies SET" +
            " movie_name = #{movie_name}, year_made = #{year_made}, active_id = #{active_id} WHERE id = #{id}";
    String DELETE_BY_ID = "DELETE FROM `mybatis-test`.JiburiMovies" + " WHERE id = #{id}";
    String GET_BY_NAME = "SELECT * FROM `mybatis-test`.JiburiMovies where movie_name = #{movie_name} limit 1";



    @Select(GET_ACTIVE_USERS)
    public ArrayList<JiburiVar> getAllJiburiMovies();

    @Select(GET_ALL_BY_MOVIE_ID)
        public JiburiVar getAllById(int id);

    @Select(GET_BY_NAME)
    public  JiburiVar getmoviename(String movie_name);

    @Select(GET_BY_MOVIENAME)

    public JiburiVar selectAllMovieName(String moviename);

    @Insert(INSERT_POST)

    public int insert(JiburiVar jiburiVar);

    @Update(UPDATE_BY_ID)

    public int updateById(JiburiVar jiburiVar);

    @Delete(DELETE_BY_ID)

    public int deleteById(int id);

}

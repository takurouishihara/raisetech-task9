package net.raisetech.raisetechtask9.mapper;

import net.raisetech.raisetechtask9.Form.CreateForm;
import net.raisetech.raisetechtask9.entity.Movie;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Optional<Movie> findById(int id);

    @Select("SELECT * FROM movies WHERE publishedYear = #{publishedYear}")
    List<Movie> findByPublishedYear(Integer publishedYear);

    @Insert("INSERT INTO movies (name, publishedYear) values (#{name}, #{publishedYear})")
    void createMovie(CreateForm form);

    @Delete("DELETE FROM movies where id = #{id}")
    void deleteMovieId(int id);

    @Update("UPDATE movies SET name = #{name}, publishedYear = #{publishedYear} WHERE id = #{id}")
    void updateMovie(Movie movie);
}

package net.raisetech.raisetechtask9.mapper;

import net.raisetech.raisetechtask9.form.CreateForm;
import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.form.UpdateForm;
import org.apache.ibatis.annotations.*;
import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Optional<Movie> findById(int id);

    @Select("SELECT * FROM movies WHERE published_year = #{publishedYear}")
    List<Movie> findByPublishedYear(Integer publishedYear);

    @Insert("INSERT INTO movies (name, published_year) values (#{name}, #{publishedYear})")
    void createMovie(CreateForm form);

    @Delete("DELETE FROM movies where id = #{id}")
    void deleteMovieId(int id);

    @Update("UPDATE movies SET name = #{name}, published_year = #{publishedYear} WHERE id = #{id}")
    void updateMovie(int id, UpdateForm form);
}

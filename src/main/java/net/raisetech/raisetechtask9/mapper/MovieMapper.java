package net.raisetech.raisetechtask9.mapper;

import net.raisetech.raisetechtask9.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Optional<Movie> findById(int id);

    @Select("SELECT * FROM movies WHERE published_Year = #{published_Year}")
    Optional<Movie> findByPublished_Year(Integer published_Year);

    boolean isPresent();
}

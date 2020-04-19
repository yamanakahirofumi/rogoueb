package net.hero.rogueb.object.mapper;

import net.hero.rogueb.object.Ring;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ObjectMapper {

    List<Ring> findRing();

    Ring findById(int id);
}

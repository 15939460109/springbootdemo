package com.czg.mapper;

import com.czg.model.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestMapper {

    @Select("SELECT NAME, ROLE FROM GUEST")
    List<Guest> list();
}

package com.czg.mapper2;

import com.czg.model.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestMapper2 {

    @Select("SELECT NAME, ROLE FROM GUEST")
    List<Guest> list();
}

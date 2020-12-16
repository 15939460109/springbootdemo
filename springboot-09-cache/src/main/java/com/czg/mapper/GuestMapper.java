package com.czg.mapper;

import com.czg.model.Guest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GuestMapper {

    @Select("SELECT ID, NAME, ROLE FROM GUEST")
    List<Guest> list();

    @Select("SELECT ID, NAME, ROLE FROM GUEST WHERE ID = #{id}")
    Guest getGuestById(int id);

    @Update("UPDATE GUEST SET NAME = #{name}, ROLE = #{role} WHERE ID = #{id}")
    int UpdateGuest(Guest guest);

    @Delete("DELETE FROM GUEST WHERE ID = #{id}")
    void deleteGuest(Integer id);

    @Delete("DELETE FROM GUEST")
    void delete();
}

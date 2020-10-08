package com.czg.mapper;

import com.czg.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GuestMapper {

    List<Guest> list();
}

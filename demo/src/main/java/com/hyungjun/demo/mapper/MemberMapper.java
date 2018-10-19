package com.hyungjun.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hyungjun.demo.mbr.Member;

@Mapper
public interface MemberMapper {
	public int count();
}

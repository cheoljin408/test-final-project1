package org.kosta.cosmos.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.cosmos.domain.MemberDTO;

import java.util.List;

@Mapper
public interface MemberMapper {
    MemberDTO findByEmail(String email);

    void registerMember(MemberDTO memberDTO);

    void updateMember(MemberDTO memberDTO);
}

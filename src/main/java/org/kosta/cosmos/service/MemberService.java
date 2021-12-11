package org.kosta.cosmos.service;

import org.kosta.cosmos.domain.MemberDTO;
import org.kosta.cosmos.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberDTO> getMemberList() {
        List<MemberDTO> memberList = memberMapper.getMemberList();
        return memberList;
    }
}

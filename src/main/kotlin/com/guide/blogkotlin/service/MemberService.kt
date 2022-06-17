package com.guide.blogkotlin.service

import com.guide.blogkotlin.domain.Member
import com.guide.blogkotlin.repositroy.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberService {

    @Autowired
    private lateinit var memberRepository: MemberRepository

    fun join(member: Member) {
        memberRepository.save(member)
    }

    fun findOne(id: Long): Member {
        return memberRepository.findOne(id)
    }
}
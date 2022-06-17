package com.guide.blogkotlin.service

import com.guide.blogkotlin.domain.Member
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.transaction.Transactional

@SpringBootTest
@Transactional
@RunWith(SpringRunner::class)
class MemberServiceTest {

    @Autowired
    private lateinit var memberService: MemberService

    @Test
    fun 회원가입() {
        //given
        val member = Member("A", "a", "1234")

        //when
        memberService.join(member)

        //then
    }

}
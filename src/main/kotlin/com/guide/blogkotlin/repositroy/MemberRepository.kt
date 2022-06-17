package com.guide.blogkotlin.repositroy

import com.guide.blogkotlin.domain.Member
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class MemberRepository {

    @PersistenceContext
    private lateinit var em: EntityManager

    fun save(member: Member) {
        em.persist(member)
    }

    fun findOne(id: Long):Member {
        return em.find(Member::class.java, id)
    }

    fun findAll(): List<Member> {
        return em.createQuery("SELECT M FROM Member AS M", Member::class.java)
            .resultList
    }
}
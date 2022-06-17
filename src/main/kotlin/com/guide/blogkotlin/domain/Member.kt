package com.guide.blogkotlin.domain

import lombok.Getter
import lombok.Setter
import java.time.LocalDateTime
import javax.persistence.*

@Getter
@Entity
class Member(nickName: String, loginId: String, password: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private var id: Long? = null

    @Setter
    private var nickName: String
    @Setter
    private var password: String
    @Setter
    private var email: String? = null

    private var loginId: String
    private var createDate: LocalDateTime

    init {
        this.nickName = nickName
        this.loginId = loginId
        this.password = password
        this.createDate = LocalDateTime.now()
    }
}
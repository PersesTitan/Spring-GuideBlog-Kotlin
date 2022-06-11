package com.guide.blogkotlin.domain

import lombok.Getter
import lombok.NonNull
import lombok.Setter
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity @Getter
class Member(nickName: String, loginId: String, password: String, email: String) {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private var id:Long = 0

    @Setter @NonNull
    private var nickName: String
    @Setter @NonNull
    private var password: String

    @NonNull
    private val loginId: String
    @NonNull
    private val createDate: LocalDateTime

    @Setter
    private var email: String = ""

    init {
        this.nickName = nickName
        this.loginId = loginId
        this.password = password
        this.email = email
        this.createDate = LocalDateTime.now()
    }
}
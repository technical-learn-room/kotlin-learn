package com.me.research

import javax.persistence.*

@Entity
@Table(name = "person")
class SolutionTwoPerson(

    @Column(name = "name")
    val name: String,

    @Column(name = "age")
    val age: Int,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    fun eatRiceCakeSoup(): SolutionTwoPerson {
        val person = SolutionTwoPerson(
            name = name,
            age = age + 1,
        )
        person.id = id
        return person
    }
}
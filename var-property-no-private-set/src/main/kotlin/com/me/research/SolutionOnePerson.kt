package com.me.research

import javax.persistence.*

@Entity
@Table(name = "person")
class SolutionOnePerson(
    name: String,
    age: Int,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "name")
    var name = name
        private set

    @Column(name = "age")
    var age = age
        private set

    fun eatRiceCakeSoup() {
        age++
    }
}
@file:Suppress("DEPRECATION")

package com.pokemon.server

import org.hibernate.annotations.Entity
import org.springframework.data.annotation.Id


@Entity
data class Usuario(@Id var nombre: String, var pass: String) {
    val token = nombre + pass
}
package com.dxn.github.repos.common.models

sealed class Organization {
    object JETBRAINS : Organization() {
        override fun invoke() = "JetBrains"
    }

    object SQUARE : Organization() {
        override fun invoke() = "JetBrains"
    }

    object SLACK : Organization() {
        override fun invoke() = "slackhq"
    }

    abstract operator fun invoke(): String
}

val Organizations = listOf(
    Organization.JETBRAINS, Organization.SQUARE, Organization.SLACK
)
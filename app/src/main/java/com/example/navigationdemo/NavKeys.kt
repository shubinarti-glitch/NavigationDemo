package com.example.navigationdemo

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

/**
 * Навигационные ключи (§3 ЛР) — сериализуемые идентификаторы экранов.
 *
 *  HomeScreen     — data object (без параметров).
 *  WelcomeScreen  — data class с параметром name (передаётся между экранами).
 *  ProfileScreen  — data object.
 *
 * Все реализуют интерфейс NavKey и помечены @Serializable, чтобы Navigation 3
 * мог сохранять/восстанавливать back stack.
 */
@Serializable
data object HomeScreen : NavKey

@Serializable
data class WelcomeScreen(val name: String) : NavKey

@Serializable
data object ProfileScreen : NavKey

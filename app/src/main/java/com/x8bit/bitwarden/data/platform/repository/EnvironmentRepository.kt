package com.x8bit.bitwarden.data.platform.repository

import com.x8bit.bitwarden.data.platform.repository.model.Environment
import kotlinx.coroutines.flow.StateFlow

/**
 * Provides an API for observing and modifying environment state.
 */
interface EnvironmentRepository {
    /**
     * The currently set environment.
     */
    var environment: Environment

    /**
     * Emits updates that track [environment].
     */
    val environmentStateFlow: StateFlow<Environment>
}

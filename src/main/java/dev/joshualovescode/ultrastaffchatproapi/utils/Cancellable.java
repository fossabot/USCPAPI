/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
 */

package dev.joshualovescode.ultrastaffchatproapi.utils;

public interface Cancellable {
    public void setCancelled(Boolean cancelled);
    public boolean isCanceled();
}

package net.milkbowl.vault.economy;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Response object for Economy calls.
 *
 * @author Foulest
 * @project Vault
 */
@AllArgsConstructor
@SuppressWarnings({"unused"})
public class EconomyResponse {

    public final double amount;
    public final double balance;
    public final ResponseType type;
    public final String errorMessage;

    /**
     * Checks if the transaction was successful.
     *
     * @return Whether the transaction was successful.
     */
    public boolean transactionSuccess() {
        return this.type == EconomyResponse.ResponseType.SUCCESS;
    }

    @Getter
    @AllArgsConstructor
    public enum ResponseType {
        SUCCESS(1),
        FAILURE(2),
        NOT_IMPLEMENTED(3);

        private final int id;
    }
}

package net.milkbowl.vault.util.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to define commands for the CommandFramework.
 * This annotation should be applied to methods that represent commands.
 * This class is part of the CommandFramework.
 *
 * @author minnymin3
 * @see <a href="https://github.com/mcardy/CommandFramework">CommandFramework GitHub</a>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    /**
     * The name of the command. If it is a sub command then its values would be separated by periods.
     * i.e. a command that would be a sub command of test would be 'test.subcommandname'.
     */
    String name();

    /**
     * Gets the required permission of the command.
     */
    String permission() default "";

    /**
     * The message sent to the player when they do not have permission to execute it.
     */
    String noPermission() default "&cNo permission.";

    /**
     * A list of alternate names that the command is executed under.
     * See name() for details on how names work.
     */
    String[] aliases() default {};

    /**
     * The description that will appear in the /help of the command.
     */
    String description();

    /**
     * The usage that will appear in the /help of the command.
     */
    String usage();

    /**
     * If the command is available to players only.
     */
    boolean inGameOnly() default false;
}

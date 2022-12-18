import events.CalculateCommand;
import events.HelloEvent;
import events.HelpCommand;
import events.SamuraiQuoteCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {
    public static void main(String[] args) throws InterruptedException {

        JDA jda = JDABuilder.createLight("MTA1MjYxOTU5MDIxMzA2Mjc4Nw.GJhto0.Ja2CsExTOVp4sOETjOdwOyNz7oLynIYrJWTnoc", GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new SamuraiQuoteCommand())
                .addEventListeners(new CalculateCommand())
                .addEventListeners(new HelpCommand())
                .addEventListeners(new HelloEvent())
                .build().awaitReady();

        jda.updateCommands().addCommands(
                Commands.slash("calculate", "calculates some stuff.")
                        .addOption(OptionType.STRING, "first_number", "first number to calculate", true)
                        .addOption(OptionType.STRING, "operation", "operation", true)
                        .addOption(OptionType.STRING, "another_one", "second number to calculate", true),
                Commands.slash("wisdom", "Tell's you a wise quote."),
                Commands.slash("help", "All commands that bot can do.")
        ).queue();
    }
}


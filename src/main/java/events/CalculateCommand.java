package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public class CalculateCommand extends ListenerAdapter {
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("calculate")) {
            OptionMapping optionNum1 = event.getOption("first_number");
            String sNum1 = optionNum1.getAsString();
            double num1 = Double.parseDouble(sNum1);
            OptionMapping optionOperation = event.getOption("operation");
            String operation = optionOperation.getAsString();
            OptionMapping optionNum2 = event.getOption("another_one");
            String sNum2 = optionNum2.getAsString();
            double num2 = Double.parseDouble(sNum2);
            if ((operation.equals("/") || operation.equals(":")) && num2 == 0) {
                event.reply("ывхапзппщхзвыапщхзыващхзп он делит на ноль ыхзвапщхзывапщзх").queue();
            }
            switch (operation) {
                case "+" -> event.reply(String.valueOf(num1 + num2)).queue();

                case "-" -> event.reply(String.valueOf(num1 - num2)).queue();

                case "*" -> event.reply(String.valueOf(num1 * num2)).queue();

                case "/", ":" -> event.reply(String.valueOf(num1 / num2)).queue();

                case "^" -> event.reply(String.valueOf(Math.pow(num1, num2))).queue();

                default -> event.reply("Используй эти значки вместо своих пжпжп: +, -, *, /, ^").queue();
            }
        }
    }
}

package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class HelpCommand extends ListenerAdapter {
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("help")) {
            event.reply("/calculate - считает цифры;" + '\n' + "/wisdom - выдаёт крутую цитату;" + '\n' + "бот здоровается и прощается на привет/пока;" + '\n' + "Ит иснт компликейтед эт олл!").queue();
        }
    }
}




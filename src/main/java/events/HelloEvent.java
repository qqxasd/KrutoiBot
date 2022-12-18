package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        for (int i = 0; i < messageSent.length; i++) {
            if (messageSent[i].equalsIgnoreCase("Привет")) {
                event.getChannel().sendMessage("Здравствуй и процветай!").queue();
            }
            if (messageSent[i].equalsIgnoreCase("Пока")) {
                event.getChannel().sendMessage("Оставайтесь стильными.").queue();
            }
            if (messageSent[i].equalsIgnoreCase("Крутой")) {
                event.getChannel().sendMessage("Да, я крутой. Да, меня так зовут!").queue();
            }
        }
    }
}







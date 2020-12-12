import java.io.IOException;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) throws IOException {

        InMemoryContactsService contactsService = new InMemoryContactsService();

        MenuPanel menuPanel = new MenuPanel(
                new AddContactMenuAction(contactsService),
                new ReadAllContactsMenuAction(contactsService),
                new RemoveContactMenuAction(contactsService),
                new Exitprogram(contactsService),
                new SearchbypartnumberMenuAction(contactsService),
                new SearchbeginningnameMenuAction(contactsService));

        menuPanel.starting();

    }

}

import java.io.IOException;
import java.util.Scanner;

public class SearchbeginningnameMenuAction implements MenuAction {

    InMemoryContactsService inMemoryContactsService;

    public SearchbeginningnameMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {

        System.out.println(inMemoryContactsService.getContactsWhereNameStartsWith(getchoice()));

    }

    private String getchoice() {
        System.out.println("Введите часть имени для поиска");
        return new Scanner(System.in).nextLine();
    }

    private boolean checkname(String name, String choice) {

        return name.startsWith(choice);

    }

    @Override
    public String getName() {
        return "Поиск по началу имени";

    }

    @Override
    public boolean closeAfter() {
        return false;
    }

}

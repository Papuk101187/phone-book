import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SearchbypartnumberMenuAction implements MenuAction {

    InMemoryContactsService inMemoryContactsService;

    public SearchbypartnumberMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {
        System.out.println(inMemoryContactsService.getPartsPhone(getchoice()));


    }

    private String getchoice() {
        System.out.println("Введите часть номера телефона");
        return new Scanner(System.in).nextLine();
    }



    @Override
    public String getName() {
        return "Поиск по части номера";

    }

    @Override
    public boolean closeAfter() {
        return false;
    }


}

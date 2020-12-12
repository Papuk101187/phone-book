import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exitprogram implements MenuAction {
    InMemoryContactsService inMemoryContactsService;

    public Exitprogram(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {


    }

    @Override
    public String getName() {
        return "Выйти из програмы";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }






}

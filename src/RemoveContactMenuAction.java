import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveContactMenuAction implements MenuAction {

    InMemoryContactsService inMemoryContactsService;

    public RemoveContactMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {
        int index=0;
        System.out.println("Введите контакт который желаете удалить");
        BufferedReader nam =  new  BufferedReader ( new InputStreamReader(System.in)); // get data
        String name = nam.readLine();
        Contact[] contacts = inMemoryContactsService.getAll();

        for(int i=0;i<inMemoryContactsService.contactsList.size;i++){
            if(name.equals(contacts[i].name)){
                inMemoryContactsService.remove(i);

            }
        }






    }

    @Override
    public String getName() {
        return "Удалить контакт";

    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}

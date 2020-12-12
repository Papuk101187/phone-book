public class InMemoryContactsService implements ContactsService {

    ContactsList contactsList = new ContactsList();


    @Override
    public Contact[] getAll() {


        return contactsList.contacts;
    }

    @Override
    public void remove(int index) {
        contactsList.remove(index);

    }

    @Override
    public void add(Contact contact) {

        contactsList.add(contact);
    }

    @Override
    public Contact getContactsWhereNameStartsWith(String startOfName) {

        for (int i = 0; i < contactsList.size; i++) {

            if(contactsList.contacts[i].name.startsWith(startOfName)){
                return contactsList.contacts[i];
            };
        }


        return null;
    }

    @Override
    public Contact getPartsPhone(String startOfName) {

        for (int i = 0; i < contactsList.size; i++) {

            if(contactsList.contacts[i].phone.contains(startOfName)){
                return contactsList.contacts[i];
            };
        }

        return null;

    }


    public boolean check(Contact contact) {
        System.out.println(contact.phone);
        return contact.phone.matches("\\+380\\d{9}");
    }


}

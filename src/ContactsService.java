public interface ContactsService {


    Contact[] getAll();
    void remove(int index);
    void add(Contact contact);
    Contact getContactsWhereNameStartsWith(String startOfName);
    Contact getPartsPhone(String startOfName);


}

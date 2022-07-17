package com.yang.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Student
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 21:33
 * @Version v1.0
 **/

//@Getter
//@Setter
public class Student {
    private String name;
    private Addresss addresss;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String>  games;

    @Override
    public String toString() {
        return "Student{" +
                "addrss='" + name + '\'' +
                ", addresss=" + addresss +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Addresss getAddresss() {
        return addresss;
    }

    public void setAddresss(Addresss addresss) {
        this.addresss = addresss;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }
}

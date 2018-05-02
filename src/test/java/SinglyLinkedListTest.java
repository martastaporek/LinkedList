import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class SinglyLinkedListTest {

    private SinglyLinkedList <String> stringList;
    private SinglyLinkedList <Integer> intergerList;

    @BeforeEach
    void setup(){
        this.stringList = new SinglyLinkedList<>();
        this.intergerList = new SinglyLinkedList<>();
    }

    @Test
    void addToTheEnd(){
        int [] numbers = {1, 2, 3, 4};
        addIntegers(numbers);
        assertEquals(intergerList.toString(), "1 2 3 4 ");
    }

    @Test
    void checkLengthIncrementation(){
        String [] words = {"pies", "kot", "dom"};
        addStrings(words);
        assertEquals(words.length, this.stringList.getLength());
    }

    @Test
    void checkRemoveMethod(){
        String [] words = {"pies", "kot", "dom", "piwo"};
        addStrings(words);
        this.stringList.remove("pies");
        assertEquals("kot dom piwo ", this.stringList.toString());
    }

    @Test
    void checkInsetMethod(){
        int [] numbers = {4, 5, 6, 7};
        addIntegers(numbers);
        this.intergerList.remove(7);

        assertEquals(intergerList.toString(), "4 5 6 ");

    }

    void addIntegers(int [] numbers){
        for(int i = 0; i <  numbers.length; i++){
            intergerList.add(numbers[i]);
        }

    }

    void addStrings(String [] words){
        for(int i = 0; i <  words.length; i++){
            stringList.add(words[i]);
        }

    }


}
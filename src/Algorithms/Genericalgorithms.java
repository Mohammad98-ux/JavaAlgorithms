package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Genericalgorithms {
    //The sort() method provided by the collections framework is used to sort elements.
    public static void sort(){
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(1);
        Collections.sort(arrayList);
        //print arrayList after sorting
        System.out.printf("the array after sorting is%s\n",arrayList);

    }

    // It does just the opposite of the sorting.
    public static void shuffle(){
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(10);
        Collections.shuffle(arrayList);
        //print arraylist after shuffling
        //When we run the program, the shuffle() method will return a random output.
        System.out.printf("the array after shuffling is%s\n",arrayList);

    }
    public static void alg(){
        ArrayList<String> name=new ArrayList<>();
        name.add("Mohammad");
        name.add("Jack");
        name.add("Tala");
        name.add("Ali");
        //print arraylist
        System.out.println("the arraylist elements is:"+name);

        /*
    reverse() - reverses the order of elements
    copy() - creates a copy of elements from the specified source to destination
    swap() - swaps the position of two elements in a collection
    addAll() - adds all the elements of a collection to other collection
*/
        Collections.reverse(name);
        //print arraylist after reveseing.
        System.out.println("the arraylist after the revese is:"+name);


        Collections.swap(name,2,1);
        //print arraylist after swaping.
        System.out.println("the arraylist after swap(2,1) is:"+name);


        ArrayList<String> newName = new ArrayList<>();

        // Using addAll
        newName.addAll(name);
        System.out.println("ArrayList2 using addAll(): " + newName);


        Collections.copy(newName, name);
        System.out.println("ArrayList2 using copy(): " + newName);

    }
    //The binarySearch() method of the Java collections framework searches for the specified element.
    public static void search(){
        ArrayList<Integer> chars=new ArrayList<>();
        chars.add(4);
        chars.add(3);
        chars.add(1);

        int c=  Collections.binarySearch(chars,3);
        System.out.println("The position of 3 is " +c);
    }

    /*
    frequency() - returns the count of the number of times an element is present in the collection
    disjoint() - checks if two collections contain some common element
*/

    public static void Composition(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("ArrayList2: " + newNumbers);

        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);

    }
    public static void ExtremeValues(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}

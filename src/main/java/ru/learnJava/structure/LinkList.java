package ru.learnJava.structure;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link firstLink = first;
        first = firstLink.next;
        return firstLink;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if(current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if(current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }


    public void displayList() {
        System.out.println("List first-->last ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("End list");
    }

    public Link find(int key) {
        Link currect = first;
        while (currect.iData != key) {
            if(currect.next == null) {
                return null;
            } else {
                currect = currect.next;
            }
        }
        return currect;
    }
}

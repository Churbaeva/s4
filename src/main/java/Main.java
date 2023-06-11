import Homework4.QueueListMethod;
import Homework4.ReverseLinkedList;
public class Main {public static void main(String[] args) {
    System.out.println("Задание 1");
    ReverseLinkedList work1 = new ReverseLinkedList();
    work1.reversArr();
    System.out.println("Задание 2");
    QueueListMethod work2 = new QueueListMethod();
    work2.scanArr();
    work2.printArr();
    System.out.printf("\nВозращает первый элемент без удаления " + work2.first());
    System.out.printf("\nВозращает первый элемент с удалением " + work2.dequeue() + "\n");
    work2.printArr();}
}
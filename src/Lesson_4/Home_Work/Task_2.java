//В классе MyQueue реализуйте очередь для типа данных Integer с помощью
// LinkedList со следующими методами:
//
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
//getElements() - возвращает все элементы в очереди
//Пример
//
//
//queue.enqueue(1);
//queue.enqueue(10);
//queue.enqueue(15);
//queue.enqueue(5);
//System.out.println(queue.getElements());
//Результат:
//
//[1, 10, 15, 5]
//queue.dequeue();
//queue.dequeue();
//System.out.println(queue.getElements());
//Результат:
//
// [15, 5]
//System.out.println(queue.first());
//Результат:
//
//15

import java.util.*;

class MyQueue<T> {
    Queue<Integer> queue = new LinkedList<>();
    public void enqueue (T element) {
        queue.add((Integer)element);
    }
    public T dequeue () {
        queue.poll();
        return null;
    }
    public int first () {
        int firstEl;
        firstEl = queue.peek();
        return firstEl;
    }
    public List<Integer> getElements () {
        return (List<Integer>) queue;
    }
}

public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }
        System.out.println(queue.getElements());
        queue.dequeue();
        System.out.println(queue.first());
    }
}
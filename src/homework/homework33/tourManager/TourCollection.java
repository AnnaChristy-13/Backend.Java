package homework33.tourManager;
///Задача: Управление туристическими запросами
//
//Описание:
//Вам необходимо реализовать систему для управления туристическими запросами.
//Система должна позволять добавлять запросы в порядке их поступлений
//до достижения максимального размера коллекции (задается вами),
//и обрабатывать эти запросы по порядку их поступления.
//Каждый запрос представлен в виде строки (String), которая может содержать
//любую информацию, например, тип тура или спецификацию запроса клиента.
//Важной частью задачи является контроль за максимальным размером коллекции,
//чтобы предотвратить ее переполнение.
//
//Требования:
//
//- Реализовать класс `TourCollection` с полями:
//- `Коллекция<String> : коллекция для хранения туристических запросов.
//- `int maxSize`: максимально допустимый размер коллекции.
//
//- В классе `TourCollection` должны быть реализованы следующие методы:
//- Конструктор, принимающий `maxSize` и инициализирующий коллекцию.
//- `addRequest(String request)`: добавляет запрос, если текущий размер коллекции меньше `maxSize`.
//В противном случае выводит сообщение о том, что коллекция запросов полна.
//- `processRequest()`: обрабатывает (удаляет) первый запрос из коллекции, выводя сообщение об обработке.
//Если коллекция пуста, выводит сообщение о том, что список запросов пуст.
//- `getQueueSize()`: возвращает текущий размер очереди.
//
//- Геттеры для доступа к `коллекции` и `maxSize`.
//
//Эта система может быть использована в туристических агентствах для управления запросами клиентов,
//обеспечивая справедливое и эффективное обслуживание на основе принципа "первым пришел — первым обслужен".

import java.util.LinkedList;
import java.util.Queue;

public class TourCollection {

    private Queue<String> tourRequest;

    private int maxSize;

    public TourCollection(int maxSize) {
        this.tourRequest = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addRequest(String request) {

        if (tourRequest.size() < getMaxSize()) {
            tourRequest.add(request);
            System.out.println("Tour request is successfully added " + request);
        } else {
        System.out.println("Tour request collection is full.");

        }
    }

    public void processRequest(){

        if(!tourRequest.isEmpty()) {
            String currentTourRequest = tourRequest.poll();
            System.out.println("The tour request " + currentTourRequest +" is processing");
        }else{
            System.out.println("Tour request collection is empty");
        }
    }

    public int getQueueSize(){
        System.out.println("The size of collection: ");
        int sizeTourRequest = tourRequest.size();
        System.out.println(sizeTourRequest);
        return sizeTourRequest;
    }

}

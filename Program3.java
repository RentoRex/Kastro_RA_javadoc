
/** Класс выводит сообщение в консоль
 * @author Rafael Kastro 5030102/40004
 * @version 1.0
 */

class Message{
    
    /** Поле - сообщение*/
    public String message;

    /** Поле - количество повторений*/
    public int counter;

    /** Базовый конструктор класса;
     * Значения по умолчанию : message = "Hello, World!", counter = 1
    */
    Message(){
        message = "Hello, World!";
        counter = 1;
    }

    /**Конструктор с одним параметром
     *@param text Текст сообщения для вывода
     */
    Message(String text){
        this.message = text;
        this.counter = 1;
    }

    /** Коструктор с двумя параметрами 
     *@param text Текст сообщения для вывода
     *@param num Количество раз, которое сообщение необходимо вывести
     */
    Message(String text, int num){
        this.message = text;
        this.counter = num;
    }
    
    /**Вывод сообщения в косоль 
     *@since 1.0
     */
    void printMessage(){
        for(int i = 0; i<this.counter; i++){
            System.out.println(this.message);
        }
    }
}

class Program3{
    public static void main(String[] args){
        Message a = new Message();
        Message b = new Message("Hi, me!", 2);
        a.printMessage();
        b.printMessage();
    }
}
package pattern.template;

/**
 * @author leishifang
 * @date 2019-07-12 17:40
 */
public class Test {
    public static void main(String[] args) {
        IWorker worker = new Programmer();
        worker.whatADay();

        IWorker worker1 = new Saler();
        worker1.whatADay();

        IWorker worker2 = new Boss();
        worker2.whatADay();
    }
}

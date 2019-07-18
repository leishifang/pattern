package pattern.facade;

/**
 * @author leishifang
 * @date 2019-07-16 15:03
 */
public class Person {
    public void getName() {

    }

    public void getGender() {

    }

    public void getAge() {

    }

    /**
     * 提供一个统一接口，方便外部调用
     */
    public void getInfo() {
        getName();
        getGender();
        getAge();
    }
}

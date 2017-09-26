package genericTypes;

public class GenericType {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("1-----------");
        Dog dog1 = creatNew1(Dog.class);
        System.out.println(dog1.name + " is " + dog1.type+ "\n");

        System.out.println("2-----------");
        Animal ani1 = creatNew2(Cat.class);
        Cat cat1 = (Cat) ani1;
        System.out.println(cat1.name + " is " + cat1.type + "\n");

        System.out.println("3-----------");
        Object obj = creatNew3(Dog.class);
        Dog dog2 = (Dog) obj;
        System.out.println(dog1.name + " is " + dog2.type + "\n");

        System.out.println("4-----------");
        Object obj2 = creatNew4(Cat.class);
        Cat cat2 = (Cat) obj2;
        System.out.println(cat2.name + " is " + cat2.type + "\n");

        System.out.println("5-----------");
        Object obj3 = creatNew5(new Cat());
        Cat cat3 = (Cat) obj3;
        System.out.println(cat3.name + " is " + cat3.type + "\n");
    }

    /**
     * �˷�����һ���Ƿ������еķ��ͷ���������ΪClass<T>���ͣ����Դ����κ��࣬����Class<T>�������ں����ڲ������͹̶�Ϊ T�࣬ʹ��clazz.newInstance(),���ص�����ҲΪ�̶��� T ���͡�
     * ��: ����Dog.class, �����е� T �̶�ΪDog.class,�������ص���Dog���ͣ�����Ҫǿ��ת��ΪDog����
     * ����Ȼ��������������Ҳ������Object���ͣ�����û��Ҫ��
     */
    public static <T> T creatNew1(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        System.out.println(clazz);//��ӡ���崫������͡�
        return clazz.newInstance();
    }

    /**
     * �˷���������Class<? extends Animal>��ֻ�ܴ���Animal������������ͣ�������������ֻ������ΪAnimal��Object���ͣ�
     * �磺����Cat.class����������һ��Animal����������轫���������ǿ��ת��Ϊ���������(��Cat��)��
     */
    public static Animal creatNew2(Class<? extends Animal> clazz) throws IllegalAccessException, InstantiationException {
        System.out.println(clazz);//��ӡ���崫������͡�
        return clazz.newInstance();
    }

    /**
     * �˷���������Class���ɴ����κ��࣬�䷵��ֻ������ΪObject�����
     * �磺����Dog.class, ���ص���Object���͵Ķ�����ǿ��ת��ΪDog���͵Ķ���
     */
    public static Object creatNew3(Class clazz) throws IllegalAccessException, InstantiationException {
        System.out.println(clazz);//��ӡ���崫������͡�
        return clazz.newInstance();
    }

    /**
     * �������Class<?> �� ��һ���������� Class �����𻹲��Ǻ�������䷵��ֻ������ΪObject�����
     * �磺Cat.class, ���ص���Object���͵Ķ�����ǿ��ת��ΪCat���͵Ķ���
     */
    public static Object creatNew4(Class<?> clazz) throws IllegalAccessException, InstantiationException {
        System.out.println(clazz);//��ӡ���崫������͡�
        return clazz.newInstance();
    }

    /**
     * ����Object���͵Ķ��󣬷���Ҳ����ΪObject���͡�
     */
    public static Object creatNew5(Object object) {
        System.out.println(object.getClass());//��ӡ���崫������͡�
        return object;
    }
}

abstract class Animal {
    public String type = "type = animal ";
}

class Dog extends Animal {
    public String name = "name = gou";
}

class Cat extends Animal {
    public String name = "name = mao";
}

/**
 * ��Щ���������Ĳ���������ͬ���䷵�ص�����Ҳ��ȻҪ��֮��ͬ��
 **/

package ru.mephi.TRPO.AbstractFactoryPattern;


interface Donut {
    long getDonutPrice();
}

interface Cake {
    long getCakePrice();
}

interface Pancake {
    long getPancakePrice();
}

interface InteAbsFactory {
    Donut getDonut();

    Cake getCake();

    Pancake getPancake();
}

class BelDonutImpl implements Donut {

    public long getDonutPrice() {
        return 1000;
    }
}

class BelCakeImpl implements Cake {
    public long getCakePrice() {
        return 3000;
    }
}

class BelPancakeImpl implements Pancake {
    public long getPancakePrice() {
        return 2000;
    }
}

class BelBakeryPriceAbsFactory implements InteAbsFactory {
    public Donut getDonut() {
        return new BelDonutImpl();
    }

    public Cake getCake() {
        return new BelCakeImpl();
    }

    public Pancake getPancake() {
        return new BelPancakeImpl();
    }
}

class RuDonutImpl implements Donut {

    public long getDonutPrice() {
        return 10000;
    }
}

class RuCakeImpl implements Cake {
    public long getCakePrice() {
        return 30000;
    }
}

class RuPancakeImpl implements Pancake {
    public long getPancakePrice() {
        return 20000;
    }
}

class RuBakeryPriceAbsFactory implements InteAbsFactory {
    public Donut getDonut() {
        return new RuDonutImpl();
    }

    public Cake getCake() {
        return new RuCakeImpl();
    }

    public Pancake getPancake() {
        return new RuPancakeImpl();
    }
}


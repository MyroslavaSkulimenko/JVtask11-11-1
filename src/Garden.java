public abstract class Garden  implements Season{
    //Садовод-любитель. Выращиваем растения в течение нескольких лет и
    // смотрим что будет
    //задача: выращиваем деревья и цветы. Каждый из этих видов имеет
    // следующие характеристики: displayName,height, age. Каждый из них вырастает за сезон на
    // разную высоту, одинаковую для всех деревьев и всех цветов.
    // Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда одиниково.
    // Сезон для цветов начинается весной, зимой они не растут, летом они не растут а цветут,
    // осенью их срезают.
    // Для деревьев: сезон начинается весной, зимой они не растут, летом растут, осенью не растут.
    // В классе Garden  создать метод growPlants, в котором подробно отражен процесс роста двух растений
    // в течение нескольких лет. Что происходит зимой, летом и весной, их размер в каждый сезон и
    // какого они размера и возраста в конце.
    // Решить задачу через абстрактные классы
protected String name;
protected int age;
protected int heigth;
    public     int growth;
    public Garden(String name, int age, int heigth) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }


    public abstract String growPlants();


   }











public class Flowers extends Garden implements Season {
    public     int growth = 50;

    public Flowers(String name, int age, int heigth) {
        super(name, age, heigth);

    }

    @Override
    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                '}';
    }

    public int getGrowth() {
        return growth;
    }

    @Override
    public void setGrowth(int growth) {
        this.growth = growth;
    }
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
    public int getHeigth() {
        return heigth;
    }
    @Override
    public String spring() {
        setHeigth(heigth+growth);
        return "Весной  рост  "+ name +" составил - " +heigth+"\n";
    }

    @Override
    public String summer() {
        return "Летом "+ name +" только цветет "+"\n";
    }

    @Override
    public String autumn() {
        setHeigth(0);
        return "Осенью  "+ name +" срезают "+ heigth+ " \n";
    }


    @Override
    public String growPlants() {
        return spring()+summer()+autumn()+ Season.winter();
    }
}

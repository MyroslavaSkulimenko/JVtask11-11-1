public  class Woods extends Garden implements Season{
    public   int growth = 15;

    public Woods(String name, int age, int heigth, int growth) {
        super(name, age,heigth);
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Woods{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                '}';
    }

    public int getGrowth() {
        return growth;
    }


    public     String spring(){
        setHeigth(growth+heigth);
        return "Весной  рост  "+ name +" составил - " +(heigth)+"\n";
    }
   public   String summer(){
       setHeigth(5+heigth);
        return "Летом  рост  "+ name +" составил - "+(heigth) +"\n";
    }
    public String autumn(){
        return "Осенью  рост  "+ name +" составил - "+ (heigth) +"\n";
    }

    @Override
    public String growPlants() {
        return spring()+summer()+autumn()+ Season.winter();
    }

}



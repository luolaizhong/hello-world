package inno;

public class Singer {
    private String name;

    public Singer(String name) {
        this.name = name;
    }

    @Music()
    public void sing(Song song) {
        System.out.println(name + " 开始唱 " + song.getName());
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                '}';
    }
}

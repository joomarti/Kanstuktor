public class MyClas {
    String atynyz;
    String tolyk_atygyz;
    String jakshy_korgon_tamaguguz;
    int age;


    public MyClas(String atynyz, String tolyk_atygyz, String jakshy_korgon_tamaguguz) {
        this.atynyz = atynyz;
        this.tolyk_atygyz = tolyk_atygyz;
        this.jakshy_korgon_tamaguguz = jakshy_korgon_tamaguguz;
    }
public MyClas (){

}

    @Override
    public String toString() {
        return "MyClas{" +
                "atynyz='" + atynyz + '\'' +
                ", tolyk_atygyz='" + tolyk_atygyz + '\'' +
                ", jakshy_korgon_tamaguguz='" + jakshy_korgon_tamaguguz + '\'' +
                ", age=" + age +
                '}';
    }

    public MyClas(String atynyz, String tolyk_atygyz, String jakshy_korgon_tamaguguz, int age) {
        this.atynyz = atynyz;
        this.tolyk_atygyz = tolyk_atygyz;
        this.jakshy_korgon_tamaguguz = jakshy_korgon_tamaguguz;
        this.age = age;

    }
}





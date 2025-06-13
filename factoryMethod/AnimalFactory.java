public class AnimalFactory {
    public static Animal criarAnimal(String type) {
        if (type.equals("cachorro")){
            return new Cachorro();
        } 
        return null;
    }
}
